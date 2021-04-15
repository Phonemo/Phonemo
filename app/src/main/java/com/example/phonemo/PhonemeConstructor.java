package com.example.phonemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.LinkedList;

import static java.lang.Integer.parseInt;

public class PhonemeConstructor extends AppCompatActivity {

    private String symbol = "";
    //private StringBuilder word = new StringBuilder();
    private LinkedList<String> wordList = new LinkedList<>();
    private int empty=0;
    private int index = 0;


    /**
     * On start, the initial phoneme constructor page is built
     * @param savedInstanceState -
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phoneme_constructor);
    }

    public void phonemeOnClick(View v) {
        symbol = ((Button) v).getText().toString().substring(0, 3).trim();

        //Button button = (Button) v;
        v.setBackgroundColor(ContextCompat.getColor(PhonemeConstructor.this, R.color.buttonhighlight));

        String phonemeId = (v.getResources().getResourceName(v.getId()));
        String phonemeNumber = phonemeId.substring(30);

        String fileName = "R.raw.phonemeaudio"+phonemeNumber;

        MediaPlayer mediaPlayer = MediaPlayer.create(PhonemeConstructor.this, Uri.parse(fileName));
        mediaPlayer.start();

        //TextView noname = (TextView) findViewById(R.id.PhonemeDisplay);
        //noname.setText(phonemeNumber);
        //Log.v("Phoneme", "number"+phonemeNumber);
        //play sound of phoneme
    }

    /**public void phonemeDoubleOnClick(View v) {
    /**
     * Plays the sound of the selected two-character phoneme upon a single press on the respective phoneme's button and
     * displays the number of the phoneme in the phonemic workspace
     * @param v the phoneme button

    public void phonemeDoubleOnClick(View v) {
        symbol = ((Button) v).getText().toString().substring(0, 2);
        String phonemeId = (v.getResources().getResourceName(v.getId()));
        String phonemeNumber = phonemeId.substring(30);
        int number = Integer.parseInt(phonemeNumber);

        TextView noname = (TextView) findViewById(R.id.PhonemeDisplay);
        noname.setText(phonemeNumber);
        //play sound of phoneme
    }

    /**
     * Plays the sound of the selected three-character phoneme upon a single press on the respective phoneme's button and
     * displays the number of the phoneme in the phonemic workspace
     * @param v the phoneme button

    public void phonemeTripleOnClick(View v) {
        symbol = ((Button) v).getText().toString().substring(0, 3);
        String phonemeId = (v.getResources().getResourceName(v.getId()));
        String phonemeNumber = phonemeId.substring(30);
        int number = Integer.parseInt(phonemeNumber);

        TextView noname = (TextView) findViewById(R.id.PhonemeDisplay);
        noname.setText(phonemeNumber);
        //play sound of phoneme
    }**/

    /**
     * The last phoneme symbol that was selected will be added to the phonemic workspace
     * @param v the add button
     */
    public void addButtonOnClick(View v) {
        wordList.add(index++, symbol); //Fun Fact: you can increment and use index at the same time
        constructWord();
        empty++;
    }

    /**
     * Moves the cursor to the left
     * @param v the left arrow button
     */
    public void leftArrowOnClick(View v) {
        if (index != 0)
            index--;
    }

    /**
     * Moves the cursor to the right
     * @param v the right arrow button
     */
    public void rightArrowOnClick(View v) {
        if (index < symbol.length())
            index++;
    }

    /**
     * Deletes the previous character of wherever the cursor is
     * @param v the backspace button
     */
    public void backspaceOnClick(View v) {
        if (wordList.size() > 0 && index>0) {
            wordList.remove(--index); //Will first decrement index THEN run the deleteCharAt function. At least, it should do that...
            constructWord();
            empty--;
        }
    }

    /**
     * Displays the phonemic list in the text view box
     */
    public void constructWord() {
        String phonemicWord = "";
        TextView noname = findViewById(R.id.PhonemeDisplay);
        for (String str : wordList) {
            phonemicWord += str;
        }
        noname.setText(phonemicWord);
    }

    /**
     * Starts the grapheme constructor activity if the phonemic list/text view box is not empty
     * @param v the done button
     */
    public void doneButtonOnClick(View v){
        Intent intent = new Intent(this, GraphemeConstructor.class);
        intent.putExtra("phonemeWord",wordList);
        if (empty>0)
            startActivity(intent);
        else
            Snackbar.make(findViewById(R.id.DoneButton), R.string.noPhonemeError,
                    Snackbar.LENGTH_SHORT)
                    .show();
    }

}

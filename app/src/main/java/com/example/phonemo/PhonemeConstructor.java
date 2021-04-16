package com.example.phonemo;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;

public class PhonemeConstructor extends AppCompatActivity implements View.OnClickListener {

    private String symbol = "";
    private LinkedList<String> wordList = new LinkedList<>();
    private int empty=0;
    private int index = 0;


    /**
     * On start, the initial phoneme constructor page is built
     * @param savedInstanceState -
     */
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phoneme_constructor);

        Button phoneme01 = findViewById(R.id.Phoneme01);
        Button phoneme02 = findViewById(R.id.Phoneme02);
        Button phoneme03 = findViewById(R.id.Phoneme03);
        Button phoneme04 = findViewById(R.id.Phoneme04);
        Button phoneme05 = findViewById(R.id.Phoneme05);
        Button phoneme06 = findViewById(R.id.Phoneme06);
        Button phoneme07 = findViewById(R.id.Phoneme07);
        Button phoneme08 = findViewById(R.id.Phoneme08);
        Button phoneme09 = findViewById(R.id.Phoneme09);
        Button phoneme10 = findViewById(R.id.Phoneme10);
        Button phoneme11 = findViewById(R.id.Phoneme11);
        Button phoneme12 = findViewById(R.id.Phoneme12);
        Button phoneme13 = findViewById(R.id.Phoneme13);
        Button phoneme14 = findViewById(R.id.Phoneme14);
        Button phoneme15 = findViewById(R.id.Phoneme15);
        Button phoneme16 = findViewById(R.id.Phoneme16);
        Button phoneme17 = findViewById(R.id.Phoneme17);
        Button phoneme18 = findViewById(R.id.Phoneme18);
        Button phoneme19 = findViewById(R.id.Phoneme19);
        Button phoneme20 = findViewById(R.id.Phoneme20);
        Button phoneme21 = findViewById(R.id.Phoneme21);
        Button phoneme22 = findViewById(R.id.Phoneme22);
        Button phoneme23 = findViewById(R.id.Phoneme23);
        Button phoneme24 = findViewById(R.id.Phoneme24);
        Button phoneme25 = findViewById(R.id.Phoneme25);
        Button phoneme26 = findViewById(R.id.Phoneme26);
        Button phoneme27 = findViewById(R.id.Phoneme27);
        Button phoneme28 = findViewById(R.id.Phoneme28);
        Button phoneme29 = findViewById(R.id.Phoneme29);
        Button phoneme30 = findViewById(R.id.Phoneme30);
        Button phoneme31 = findViewById(R.id.Phoneme31);
        Button phoneme32 = findViewById(R.id.Phoneme32);
        Button phoneme33 = findViewById(R.id.Phoneme33);
        Button phoneme34 = findViewById(R.id.Phoneme34);
        Button phoneme35 = findViewById(R.id.Phoneme35);
        Button phoneme36 = findViewById(R.id.Phoneme36);
        Button phoneme37 = findViewById(R.id.Phoneme37);
        Button phoneme38 = findViewById(R.id.Phoneme38);
        Button phoneme39 = findViewById(R.id.Phoneme39);
        Button phoneme40 = findViewById(R.id.Phoneme40);
        Button phoneme41 = findViewById(R.id.Phoneme41);
        Button phoneme42 = findViewById(R.id.Phoneme42);
        Button phoneme43 = findViewById(R.id.Phoneme43);
        Button phoneme44 = findViewById(R.id.Phoneme44);

        phoneme01.setOnClickListener(this);
        phoneme02.setOnClickListener(this);
        phoneme03.setOnClickListener(this);
        phoneme04.setOnClickListener(this);
        phoneme05.setOnClickListener(this);
        phoneme06.setOnClickListener(this);
        phoneme07.setOnClickListener(this);
        phoneme08.setOnClickListener(this);
        phoneme09.setOnClickListener(this);
        phoneme10.setOnClickListener(this);
        phoneme11.setOnClickListener(this);
        phoneme12.setOnClickListener(this);
        phoneme13.setOnClickListener(this);
        phoneme14.setOnClickListener(this);
        phoneme15.setOnClickListener(this);
        phoneme16.setOnClickListener(this);
        phoneme17.setOnClickListener(this);
        phoneme18.setOnClickListener(this);
        phoneme19.setOnClickListener(this);
        phoneme20.setOnClickListener(this);
        phoneme21.setOnClickListener(this);
        phoneme22.setOnClickListener(this);
        phoneme23.setOnClickListener(this);
        phoneme24.setOnClickListener(this);
        phoneme25.setOnClickListener(this);
        phoneme26.setOnClickListener(this);
        phoneme27.setOnClickListener(this);
        phoneme28.setOnClickListener(this);
        phoneme29.setOnClickListener(this);
        phoneme30.setOnClickListener(this);
        phoneme31.setOnClickListener(this);
        phoneme32.setOnClickListener(this);
        phoneme33.setOnClickListener(this);
        phoneme34.setOnClickListener(this);
        phoneme35.setOnClickListener(this);
        phoneme36.setOnClickListener(this);
        phoneme37.setOnClickListener(this);
        phoneme38.setOnClickListener(this);
        phoneme39.setOnClickListener(this);
        phoneme40.setOnClickListener(this);
        phoneme41.setOnClickListener(this);
        phoneme42.setOnClickListener(this);
        phoneme43.setOnClickListener(this);
        phoneme44.setOnClickListener(this);

        AudioManager audioManager = (AudioManager) getSystemService(this.AUDIO_SERVICE);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);

    }

    /**
     * When a phoneme button is clicked, the symbol is generated and the sound is played
     * @param v the phoneme button
     */
    @Override
    public void onClick(View v) {
        symbol = ((Button) v).getText().toString().substring(0, 3).trim();

        /*Button button = (Button) v;
        v.setBackgroundColor(ContextCompat.getColor(PhonemeConstructor.this, R.color.buttonhighlight));

        String phonemeId = (v.getResources().getResourceName(v.getId()));
        String phonemeNumber = phonemeId.substring(30);
        String fileName = "R.raw.phonemeaudio"+phonemeNumber;*/

        switch (v.getId()) {
            case R.id.Phoneme01:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio01);
                break;

            case R.id.Phoneme02:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio02);
                break;

            case R.id.Phoneme03:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio03);
                break;

            case R.id.Phoneme04:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio04);
                break;

            case R.id.Phoneme05:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio05);
                break;

            case R.id.Phoneme06:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio06);
                break;

            case R.id.Phoneme07:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio07);
                break;

            case R.id.Phoneme08:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio08);
                break;

            case R.id.Phoneme09:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio09);
                break;

            case R.id.Phoneme10:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio10);
                break;

            case R.id.Phoneme11:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio11);
                break;

            case R.id.Phoneme12:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio12);
                break;

            case R.id.Phoneme13:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio13);
                break;

            case R.id.Phoneme14:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio14);
                break;

            case R.id.Phoneme15:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio15);
                break;

            case R.id.Phoneme16:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio16);
                break;

            case R.id.Phoneme17:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio17);
                break;

            case R.id.Phoneme18:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio18);
                break;

            case R.id.Phoneme19:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio19);
                break;

            case R.id.Phoneme20:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio20);
                break;

            case R.id.Phoneme21:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio21);
                break;

            case R.id.Phoneme22:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio22);
                break;

            case R.id.Phoneme23:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio23);
                break;

            case R.id.Phoneme24:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio24);
                break;

            case R.id.Phoneme25:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio25);
                break;

            case R.id.Phoneme26:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio26);
                break;

            case R.id.Phoneme27:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio27);
                break;

            case R.id.Phoneme28:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio28);
                break;

            case R.id.Phoneme29:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio29);
                break;

            case R.id.Phoneme30:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio30);
                break;

            case R.id.Phoneme31:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio31);
                break;

            case R.id.Phoneme32:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio32);
                break;

            case R.id.Phoneme33:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio33);
                break;

            case R.id.Phoneme34:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio34);
                break;

            case R.id.Phoneme35:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio35);
                break;

            case R.id.Phoneme36:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio36);
                break;

            case R.id.Phoneme37:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio37);
                break;

            case R.id.Phoneme38:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio38);
                break;

            case R.id.Phoneme39:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio39);
                break;

            case R.id.Phoneme40:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio40);
                break;

            case R.id.Phoneme41:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio41);
                break;

            case R.id.Phoneme42:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio42);
                break;

            case R.id.Phoneme43:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio43);
                break;

            case R.id.Phoneme44:
                mediaPlayer = MediaPlayer.create(this, R.raw.phonemeaudio44);
                break;

            default:
                break;
        }

        mediaPlayer.start();
        //mediaPlayer.release();
    }

    /**public void phonemeDoubleOnClick(View v) {
        symbol = ((Button) v).getText().toString().substring(0, 2);
        String phonemeId = (v.getResources().getResourceName(v.getId()));
        String phonemeNumber = phonemeId.substring(30);
        int number = Integer.parseInt(phonemeNumber);

        TextView noname = (TextView) findViewById(R.id.PhonemeDisplay);
        noname.setText(phonemeNumber);
        //play sound of phoneme
    }

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
        StringBuilder phonemicWord = new StringBuilder();
        TextView noname = findViewById(R.id.PhonemeDisplay);
        for (String str : wordList) {
            phonemicWord.append(str);
        }
        noname.setText(phonemicWord.toString());
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
        //intent.putExtra("phonemeWord",wordList);
        startActivity(intent);
    }



}

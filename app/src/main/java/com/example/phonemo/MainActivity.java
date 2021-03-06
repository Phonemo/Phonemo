package com.example.phonemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * The main activity displays upon app load and has a button for the user to start the app
 */
public class MainActivity extends AppCompatActivity {

    /**
     * This runs when the app loads
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The raw data is loaded and read by the app
     */
    @Override
    protected void onStart(){
        super.onStart();
        readPhonemeData();
        final Controller aController = (Controller) this.getApplicationContext();
        
        for(GraphemeClass q: aController.getGraphemes())
            Log.v("Main Activity", "symbols: " + q.getSymbol() + " graphemes: " + q.getGraphemes()[0]);
    }

    /**
     * The graphemes are put into separate instances of a GraphemeClass based on matching phoneme
     */
    private void readPhonemeData() {
        InputStream is = getResources().openRawResource(R.raw.phonemicdataaquisition);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        final Controller aController = (Controller) this.getApplicationContext(); //gets the global controller class object

        String line = " ";

        try {
            while((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                GraphemeClass graph = new GraphemeClass(fields);
                aController.addGrapheme(graph);
               Log.wtf("GraphemeConstructor", "check"+aController.getGraphemesAtPlace(aController.getGraphemes().size() - 1).getSymbol() + ", " + aController.getGraphemesAtPlace(aController.getGraphemes().size()-1).getGraphemes());
            }
        }
        catch (IOException e) {
            Log.wtf("GraphemeConstructor", "Error Reading Data on Line" + line);
        }
    }

    /**
     * Starts the Word Creation Activity
     * @param v the start button
     */
    public void onCreation(View v) {
        Intent intent = new Intent(this, PhonemeConstructor.class);
        startActivity(intent);
    }
}

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

public class MainActivity extends AppCompatActivity {

    private ArrayList<GraphemeClass> graphemeArray = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
        super.onStart();

        readPhonemeData();

        final Controller aController = (Controller) this.getApplicationContext();

        for(GraphemeClass q: aController.getGraphemes()){
            Log.v("Main Activity", "symbols: "+q.getSymbol() +" graphemes: "+ q.getGraphemes());

        }
    }

    private void readPhonemeData(){
        InputStream is = getResources().openRawResource(R.raw.phonemicdataaquisition);

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        //get the global controller class object
        final Controller aController = (Controller) this.getApplicationContext();

        String line = " ";

        try {
            while((line = reader.readLine())!= null){
                String[] fields = line.split(",");

                GraphemeClass graph = new GraphemeClass(fields);
                aController.addGrapheme(graph);

               // graphemeArray.add(graph);

                Log.wtf("GraphemeConstructor", "check"+graph.getSymbol() );

            }
        }
        catch (IOException e){
            Log.wtf("GraphemeConstructor", "Error Reading Data on Line"+line);

        }

    }

    /**
     * Starts the Word Creation Activity
     * @param v the start button
     */
    public void onCreation(View v){
        Intent intent = new Intent(this, PhonemeConstructor.class);
        //intent.putExtra("graphemeArray", graphemeArray);
        startActivity(intent);

    }
}
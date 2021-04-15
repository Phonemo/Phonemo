package com.example.phonemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Starts the Word Creation Activity
     * @param v Takes in click?
     */
    public void onCreation(View v){
        Intent intent = new Intent(this, PhonemeConstructor.class);
        startActivity(intent);
    }
}
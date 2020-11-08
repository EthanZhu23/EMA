package com.example.ema;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends WearableActivity implements View.OnClickListener {


    Button button_Y;
    Button button_N;
    private ArrayList message = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Y = findViewById(R.id.button1);
        button_N = findViewById(R.id.button2);


        button_Y.setOnClickListener(this);
        button_N.setOnClickListener(this);


        // Enables Always-on
        setAmbientEnabled();
    }

    @Override
    public void onClick(View v){
        if(button_Y.isPressed()) {
            message.add(1);
        }else if(button_N.isPressed()){
            message.add(0);
        }

        Intent intent = new Intent(this, SecondPage.class);
        intent.putIntegerArrayListExtra("First_Page", message);
        startActivity(intent);
    }
}
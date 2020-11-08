package com.example.ema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ThirdPage extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    private ArrayList message = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_page);

        Intent intent_previous = getIntent();
        message = intent_previous.getIntegerArrayListExtra("Second_Page");
        System.out.println(message);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if (button1.isPressed()) {
            message.add(0);
        }else if(button2.isPressed()){
            message.add(1);

        }else if(button3.isPressed()){
            message.add(2);

        }else if(button4.isPressed()){
            message.add(3);

        }else if(button5.isPressed()){
            message.add(4);

        }

        Intent intent = new Intent(this, Fourth.class);
        intent.putIntegerArrayListExtra("Third_Page", message);
        startActivity(intent);
    }
}

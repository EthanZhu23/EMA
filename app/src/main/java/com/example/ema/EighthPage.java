package com.example.ema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class EighthPage extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    public ArrayList<Integer> message = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth_page);

        Intent intent_previous = getIntent();
        message = intent_previous.getIntegerArrayListExtra("Sixth_Seventh_Page");
        System.out.println(message);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if (button1.isPressed()) {
            message.add(1);

        }else if(button2.isPressed()){
            message.add(2);

        }else if(button3.isPressed()){
            message.add(3);

        }else if(button4.isPressed()){
            message.add(4);

        }else if(button5.isPressed()){
            message.add(5);

        }else if(button6.isPressed()){
            message.add(6);

        }else if(button7.isPressed()){
            message.add(7);

        }else if(button8.isPressed()){
            message.add(8);

        }else if(button9.isPressed()){
            message.add(9);

        }else if(button10.isPressed()){
            message.add(10);

        }

        System.out.println(message);

        Intent intent = new Intent(this, NinthPage.class);
        startActivity(intent);

    }
}
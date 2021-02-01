package com.example.ema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SixthPage extends AppCompatActivity implements View.OnClickListener {

    Button button_Y;
    Button button_N;
    public ArrayList<Integer> message = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_page);

        Intent intent_previous = getIntent();
        message = intent_previous.getIntegerArrayListExtra("Fifth_Page");
        System.out.println(message);


        button_Y = findViewById(R.id.button1);
        button_N = findViewById(R.id.button2);


        button_Y.setOnClickListener(this);
        button_N.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if(button_Y.isPressed()) {

            message.add(0);
            Intent intent = new Intent(this, SeventhPage.class);
            intent.putIntegerArrayListExtra("Sixth_Page", message);
            startActivity(intent);

        }else if(button_N.isPressed()){

            message.add(1);
            //-1 represent skipped seventh page
            message.add(-1);
            Intent intent = new Intent(this, EighthPage.class);
            intent.putIntegerArrayListExtra("Sixth_Seventh_Page", message);
            startActivity(intent);

        }
    }

}
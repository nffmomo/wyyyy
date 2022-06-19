package com.example.wyyyy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button skip = findViewById(R.id.skip);

        skip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent mIntent =  new Intent(MainActivity.this, LoginAction.class);

                startActivity(mIntent);

            }
        });




    }



}
package com.example.wyyyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginAction extends AppCompatActivity {

    EditText user = null;
    EditText passwd = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_action);

        Button skip = findViewById(R.id.login_passwd);

        user = (EditText) findViewById(R.id.username);
        passwd = (EditText) findViewById(R.id.password);


        skip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                checkAction();
            }
        });

    }


    public boolean checkAction(){


        System.out.println(user.getText());
        System.out.println(passwd.getText());


        return true;
    }

}
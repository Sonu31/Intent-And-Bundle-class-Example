package com.example.colortextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NextScreen extends AppCompatActivity {

    EditText namesecond, emailsecond;
    String nameHere, emailHere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        namesecond = findViewById(R.id.nameNext);
        emailsecond = findViewById(R.id.emailNext);


        Bundle obj = getIntent().getExtras();
         nameHere = obj.getString("name");
         emailHere = obj.getString("email");

         namesecond.setText(nameHere);
         emailsecond.setText(emailHere);



    }
}
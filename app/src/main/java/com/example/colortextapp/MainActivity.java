package com.example.colortextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttontext;
    EditText  nameedit , emailedit;

    String nameone , emailone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

nameedit=findViewById(R.id.edit1);
emailedit =findViewById(R.id.edit2);

buttontext=findViewById(R.id.btn);


buttontext.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View l) {
        nameone= nameedit.getText().toString();
        emailone=emailedit.getText().toString();

        Intent obj= new Intent(getApplicationContext(),NextScreen.class);
            obj.putExtra("name",nameone);
        obj.putExtra("email",emailone);
        startActivity(obj);


    }
});

    }
}
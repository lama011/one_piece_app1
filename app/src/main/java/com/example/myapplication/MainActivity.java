package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button send;
    EditText Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.editTextTextPersonName);
        send = (Button) findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle d=new Bundle();
                d.putString("",Name.getText().toString());
                Intent in = new Intent(MainActivity.this, MainActivity2.class);
                in.putExtras(d);
                startActivity(in);}



        });
    }}

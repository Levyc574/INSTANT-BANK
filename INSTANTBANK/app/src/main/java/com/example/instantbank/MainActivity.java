package com.example.instantbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView17,textView18;
    EditText editTextTextPersonName10,editTextTextPassword;
    Button button11,button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView17 = findViewById(R.id.textView17);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPersonName10 = findViewById(R.id.editTextTextPersonName10);

        button12 = findViewById(R.id.button12);
        button11 = findViewById(R.id.button11);




        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Welcome back customer", Toast.LENGTH_LONG).show();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });


    }
}

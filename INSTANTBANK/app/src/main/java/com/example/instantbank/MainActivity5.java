package com.example.instantbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
 TextView textView25,textView31,textView33;
 EditText editTextTextPersonName12;
 Button button17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView25 = findViewById(R.id.textView25);
        textView31 =findViewById(R.id.textView31);

        editTextTextPersonName12 =findViewById(R.id.editTextTextPersonName12);
        button17 =findViewById(R.id.button17);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView33 =findViewById(R.id.textView33);
                textView33.setText(editTextTextPersonName12.getText().toString().trim());
                Toast.makeText(MainActivity5.this,"Loan Rejected, Over 500 shillings", Toast.LENGTH_LONG).show();
            }
        });

    }
}
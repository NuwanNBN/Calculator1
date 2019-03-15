package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculate(View view) {
        EditText data1 = findViewById(R.id.editText1);
        EditText data2 = findViewById(R.id.editText2);
        int num1 = Integer.parseInt(data1.getText().toString());
        int num2 = Integer.parseInt(data2.getText().toString());
        int sum = num1 + num2;
        TextView last = findViewById(R.id.textView);
        last.setText(Integer.toString(sum));

    }
}

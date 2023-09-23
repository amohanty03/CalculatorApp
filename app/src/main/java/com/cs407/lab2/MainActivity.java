package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }

    public void toAdd(View view) {
        EditText text1 = (EditText) findViewById(R.id.num1);
        EditText text2 = (EditText) findViewById(R.id.num2);

        try {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            goToActivity("" + (num1 + num2));
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Enter an integer only.", Toast.LENGTH_LONG).show();
        }
    }

    public void toSubtract(View view) {
        EditText text1 = (EditText) findViewById(R.id.num1);
        EditText text2 = (EditText) findViewById(R.id.num2);

        try {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            goToActivity("" + (num1 - num2));
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Enter an integer only.", Toast.LENGTH_LONG).show();
        }
    }

    public void toMultiply(View view) {
        EditText text1 = (EditText) findViewById(R.id.num1);
        EditText text2 = (EditText) findViewById(R.id.num2);

        try {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            goToActivity("" + (num1 * num2));
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Enter an integer only.", Toast.LENGTH_LONG).show();
        }
    }

    public void toDivide(View view) {
        EditText text1 = (EditText) findViewById(R.id.num1);
        EditText text2 = (EditText) findViewById(R.id.num2);

        try {
            int num1 = Integer.parseInt(text1.getText().toString());
            int num2 = Integer.parseInt(text2.getText().toString());
            if (num2 == 0) {
                Toast.makeText(MainActivity.this, "Divide by 0 is invalid.", Toast.LENGTH_LONG).show();
            } else {
                goToActivity("" + (double) num1 / (double) num2);
            }
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Enter an integer only.", Toast.LENGTH_LONG).show();
        }
    }
}
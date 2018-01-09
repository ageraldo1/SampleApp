package com.example.alexandre.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "SampleApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cmdClick(View v) {
        EditText userNumber  = (EditText) findViewById(R.id.txt_number);
        Log.i(TAG, "user number:" + userNumber.getText().toString());

        try {
            int n = Integer.parseInt(userNumber.getText().toString());
            Number nc = new Number(n);

            if ( nc.isPerfectSquare() == true ) {
                Toast.makeText(this, "Number is a perfect square", Toast.LENGTH_SHORT).show();

            } else if ( nc.isTriangular() == true ) {
                Toast.makeText(this, "Number is triangular number", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Number is neigther perfect square or triangular", Toast.LENGTH_SHORT).show();
            }

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid Number. Try it again", Toast.LENGTH_SHORT).show();
        }
    }
}

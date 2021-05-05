package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resulado);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Principal.EXTRA_MESSAGE);

        TextView resultadoTV = findViewById(R.id.resultadoTV);
        resultadoTV.setText(message);
    }
}

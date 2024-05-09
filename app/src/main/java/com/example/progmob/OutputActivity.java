package com.example.progmob;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OutputActivity extends AppCompatActivity {

    private TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        textViewOutput = findViewById(R.id.textViewOutput);

        // Mendapatkan output dari intent
        String output = getIntent().getStringExtra("OUTPUT");

        // Menampilkan output ke TextView
        textViewOutput.setText(output);
    }
}


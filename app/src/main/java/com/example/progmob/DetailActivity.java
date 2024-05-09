package com.example.progmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        editTextNumber = findViewById(R.id.editTextNumber);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan angka dari input pengguna
                String input = editTextNumber.getText().toString();

                // Melakukan pemrosesan cuaca
                int inputNumber = Integer.parseInt(input);
                String weatherResult;

                if (inputNumber < 30) {
                    weatherResult = "Hujan";
                } else {
                    weatherResult = "Cerah";
                }

                // Membuat intent untuk membuka OutputActivity dan menyertakan output cuaca
                Intent intent = new Intent(DetailActivity.this, OutputActivity.class);
                intent.putExtra("OUTPUT", "Cuaca hari ini: " + weatherResult);

                // Memulai OutputActivity
                startActivity(intent);
            }
        });
    }
}







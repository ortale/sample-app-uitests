package com.joseortale.ortalesoft.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.joseortale.ortalesoft.sample.util.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etText = findViewById(R.id.et_text);
        Button btnSubmit = findViewById(R.id.bt_submit);
        TextView tvResult = findViewById(R.id.tv_result);

        btnSubmit.setOnClickListener(l -> {
            String strCheck = etText.getText().toString();

            String resultCheck = Utils.validateFirstLetter(strCheck) ? "Correct!" : "Incorrect!";

            tvResult.setText(resultCheck);
        });
    }
}
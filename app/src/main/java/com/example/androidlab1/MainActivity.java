package com.example.androidlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button regester = findViewById(R.id.button);
        regester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEditText = findViewById(R.id.nameEditText);
                EditText emailEditText = findViewById(R.id.emailEditText);
                EditText feedbackEditText = findViewById(R.id.feedbackEditText);
                DatePicker dob = findViewById(R.id.dob);

                int day = dob.getDayOfMonth();
                int month = dob.getMonth() + 1;
                int year = dob.getYear();

                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String feedback = feedbackEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("feedback", feedback);
                intent.putExtra("day", day);
                intent.putExtra("month", month);
                intent.putExtra("year", year);
                startActivity(intent);
            }
        });
    }
}
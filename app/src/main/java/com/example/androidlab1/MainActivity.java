package com.example.androidlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView2 = findViewById(R.id.textView2);
        Button regester=(Button)findViewById(R.id.button);

        regester.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        EditText nameEditText = findViewById(R.id.nameEditText);
                        EditText emailEditText = findViewById(R.id.emailEditText);
                        EditText feedbackEditText = findViewById(R.id.feedbackEditText);

                        String name = nameEditText.getText().toString();
                        String email = emailEditText.getText().toString();
                        String feedback = feedbackEditText.getText().toString();

                        textView2.setText("Name: " + name + "\nEmail: " + email + "\npassword: " + feedback);


                    }
                }

        );








    }
}
package com.example.androidlab1;



        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String feedback = intent.getStringExtra("feedback");
        int day = intent.getIntExtra("day", 1);
        int month = intent.getIntExtra("month", 1);
        int year = intent.getIntExtra("year", 1900);

        textView2.setText("Name: " + name);
        textView3.setText("Email: " + email);
        textView4.setText("Feedback: " + feedback);
        textView5.setText("Date of Birth: " + day + "/" + month + "/" + year);
    }
}
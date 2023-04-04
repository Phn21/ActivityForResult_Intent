package com.example.test_status;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
        button = findViewById(R.id.button2);

        String data = getIntent().getStringExtra("Send Data");
        textView.setText(data);

        button.setOnClickListener(v -> {
            Intent returnData = new Intent();
            returnData.putExtra("Receive Data", "Receiving data");
            setResult(RESULT_OK, returnData);
            finish();
        });


    }
}
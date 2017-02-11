package com.example.rr.namebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
 TextView finalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        finalTextView=(TextView)findViewById(R.id.finalTextView);

        finalTextView.setText("Welcome!!\n"+getIntent().getStringExtra("Person_Name"));
    }
}

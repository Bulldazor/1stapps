package com.example.rr.sliding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=(TextView)findViewById(R.id.textView4);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
    }
}

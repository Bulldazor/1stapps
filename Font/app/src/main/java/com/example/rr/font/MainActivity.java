package com.example.rr.font;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)findViewById(R.id.textView2);
        txt2=(TextView)findViewById(R.id.textView3);
        txt3=(TextView)findViewById(R.id.textView);

        Typeface type= Typeface.createFromAsset(getAssets(),"fffo");
        txt1.setTypeface(type);
    }
}


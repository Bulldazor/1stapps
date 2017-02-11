package com.example.rr.clicklistening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    String email;
    String pass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.txtView);

        email = getIntent().getStringExtra("EMAIL").toString();

        pass1 =getIntent().getStringExtra("PASS").toString();
        textView.setText(email+pass1);

    }
}

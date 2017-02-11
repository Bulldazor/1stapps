package com.example.rr.cgpacounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCal,btnCgpa;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCal=(Button)findViewById(R.id.button5);
        btnCgpa=(Button)findViewById(R.id.button6);

        tx=(TextView)findViewById(R.id.textView7);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,ClaculatorActvty.class);
                startActivity(intent);
            }
        });
        btnCgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt=n;

                startActivity(intt);
            }
        });

        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,InfoActvty.class);
                startActivity(in);
            }
        });
    }
}

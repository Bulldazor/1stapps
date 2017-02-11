package com.example.rr.cc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCal,btnGpa;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnCal=(Button)findViewById(R.id.btnCAl);
        btnGpa=(Button)findViewById(R.id.btnGpaaa);
        txtView=(TextView)findViewById(R.id.textViewInfo);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in;
                in = new Intent(MainActivity.this,ClaculatorActvty.class);
                startActivity(in);
            }
        });
        btnGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);

            }
        });
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,InfoActivity.class);
                startActivity(in);
            }
        });
    }
}

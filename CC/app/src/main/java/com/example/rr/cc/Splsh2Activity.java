package com.example.rr.cc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static com.example.rr.cc.Splsh2Activity.splashTime;

public class Splsh2Activity extends AppCompatActivity {
    ActionBar actionBar;
    public static float splashTime=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splsh2);
        actionBar=getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(Splsh2Activity.this,MainActivity.class);
                startActivity(in);
                Toast.makeText(Splsh2Activity.this, "App Starting", Toast.LENGTH_SHORT).show();
                finish();
            }
        }, (long) splashTime);
    }
}

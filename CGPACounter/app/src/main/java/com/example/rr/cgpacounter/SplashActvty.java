package com.example.rr.cgpacounter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActvty extends AppCompatActivity {
    public static int splashTime=5000; //in mili sec scrn will be frozen
    ActionBar getActionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_actvty);
        getActionBar=getSupportActionBar();
        getActionBar.hide(); // hidding action bar.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashActvty.this,MainActivity.class);
                startActivity(in);
                Toast.makeText(SplashActvty.this, "App Starting", Toast.LENGTH_SHORT).show();
                finish();
            }
        },splashTime); // Time Out End

}
        }

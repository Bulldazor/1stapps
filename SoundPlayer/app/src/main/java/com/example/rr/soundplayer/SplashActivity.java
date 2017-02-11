package com.example.rr.soundplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        public static int splashTime = 5000; //in mili sec scrn will be frozen
        ActionBar getActionBar;
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_actvty);
            getActionBar = getSupportActionBar();
            getActionBar.hide(); // hidding action bar.

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent in = new Intent(.this, MainActivity.class);
                    startActivity(in);
                    Toast.makeText(S.this, "App Starting", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }, splashTime);

        }
    }
package com.example.rr.tnb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String TAG="Opening";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Its the Starting Of App");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Its the Starting Of App");
    }
}

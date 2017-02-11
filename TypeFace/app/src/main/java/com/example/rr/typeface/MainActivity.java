package com.example.rr.typeface;

import  android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;

        import android.graphics.Typeface;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;

        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);

        Typeface face = Typeface.createFromAsset(getAssets(), "font/font.tff");
        tv1.setTypeface(face);

        Typeface face1 = Typeface.createFromAsset(getAssets(), "font/font1.ttf");
        tv2.setTypeface(face1);
    }
}
package com.example.rr.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAniket,btnPath,btnChaite,btnAmjonota,btnDukkho;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAniket=(Button)findViewById(R.id.buttonAniket);
        btnPath=(Button)findViewById(R.id.buttonPath);
        btnAmjonota=(Button)findViewById(R.id.buttonAam);
        btnChaite=(Button)findViewById(R.id.buttonChaite);
        btnDukkho=(Button)findViewById(R.id.buttonDukkho);
        txtview=(TextView)findViewById(R.id.textViewAboutMe);


        txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,AbooutMeActivity.class);
                startActivity(in);
            }
        });

        btnAniket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,AniketActivity.class);
                startActivity(in);

            }
        });
        btnPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,PathActivity.class);
                startActivity(in);

            }
        });
        btnChaite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,ChaiteActivity.class);
                startActivity(in);
            }
        });
        btnAmjonota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,AmjonotaActivity.class);
                startActivity(in);

            }
        });
        btnDukkho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent in = new Intent(MainActivity.this,DukkhoActivity.class);
                startActivity(in);
            }
        });
    }
}

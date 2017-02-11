package com.example.w3eden.shareprefrnce;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView hsView;
    TextView ScView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        hsView=(TextView)findViewById(R.id.textView);
        ScView=(TextView)findViewById(R.id.textView2);

        final SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        hsView.setText(prefs.getInt("highScore",0)+"");
//        boolean music = prefs.getBoolean("music", true);
//        prefs.edit().putBoolean("music",false).commit();
//
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int) (Math.random() * 1000);
                int highScore = prefs.getInt("highScore", 0);
                if (rnd > highScore) {
                    prefs.edit().putInt("highScore", rnd).commit();
                    hsView.setText(rnd + "");


                }
                ScView.setText(rnd + "");


            }
            });

    }

}
package com.example.rr.tapnscores;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView txt1,txt2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1=(TextView)findViewById(R.id.highScore);
        txt2=(TextView)findViewById(R.id.textView5);
        btn=(Button)findViewById(R.id.butt);
        final SharedPreferences prefs =getSharedPreferences("Myprefs",MODE_PRIVATE);

        txt1.setText(prefs.getInt("highScore",0)+"");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = (int) (Math.random() * 1000);
                int highScore = prefs.getInt("highScore", 0);
                if (rnd > highScore) {
                    prefs.edit().putInt("highScore", rnd).commit();
                    txt1.setText(rnd + "");

                }
                txt2.setText(rnd + "");
            }

        });


        }


}

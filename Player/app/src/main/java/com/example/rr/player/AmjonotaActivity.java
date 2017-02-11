package com.example.rr.player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AmjonotaActivity extends AppCompatActivity {
    Button btnPlay,btnStop,btnPause;
    MediaPlayer mediaPlayer;
    boolean playing=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amjonota);
        btnPlay=(Button)findViewById(R.id.buttonPlayAmjonota);
        btnPause=(Button)findViewById(R.id.PasueAm);
        btnStop=(Button)findViewById(R.id.buttonStopAm);

        mediaPlayer= MediaPlayer.create(AmjonotaActivity.this,R.raw.aamjonotaaaurthohinfusionbdcom);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!playing){
                    mediaPlayer.start();
                    playing=true;
                }

            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playing){
                    mediaPlayer.pause();
                    playing=false;
                }

            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(playing){
                    mediaPlayer.stop();
                    playing=false;
                }
            }
        });
    }
}

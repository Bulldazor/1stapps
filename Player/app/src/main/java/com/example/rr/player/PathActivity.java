package com.example.rr.player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PathActivity extends AppCompatActivity {
    Button btnPlay,btnStop,btnPause;
    MediaPlayer mediaPlayer;
    boolean playing=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path);
        btnPlay=(Button)findViewById(R.id.buttonPlaypath);
        btnPause=(Button)findViewById(R.id.PasueAm);
        btnStop=(Button)findViewById(R.id.buttonPathstop);

        mediaPlayer= MediaPlayer.create(PathActivity.this,R.raw.artcellpothchola);
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

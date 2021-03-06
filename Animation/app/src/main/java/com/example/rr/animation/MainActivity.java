package com.example.rr.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
     ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView)findViewById(R.id.imageView);

        image.setImageResource(R.drawable.frameanimation);

        AnimationDrawable anim=(AnimationDrawable) image.getDrawable();
        anim.start();
    }
}

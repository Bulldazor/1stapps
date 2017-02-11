package com.example.w3eden.clicklistenerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by w3eden on 8/10/2016.
 */
public class SecondActivity extends AppCompatActivity {
    TextView txt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        txt=(TextView)findViewById(R.id.textView);


      txt = getIntent().getExtras().getString("key");
        String txt = editText.getText().toString();
        txt.setText(txt);

        Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_LONG).show();
    }
}

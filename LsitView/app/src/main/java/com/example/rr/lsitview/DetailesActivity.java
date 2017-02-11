package com.example.rr.lsitview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailesActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);
        txt=(TextView)findViewById(R.id.NewTxt);
        String cntryName=getIntent().getExtras().getString("data");
        txt.setText(cntryName);

    }
}

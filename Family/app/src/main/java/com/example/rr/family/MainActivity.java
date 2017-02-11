package com.example.rr.family;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnclick;
    Button btn;
    Button bttn;
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=(Button)findViewById(R.id.button);
        btn=(Button)findViewById(R.id.button2);
        bttn=(Button)findViewById(R.id.button3);
        btnClick=(Button)findViewById(R.id.button4);


        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Actvty2.class);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();
                startActivity(intent);


            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,Actvty3.class);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
        });
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intee = new Intent(MainActivity.this,Actvty4.class);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();
                startActivity(intee);
            }
        });
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent un =new Intent(MainActivity.this,Activity5.class);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();
                startActivity(un);
            }
        });

    }
}

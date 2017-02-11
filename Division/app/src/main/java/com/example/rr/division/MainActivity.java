package com.example.rr.division;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.buttonDhaka); // dhaka
        btn2=(Button)findViewById(R.id.buttonCtg);//Chittagong
        btn3=(Button)findViewById(R.id.buttonkhulna);
        btn4=(Button)findViewById(R.id.buttonRajshahi);
        btn5=(Button)findViewById(R.id.buttonSylht);//Syhlt
        btn6=(Button)findViewById(R.id.buttonBarsial);
        btn7=(Button)findViewById(R.id.buttonRangpur);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Dhaka");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Chittagong");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Khulna");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Rajshahi");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Sylhet");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Barisal");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SecondActvty.class);
                in.putExtra("placeName","Rangpur");
                startActivity(in);
                Toast.makeText(MainActivity.this, "Wait A Bit", Toast.LENGTH_SHORT).show();

            }
        });


    }
}

package com.example.rr.clicklistening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.rr.clicklistening.R.id.EditText;
import static com.example.rr.clicklistening.R.id.emailtxt;

public class MainActivity extends AppCompatActivity {
    String txt;
    String pass;
    Button btn;
    EditText editText;
    EditText passEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.showButton);
        editText=(EditText)findViewById(R.id.emailtxt);
        passEdit =(EditText)findViewById(R.id.pass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt = editText.getText().toString();
                pass=passEdit.getText().toString();
//                Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_LONG).show();

                if (txt.equals("abc@abc.com")&& pass.equals("123456")){
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("EMAIL", txt);
                    intent.putExtra("PASS", pass);

                    startActivity(intent);


                } else{
                    String invalid = "Invalid id";
                    Toast.makeText(getApplicationContext(), invalid, Toast.LENGTH_LONG).show();
                }


            }

        });

    }
}

package com.example.w3eden.dialougebox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn ,bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        bttn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simple();

            }

        });
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom();

            }
        });
    }
        
        public void simple(){

            AlertDialog.Builder buildre=new AlertDialog.Builder(this);
            buildre.setTitle("Delete");
            buildre.setMessage("Are You Sure Want To Delete");
            buildre.setCancelable(false);
            buildre.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            
            buildre.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            
          final   AlertDialog aleratDialouge=buildre.create();
            aleratDialouge.show();

        
        
        
    }
    public void custom(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
      final   View view= LayoutInflater.from(this).inflate(R.layout.custom,null);
        builder.setView(view);

        builder.setPositiveButton("Log In", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText emailEt = (EditText) view.findViewById(R.id.editText);
                EditText pass = (EditText) view.findViewById(R.id.editText2);
                Toast.makeText(MainActivity, this, emailEt, Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity, this, pass, Toast.LENGTH_LONG).show();


            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create().show();

    }

    }

    
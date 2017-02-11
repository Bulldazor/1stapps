package com.example.w3eden.clicklistenerexample;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btn=(Button)findViewById(R.id.button);
         editText = (EditText) findViewById(R.id.editText);
        btn.setOnCLickListener(this);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt = editText.getText().toString();
//                Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_LONG).show();
//            }
//        });


    }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onClick(View v) {
        int id =v.getId();
        switch (id){
            case R.id.button:
                String txt = editText.getText().toString();
                Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_LONG).show();
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key",txt);
                startActivity(intent);
                break;

        }


    }
}

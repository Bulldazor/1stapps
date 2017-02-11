package com.example.rr.namebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText edtxt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.showTextView);
        edtxt = (EditText) findViewById(R.id.userInputeditText);
        btn = (Button) findViewById(R.id.Okbutton);


        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       //button on press method
                                       String nameString = edtxt.getText().toString();
                                       Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                                       intent.putExtra("Person_Name", nameString);

                                       startActivity(intent);

                                   }

                               }
        );


    }
}

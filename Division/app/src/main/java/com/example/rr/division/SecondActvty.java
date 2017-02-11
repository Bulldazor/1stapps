package com.example.rr.division;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActvty extends AppCompatActivity {
    TextView txtPlace,txtPlaceDe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvty);

        txtPlace=(TextView)findViewById(R.id.textViewPlace);
        txtPlaceDe=(TextView)findViewById(R.id.textViewAnswer);
        String getPlaceName=getIntent().getExtras().getString("placeName");

        if(getPlaceName.equals("Dhaka"))
        {
            txtPlace.setText("Dhaka");
            txtPlaceDe.setText("It is the capital of Bangladesh. A place where people have to go for the sake of their livelihood. Its not a perfect place for living. But it's perfect for the travelling.");

        }
        else if(getPlaceName.equals("Chittagong")){
            txtPlace.setText("Chittagong");
            txtPlaceDe.setText("Second Capital of Bangladesh.");
        }
        else if(getPlaceName.equals("Khulna")){
            txtPlace.setText("Khulna");
            txtPlaceDe.setText("Have A Sea Port There");

        }
        else if (getPlaceName.equals("Rajshahi")){
            txtPlace.setText("Rajshahi");
            txtPlaceDe.setText("Have a lots of Mosjid and teh mango is very famous here");
        }
        else if(getPlaceName.equals("Sylhet")){
            txtPlace.setText("Sylhet");
            txtPlaceDe.setText("Famous for Different types of attractive place");
        }
        else if (getPlaceName.equals("Barisal")){
            txtPlace.setText("Barisal");
            txtPlaceDe.setText("Always quarrels with people for no reason");
        }
        else if(getPlaceName.equals("Rangpur"))
        {
            txtPlace.setText("Rangpur");
            txtPlaceDe.setText("Famos for Ershad Kaku");
        }
    }
}

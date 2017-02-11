package com.example.rr.lsitview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lstView;
    String countryList[]={"Bangladesh","Australia","Russia","Malaysia","China","Germany","Uganda","France","Japan","Brazil","Spain"};
    int flag[]={R.drawable.bd,R.drawable.australia,R.drawable.russia,R.drawable.my,R.drawable.chinaflagmap,R.drawable.gaermanfag,R.drawable.uganda,R.drawable.franceflag,R.drawable.japan,R.drawable.brazil,R.drawable.spain};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing the list view
        lstView=(ListView)findViewById(R.id.SimpleListView);
//        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countryList);
//        lstView.setAdapter(arrayAdapter);
//        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(MainActivity.this, countryList[position], Toast.LENGTH_SHORT).show();
//                Intent in = new Intent(MainActivity.this,DetailesActivity.class);
//                in.putExtra("data",countryList[position]);
//                startActivity(in);
//
//            }
//        });
        CustomeAdapter customeAdapter= new CustomeAdapter(getApplicationContext(),countryList,flag);
            lstView.setAdapter(customeAdapter);


    }
}

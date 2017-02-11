package com.example.rr.itemclicking;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button btn;
    ArrayList<String>arrayList=new ArrayList<String>();
    ArrayList<String> urlList = new ArrayList<>();

    ArrayAdapter<String> adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.listView);
        btn =(Button)findViewById(R.id.button2) ;

        arrayList.add("Google");
        urlList.add("https://www.google.com");

        arrayList.add("Facebook");
        urlList.add("https://www.facebook.com");
        arrayList.add("Twiter");
        arrayList.add("BBC");
        arrayList.add("Kaler Kontho");
        arrayList.add("Prothom-Alo");
        arrayList.add("Espn");
        arrayList.add("Cricbuzz");


        adp=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adp);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                String url = urlList.get(i);
                Intent intent =new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("URL", url);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                save();

            }
        });


    }

    public void save(){
        final View view1 = LayoutInflater.from(this).inflate(R.layout.custom, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setView(view1);

        builder.setTitle("Add an item");
        builder.setCancelable(false);

        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                EditText name, url;
                name = (EditText) view1.findViewById(R.id.editText);
                url = (EditText) view1.findViewById(R.id.editText2);

                String nameString, urlString;
                nameString = name.getText().toString();
                urlString = url.getText().toString();
                arrayList.add(nameString);
                urlList.add(urlString);
                adp.notifyDataSetChanged();

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.create().show();

    }
}

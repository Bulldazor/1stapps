package com.example.rr.sliding;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AsynctaskRunner().execute();

    }



    private class AsynctaskRunner extends AsyncTask<String, String, String> {
        ProgressDialog dialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(Main2Activity.this);
            dialog.setMessage("Loading...... Please Wait...........");
            dialog.show();

        }

        @Override
        protected String doInBackground(String... strings) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute (String s){
            super.onPostExecute(s);
            Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(intent);
            dialog.dismiss();

        }


    }
}


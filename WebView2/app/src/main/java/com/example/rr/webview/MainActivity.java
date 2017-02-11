package com.example.rr.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=(WebView)findViewById(R.id.webView);


        web.getSettings().setBuiltInZoomControls(true);;


        web.getSettings().setBuiltInZoomControls(true);

        web.loadUrl("http://www.prothom-alo.com");


    }
}

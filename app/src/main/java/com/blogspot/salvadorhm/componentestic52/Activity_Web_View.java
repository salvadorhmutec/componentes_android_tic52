package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Activity_Web_View extends AppCompatActivity {
    String url = "https://www.google.com.mx/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__web__view);

        WebView web =(WebView) findViewById(R.id.web_view);
    }
}

package com.blogspot.salvadorhm.componentestic52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity_Web_View extends AppCompatActivity {
    String url = "https://www.google.com.mx/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__web__view);

        WebView web = findViewById(R.id.web_view);
            web.setWebViewClient(new MyWebViewClient());
             WebSettings settings = web.getSettings();
             settings.setJavaScriptEnabled(true);
             web.loadUrl(url);
    }
private class  MyWebViewClient extends WebViewClient{
        public  boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}

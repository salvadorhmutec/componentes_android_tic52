package com.blogspot.salvadorhm.componentestic52;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

public class Activity_Web_View extends AppCompatActivity {

    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definimos el webView
        browser= findViewById(R.id.web_view);

        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // Cargamos la web
        browser.loadUrl("file:///re/index.html");
    }
}

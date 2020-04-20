package com.example.latihanwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity<cobalagi> extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.myWebView);

        WebView myWebView = (WebView) findViewById(R.id.myWebView);
        myWebView.loadUrl("http://hirupmotekar.com/");



    }


}

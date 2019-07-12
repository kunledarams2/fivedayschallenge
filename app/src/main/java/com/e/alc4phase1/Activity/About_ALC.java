package com.e.alc4phase1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.e.alc4phase1.MainActivity;
import com.e.alc4phase1.R;

public class About_ALC extends AppCompatActivity {

    WebView webView;
    private static String about_Url="https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);

        webView=findViewById(R.id.about_Website);
        setupWebview();

    }

    private void setupWebview(){
        webView.loadUrl(about_Url);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings=  webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            super.onBackPressed();
        }
    }
}

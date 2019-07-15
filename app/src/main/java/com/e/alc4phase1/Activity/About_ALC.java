package com.e.alc4phase1.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.e.alc4phase1.MainActivity;
import com.e.alc4phase1.R;

public class About_ALC extends AppCompatActivity {

    WebView webView;
    Toolbar toolbar;

    private static String about_Url="https://andela.com/alc/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);

        webView=findViewById(R.id.about_webview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.setWebViewClient(new WebViewClient(){


            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                if(handler!=null){
                    handler.proceed();

                }
                else {
                    super.onReceivedSslError(view, null, error);
                }

            }
        });

        webView.loadUrl(about_Url);


        toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About_ALC.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

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

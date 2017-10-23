package com.simpkg.ukkggpo.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.simpkg.ukkggpo.R;

public class website extends AppCompatActivity {

    private static final String URL = "https://app.simpkb.id/gtk#!/penilaian/";

    //Define WebView

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);



        WebView web = (WebView) findViewById(R.id.hasil);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient(){

            public boolean shoulOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });

        web.loadUrl("https://app.simpkb.id/gtk#!/penilaian/");


    }


}

package com.miss.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Detail extends AppCompatActivity {
//deklarasi webview
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //inisialisasi

        webView = findViewById(R.id.webview);

        Intent detail = getIntent();
        detail.getIntExtra("posisi", 0);
        String link = detail.getStringExtra("link");

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(link);
    }
}

package com.example.pranav.survival;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.URLUtil;






public class Signaling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView wb = new WebView(this);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl("file:///android_asset/Signaling.html");
        setContentView(wb);
    }
}
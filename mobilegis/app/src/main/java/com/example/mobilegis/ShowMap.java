package com.example.mobilegis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ShowMap extends AppCompatActivity {
    WebView webView;
    int lebar;
    int tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_map);
        webView = findViewById(R.id.webview);
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        //TODO AUto-generated method stub
        super.onWindowFocusChanged(hasFocus);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        lebar=(webView.getWidth()/3);
        tinggi=webView.getHeight()/3;
        viewWeb();
    }

    private void viewWeb() {

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.43.117:8090/geoserver/Jakarta_Barat/wms?service=WMS&version=1.1.0&request=GetMap&layers=Jakarta_Barat:JakartaBarat&styles=&bbox=106.68621063232422,-6.225213050842285,106.82831573486328,-6.0951247215271&width="+lebar+"&height="+tinggi+"&srs=EPSG:4326&format=application/openlayers");
    }
}
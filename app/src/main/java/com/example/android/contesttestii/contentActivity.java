package com.example.android.contesttestii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class contentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        String contentFile = getIntent().getStringExtra("file");

        PDFView pdfView = (PDFView) this.findViewById(R.id.pdfView);
        pdfView.fromAsset(contentFile).load();
    }
}

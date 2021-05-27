package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chebook extends AppCompatActivity {
    PDFView pdfche;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chebook );

        pdfche = (PDFView) findViewById( R.id.pdfche );
        pdfche.fromAsset( "School-Mobile-App-Planning-Guide.pdf" ).load();

    }
}


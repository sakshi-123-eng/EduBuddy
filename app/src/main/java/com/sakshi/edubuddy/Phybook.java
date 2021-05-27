package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Phybook extends AppCompatActivity {
    PDFView pdfphy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_phybook );


        pdfphy=(PDFView) findViewById( R.id.pdfphy );
        pdfphy.fromAsset( "i4c_blogathon.pdf" ).load();

       /* WebView  webView = findViewById( R.id.webView );
        final ProgressBar progressBar = findViewById( R.id.progressBar ) ;

        progressBar.setVisibility( View.VISIBLE );
        String url="https://firebasestorage.googleapis.com/v0/b/publicschool-5a807.appspot.com/o/Getting%20started.pdf?alt=media&token=885ba956-ec0a-4ea2-936d-28488d4cffcf";
        try{
            url= URLEncoder.encode( url,"UTF-8");
        }catch
        (UnsupportedEncodingException e){
            e.printStackTrace();
        }


        String finalURL = "https://drive.google.com/viewerng/viewer?embedded=true&url=\" +url";

        webView.getSettings().setJavaScriptEnabled( true );
        webView.getSettings().setBuiltInZoomControls( true );

        webView.setWebChromeClient( new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged( view, newProgress );

                getSupportActionBar().setTitle( "Loading..." );
                if(newProgress==100)
                {
                    progressBar.setVisibility( View.GONE );
                    getSupportActionBar().setTitle( R.string.app_name );
                }
            }
        } );

        webView.loadUrl( finalURL );*/





    }
}

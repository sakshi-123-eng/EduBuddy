package com.sakshi.edubuddy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class About extends AppCompatActivity {
    private ActionBar actionBar;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_about );


        getSupportActionBar().setTitle( "About" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }
}

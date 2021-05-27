package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CL3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_c_l3 );
    }
    public void Maths(View view) {


        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }
    public void Science(View view) {


        startActivity(new Intent(getApplicationContext(),Maths.class));

    }
}

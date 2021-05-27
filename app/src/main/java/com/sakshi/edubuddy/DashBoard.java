package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    }

    public void CL3(View view) {


        startActivity(new Intent(getApplicationContext(),CL3.class));

    }
    public void CL4(View view) {


        startActivity(new Intent(getApplicationContext(),CL4.class));

    }
    public void CL5(View view) {


        startActivity(new Intent(getApplicationContext(),CL5.class));

    }

    public void CL6(View view) {


        startActivity(new Intent(getApplicationContext(),CL6.class));

    }


    public void About(View view) {


        startActivity(new Intent(getApplicationContext(),About.class));

    }


}

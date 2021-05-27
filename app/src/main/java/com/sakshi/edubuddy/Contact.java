package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    private static final int REQUEST_CALL =1;
    private TextView callText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_contact );

        callText =findViewById( R.id.phone );
        callText.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButoon();
            }
        } );




    }
    private void CallButoon(){
        String number = callText.getText().toString();
        if(number.trim().length() >0){
            if(ContextCompat.checkSelfPermission( Contact.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED);
            ActivityCompat.requestPermissions( Contact.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }else{
            String dial ="tel:"+ number;
            startActivity( new Intent( Intent.ACTION_CALL, Uri.parse( dial ) ) );
        }
    }
}


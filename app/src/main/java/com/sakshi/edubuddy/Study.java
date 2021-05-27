package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Study extends AppCompatActivity {

    CardView btn_phy,btn_che;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_study );

        btn_phy = (CardView) findViewById( R.id.phy ) ;
        btn_che = (CardView) findViewById( R.id.che ) ;

        btn_phy.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent( Study.this,Phybook.class );
                startActivity( i );
            }
        } );
        btn_che.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent( Study.this,Chebook.class );
                startActivity( i );
            }
        } );





        getSupportActionBar().setTitle( "My Class" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu item) {
        getMenuInflater().inflate(  R.menu.studyi,item);
        return true;
    }
   /* public void book1(View view) {
        startActivity(new Intent(getApplicationContext(), Phybook.class));
    }
    public void book2(View view) {
        startActivity(new Intent(getApplicationContext(), Chebook.class));
    }*/

}


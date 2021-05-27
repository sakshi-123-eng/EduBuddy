package com.sakshi.edubuddy;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class Main3Activity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle aToggle;
    private Toolbar mToolbar;
    Toolbar toolbar;
    NavigationView navigationView;
    ViewFlipper v_flipper;


    @SuppressLint("RestrictedApi")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );


        int image[] = {R.drawable.gr,R.drawable.skyy,R.drawable.startup};
        v_flipper=findViewById( R.id.v_flipper );
        for(int i=0;i<image.length;i++){
            flipperImages( image[i] );
        }





        mToolbar = (Toolbar)findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        aToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(aToggle);
        aToggle.syncState();




        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView=findViewById(R.id.navigation_menu);
        navigationView.setItemIconTintList( null );    // to change the color of icon in navigation menu
        navigationView.setItemIconSize(70);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch ((item.getItemId())){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                        break;
                    case R.id.nav_logout:

                        break;
                    case R.id.nav_about:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        break;
                    case R.id.nav_contactUs:
                        startActivity(new Intent(getApplicationContext(), Contact.class));
                        break;
                    case R.id.nav_share:
                        Intent sharingIntent = new Intent( Intent.ACTION_SEND );
                        sharingIntent.setType( "text/plain" );
                        String shareBody ="Your Body Here";
                        String shareSubject = " Your Subject here";

                        sharingIntent.putExtra( Intent.EXTRA_TEXT,shareBody );
                        sharingIntent.putExtra( Intent.EXTRA_SUBJECT,shareSubject );
                        startActivity( Intent.createChooser( sharingIntent,"share using" ) );
                        break;

                    case R.id.nav_rating:
                        startActivity(new Intent(getApplicationContext(), Ratings.class));
                        break;

                }
                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu item) {
        getMenuInflater().inflate(  R.menu.action_menu,item);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(aToggle.onOptionsItemSelected(item)){
            return true;
        }



        if (item.getItemId()==R.id.nav_cart){

            startActivity(new Intent(getApplicationContext(), Cart.class));
        }
        if (item.getItemId()==R.id.nav_notifiy){

            startActivity(new Intent(getApplicationContext(), Notification.class));

        }


        return super.onOptionsItemSelected(item);
    }




    public void CL3(View view) {



        startActivity(new Intent(getApplicationContext(), CL3.class));



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
    public void Class(View view) {


        startActivity(new Intent(getApplicationContext(),DashBoard.class));

    }

    public void study(View view) {


        startActivity(new Intent(getApplicationContext(),Study.class));

    }


    public void flipperImages(int image){
        ImageView imageView = new ImageView( this );
        imageView.setBackgroundResource(image  );

        v_flipper.addView( imageView);
        v_flipper.setFlipInterval( 4000 );
        v_flipper.setAutoStart( true );

        v_flipper.setInAnimation( this ,android.R.anim.slide_in_left);
        v_flipper.setInAnimation( this ,android.R.anim.slide_out_right);




    }



}

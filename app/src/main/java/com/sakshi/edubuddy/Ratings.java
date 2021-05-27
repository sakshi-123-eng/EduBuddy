package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Ratings extends AppCompatActivity {
    TextView txtRating;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ratings );

        txtRating =(TextView) findViewById( R.id.txtRate );
        ratingBar =(RatingBar)findViewById( R.id.ratingbar );

        ratingBar.setOnRatingBarChangeListener( new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtRating.setText( "Rate:"+rating );
            }
        } );


    }
}

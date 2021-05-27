package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Maths extends YouTubeBaseActivity {

    Button button, button1,button2;
    YouTubePlayerView youTubePlayerView,youTubePlayerView1,youTubePlayerView2;
    private YouTubePlayer.OnInitializedListener onInitializedListener,onInitializedListener1,onInitializedListener2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_maths );
        button1 =(Button) findViewById(R.id.maths);
        button2 =(Button) findViewById(R.id.maths1);

        youTubePlayerView = findViewById( R.id.youtube_view );
        youTubePlayerView1 = findViewById( R.id.youtube_view1 );
        youTubePlayerView2= findViewById( R.id.youtube_view3 );

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo( "9_Ak4tgnAt4" );

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }

        };

        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){

                youTubePlayerView.initialize( "AIzaSyAlAUblQ36SjZoyk2EHmypFhqu6GAX9M5k", onInitializedListener );

            }
        } );


        onInitializedListener1 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer1, boolean b) {

                youTubePlayer1.loadVideo( " Rb_3_EXbWm0" );
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }

        };
        button1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){


                youTubePlayerView1.initialize( "AIzaSyAlAUblQ36SjZoyk2EHmypFhqu6GAX9M5k", onInitializedListener1 );

            }
        } );


        onInitializedListener2 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer2, boolean b) {

                youTubePlayer2.loadVideo( "Rb_3_EXbWm0" );
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }

        };
        button2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){


                youTubePlayerView2.initialize( "AIzaSyAlAUblQ36SjZoyk2EHmypFhqu6GAX9M5k", onInitializedListener2);

            }
        } );

    }
}

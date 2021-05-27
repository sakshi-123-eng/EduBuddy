package com.sakshi.edubuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Bdyyyyy extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    public static final String API_KEY = "AIzaSyAlAUblQ36SjZoyk2EHmypFhqu6GAX9M5k";
    //http://youtu.be/<VIDEO_ID>
    public static final String VIDEO_ID = "W4hTJybfU7s";

    public void onFullscreen(boolean isFullscreen) {
        if (isFullscreen)
            playbackEventListener.onPlaying();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_bdyyyyy );

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById( R.id.youtube_player );
        youTubePlayerView.initialize( API_KEY, this );
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
        Toast.makeText( this, "Failured to Initialize!", Toast.LENGTH_LONG ).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, final YouTubePlayer player, boolean wasRestored) {

        player.setPlayerStateChangeListener( playerStateChangeListener );
        player.setPlaybackEventListener( playbackEventListener );
        player.setOnFullscreenListener( new YouTubePlayer.OnFullscreenListener() {
            @Override
            public void onFullscreen(boolean b) {
                if (b)
                    player.play();
                else
                    player.play();
            }
        } );


        if (!wasRestored) {

            player.loadPlaylist( VIDEO_ID );


        }
    }


    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {


        @Override
        public void onBuffering(boolean arg0) {
        }

        @Override
        public void onPaused() {
        }

        @Override
        public void onPlaying() {
        }

        @Override
        public void onSeekTo(int arg0) {
        }

        @Override
        public void onStopped() {
        }

    };


    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {

        @Override
        public void onAdStarted() {
        }

        @Override
        public void onError(YouTubePlayer.ErrorReason arg0) {
        }

        @Override
        public void onLoaded(String arg0) {
        }

        @Override
        public void onLoading() {
        }


        @Override
        public void onVideoEnded() {
        }

        @Override
        public void onVideoStarted() {
        }
    };

}
package com.prolificinteractive.materialcalendarview.sample;

import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Sun_Sun on 2017-10-02.
 */

public class SchoolStoryActivity extends YouTubeBaseActivity {
    YouTubePlayerView youtubeView, youtubeView2, youtubeView3;
    YouTubePlayer.OnInitializedListener listener, listener2, listener3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolstory);

        youtubeView = (YouTubePlayerView) findViewById(R.id.youtubeView);
        youtubeView2 = (YouTubePlayerView) findViewById(R.id.youtubeView2);
        youtubeView3 = (YouTubePlayerView) findViewById(R.id.youtubeView3);

        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("psm4hFjTul4");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youtubeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youtubeView.initialize("AIzaSyAz2-ZGlmivCawTDSW7EvjcWGcMTf5DY-Q", listener);
                //button.setVisibility(View.INVISIBLE);
            }
        });


        listener2 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Nwb8u4RFUnY");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youtubeView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youtubeView2.initialize("AIzaSyCLd2u6sL7_7i-xiKlYeiEwLXhYE-8UEhA", listener2);
                //button2.setVisibility(View.INVISIBLE);
            }
        });

        listener3 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("G-9uPMBM80s");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youtubeView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youtubeView3.initialize("AIzaSyDLSHOw-gPAth6Rs7LYxI02eHy0fxtYXg8", listener3);
                //button2.setVisibility(View.INVISIBLE);
            }
        });
    }
}

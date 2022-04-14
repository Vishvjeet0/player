package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    PlayerView playerView;
    SimpleExoPlayer player;
    MediaItem mediaItem;
    String videoURI = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerView = findViewById(R.id.exoplayerview);

        SimpleExoPlayer simpleExoPlayer =new SimpleExoPlayer.Builder(this).build();
        playerView.setPlayer(simpleExoPlayer);

        MediaItem mediaItem = MediaItem.fromUri(videoURI);
        simpleExoPlayer.addMediaItems(Collections.singletonList(mediaItem));
        simpleExoPlayer.prepare();
        simpleExoPlayer.play();





    }
}
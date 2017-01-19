package com.parse.starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.longtailvideo.jwplayer.JWPlayerFragment;
import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.media.playlists.PlaylistItem;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Get a handle to the JWPlayerFragment
        JWPlayerFragment fragment = (JWPlayerFragment) getFragmentManager().findFragmentById(R.id.playerFragment);

        // Get a handle to the JWPlayerView
        JWPlayerView playerView = fragment.getPlayer();

        // Create a PlaylistItem
        PlaylistItem video = new PlaylistItem("http://content.jwplatform.com/videos/3zGF1Ub9-YgY5iOVA.mp4");

        // Load a stream into the player

        playerView.load(video);
    }
}

package com.example.android.musicappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        TextView somePlaylistButton = (TextView) findViewById(R.id.some_playlist_button);

        somePlaylistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlaylistsActivity.this, TrackListActivity.class);
                startActivity(albumsIntent);
            }
        });

    }
}

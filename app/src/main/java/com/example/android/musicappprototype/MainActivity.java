package com.example.android.musicappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button artistsButton = (Button) findViewById(R.id.artists_button);

        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });


        Button albumsButton = (Button) findViewById(R.id.albums_button);

        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        Button playlistsButton = (Button) findViewById(R.id.playlists_button);

        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

    }
}

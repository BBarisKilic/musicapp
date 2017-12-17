package com.example.android.musicapp;

/**
 * Created by eopeace on 12/15/17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageButton playList = (ImageButton) findViewById(R.id.playListView);

        playList.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(playlist.this, playlist.class);

                startActivity(playListIntent);
            }
        });
        ImageButton tocando = (ImageButton) findViewById(R.id.playingView);

        tocando.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(playlist.this, MainActivity.class);

                startActivity(playingIntent);
            }
        });

        ImageButton library = (ImageButton) findViewById(R.id.libraryView);

        library.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(playlist.this, library.class);

                startActivity(libraryIntent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
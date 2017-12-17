package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton playList = (ImageButton) findViewById(R.id.playListView);

        playList.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, playlist.class);

                startActivity(playListIntent);
            }
        });
        ImageButton tocando = (ImageButton) findViewById(R.id.playingView);

        tocando.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, MainActivity.class);

                startActivity(playingIntent);
            }
        });

        ImageButton library = (ImageButton) findViewById(R.id.libraryView);

        library.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, library.class);

                startActivity(libraryIntent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
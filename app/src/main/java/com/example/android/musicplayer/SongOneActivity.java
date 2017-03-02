package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_one);

        TextView nextSong = (TextView) findViewById(R.id.next_song);
        nextSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songTwoIntent = new Intent(SongOneActivity.this, SongTwoActivity.class);
                startActivity(songTwoIntent);
            }
        });

        TextView mainMenu = (TextView) findViewById(R.id.main_menu);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(SongOneActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

    }
}

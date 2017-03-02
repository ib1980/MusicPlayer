package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NextSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_song);

        TextView songOne = (TextView) findViewById(R.id.song_one);
        songOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songOneIntent = new Intent(NextSongActivity.this, SongOneActivity.class);
                startActivity(songOneIntent);
            }
        });

        TextView songTwo = (TextView) findViewById(R.id.song_two);
        songTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songTwoIntent = new Intent(NextSongActivity.this, SongTwoActivity.class);
                startActivity(songTwoIntent);
            }
        });

        TextView songThree = (TextView) findViewById(R.id.song_three);
        songThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songThreeIntent = new Intent(NextSongActivity.this, SongThreeActivity.class);
                startActivity(songThreeIntent);
            }
        });



    }
}

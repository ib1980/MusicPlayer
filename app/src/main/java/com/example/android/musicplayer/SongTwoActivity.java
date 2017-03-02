package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_two);

        TextView previousSong = (TextView) findViewById(R.id.previous_song);
        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songOneIntent = new Intent(SongTwoActivity.this, SongOneActivity.class);
                startActivity(songOneIntent);
            }
        });

        TextView nextSong = (TextView) findViewById(R.id.next_song);
        nextSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songThreeIntent = new Intent(SongTwoActivity.this, SongThreeActivity.class);
                startActivity(songThreeIntent);
            }
        });

        TextView mainMenu = (TextView) findViewById(R.id.main_menu);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(SongTwoActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });


    }
}

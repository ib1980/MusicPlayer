package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_three);

        TextView previousSong = (TextView) findViewById(R.id.previous_song);
        previousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songTwoIntent = new Intent(SongThreeActivity.this, SongTwoActivity.class);
                startActivity(songTwoIntent);
            }
        });

        TextView mainMenu = (TextView) findViewById(R.id.main_menu);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(SongThreeActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}

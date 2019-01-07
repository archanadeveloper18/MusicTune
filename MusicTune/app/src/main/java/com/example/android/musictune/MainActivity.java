package com.example.android.musictune;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //** Create an ArrayList of songs **//
       final ArrayList<Song> songs = new ArrayList<Song>();
        //** Initilized element in an ArrayList **//
        songs.add(new Song("Baby I don't need dollar bills","Cheap Thrills",R.drawable.picmusic ,R.raw.sia));
        songs.add(new Song("Loca ft","Shakira",R.drawable.picmusic, R.raw.shakiraloca));
        songs.add(new Song("Waka Waka (This Time for Africa)","Shakira",R.drawable.picmusic, R.raw.shakirawaka));
        songs.add(new Song("Roar(Official)","Katy Perry", R.drawable.picmusic, R.raw.roarkaty));
        songs.add(new Song("papi","Jennifer Lopez",R.drawable.picmusic, R.raw.jenniferpapi));
        songs.add(new Song("Ain't your mama","Jennifer Lopez",R.drawable.picmusic, R.raw.jennifermama));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Song song = songs.get(position);final ImageView playImage = (ImageView) findViewById(R.id.play_image);

                mMediaPlayer  = MediaPlayer.create(MainActivity.this, song.getAudioResourceId());

                playImage.setOnClickListener(new View.OnClickListener() {
                   @Override
                    public void onClick(View v) {
                        if(mMediaPlayer.isPlaying()){
                            mMediaPlayer.pause();
                            playImage.setBackgroundResource(R.drawable.playsign);

                        }
                        else {
                            mMediaPlayer.start();
                           playImage.setBackgroundResource(R.drawable.pausebutton);


                        }
                    }
                });
            }
        });

    }

}

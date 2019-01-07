package com.example.android.musictune;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StartingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);


        final ImageView imageStartMusic = findViewById(R.id.imageView_MusicPic);
        imageStartMusic.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                startMusic();
            }
        });
    }

    private void startMusic(){
        Intent imgIntent = new Intent(StartingScreenActivity.this,MainActivity.class);
        startActivity(imgIntent);
    }
}

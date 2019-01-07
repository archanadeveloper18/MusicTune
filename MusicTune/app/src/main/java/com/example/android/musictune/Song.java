package com.example.android.musictune;

public class Song {

    //** Name of the song **//
    private String mSongName;

    //** Name of the artist **//
    private String mArtistName;

    //** drawable image id **//
    private int mImageResourceId;


    /** Audio resource ID for the songs */
    private int mAudioResourceId;

    /*
     * Create a new Song object.
     *
     * @param songName is the name of the songs.
     * @param artistName is the by which person its sang.
     * @param image is drawable reference ID that corresponds to the song.
     * */
    public Song(String songName, String artistName, int imageResourceId, int audioResourceId){
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
    }
    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mArtistName;
    }
    /**
     * Get the image of the song.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

        /**
         * Get the audio Id of the song.
         */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}

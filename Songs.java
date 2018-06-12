package com.example.android.musicplayer;

/**
 * Created by Derek on 6/11/18.
 */

public class Songs {

    private String songName;

    private String albumName;

    private String artistName;



    //Constructor for the Songs class
    public Songs(String song, String album, String artist){
        songName = song;
        albumName = album;
        artistName = artist;

    }


    public String getSongName(){
        return songName;
    }

    public String getAlbumName(){

        return albumName;
    }

    public String getArtistName(){
        return artistName;
    }
}

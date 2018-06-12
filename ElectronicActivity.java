package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectronicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);

        ArrayList<Songs> song = new ArrayList<>();

        song.add(new Songs("Lose Yourself to Dance", "Random Access Memories", "Daft Punk"));
        song.add(new Songs("Red Lights", "A Town Called Paradise", "Tiesto"));
        song.add(new Songs("Closer", "","The Chainsmokers"));
        song.add(new Songs("Summer","","Calvin Harris"));
        song.add(new Songs("A Moment Apart", "A Moment Apart","Odesza"));


        SongsAdapter adapter = new SongsAdapter(this, song);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

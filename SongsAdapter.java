package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Derek on 6/11/18.
 */

public class SongsAdapter extends ArrayAdapter<Songs> {


    public SongsAdapter(Activity context, ArrayList<Songs> song) {
        super(context, 0, song);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Songs song = getItem(position);

        TextView songTitle = (TextView) listItemView.findViewById(R.id.song);

        songTitle.setText(song.getSongName());

        TextView albumName = (TextView) listItemView.findViewById(R.id.album);

        albumName.setText((song.getAlbumName()));

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist);

        artistName.setText((song.getArtistName()));

    return listItemView;
    }

}

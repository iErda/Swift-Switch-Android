package com.example.win.easy.display;

import android.widget.TabHost;

import com.example.win.easy.song.Song;

import java.util.List;

public interface SongListView {
    void update(List<SongList> songLists, Song songToDisplay, TabHost tabHost,Integer[] tabs);

}

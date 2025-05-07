package org.example.collection;

import org.example.iterator.GenreIterator;
import org.example.iterator.MusicIterator;
import org.example.iterator.PlaylistIterator;
import org.example.iterator.ShuffleIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Collection {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void add(Song song) {
        this.songs.add(song);
    }

    public Song getSong(Integer index) {
        return songs.get(index);
    }

    public Integer getSize() {
        return songs.size();
    }

    @Override
    public MusicIterator createPlaylistIterator() {
        return new PlaylistIterator(this);
    }

    @Override
    public MusicIterator createShuffleIterator() {
        return new ShuffleIterator(this);
    }

    @Override
    public MusicIterator createGenreIterator(String genre) {
        return new GenreIterator(this,genre);
    }
}

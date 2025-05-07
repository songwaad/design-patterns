package org.example.iterator;

import org.example.collection.Collection;
import org.example.collection.Playlist;
import org.example.collection.Song;

import java.util.ArrayList;
import java.util.List;

public class PlaylistIterator implements MusicIterator{

    private List<Song> songs;
    private Integer currentIndex;

    public PlaylistIterator(Collection playlist) {
        this.songs = new ArrayList<>();
        currentIndex = 0;
        for (int i =0; i< ((Playlist)playlist).getSize(); i++) {
            this.songs.add(((Playlist)playlist).getSong(i));
        }
    }

    @Override
    public Song getNext() {
        return songs.get(currentIndex++);
    }

    @Override
    public Boolean hasMore() {
        return currentIndex < songs.size();
    }
}

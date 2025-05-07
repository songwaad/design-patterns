package org.example.iterator;

import org.example.collection.Collection;
import org.example.collection.Playlist;
import org.example.collection.Song;

import java.util.ArrayList;
import java.util.List;

public class GenreIterator implements MusicIterator{

    private List<Song> songs;
    private Integer currentIndex;
    private String genre;

    public GenreIterator(Collection playlist, String genre) {
        this.songs = new ArrayList<>();
        this.currentIndex = 0;
        this.genre = genre;
        for(int i=0; i<playlist.getSize(); i++) {
            if(playlist.getSong(i).getGenre() == genre) {
                this.songs.add(playlist.getSong(i));
            }
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

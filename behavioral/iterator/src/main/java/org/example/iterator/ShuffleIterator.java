package org.example.iterator;

import org.example.collection.Collection;
import org.example.collection.Playlist;
import org.example.collection.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleIterator implements MusicIterator{

    private List<Song> songs;
    private Integer currentIndex;

    public ShuffleIterator(Collection playlist) {
        this.songs = new ArrayList<>();
        this.currentIndex = 0;

        for (int i =0; i< playlist.getSize(); i++) {
            this.songs.add(playlist.getSong(i));
        }

        Random rand = new Random();

        // Fisher-Yates Shuffle
        for(int i=playlist.getSize()-1; i>0; i--) {
            int j = rand.nextInt(i+1);
            Song temp = this.songs.get(i);
            this.songs.set(i, this.songs.get(j));
            this.songs.set(j, temp);
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

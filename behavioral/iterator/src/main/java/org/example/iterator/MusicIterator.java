package org.example.iterator;

import org.example.collection.Song;

public interface MusicIterator {
    public Song getNext();
    public Boolean hasMore();
}

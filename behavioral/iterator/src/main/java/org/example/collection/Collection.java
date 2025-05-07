package org.example.collection;

import org.example.iterator.MusicIterator;

public interface Collection {
    public MusicIterator createPlaylistIterator();
    public MusicIterator createShuffleIterator();
    public MusicIterator createGenreIterator(String genre);
    public Integer getSize();
    public Song getSong(Integer index);
}

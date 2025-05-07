package org.example;

import org.example.collection.Collection;
import org.example.collection.Playlist;
import org.example.collection.Song;
import org.example.iterator.MusicIterator;

import java.util.Map;



public class Main {

    public static void main(String[] args) {

        Song jodJam = new Song("จดจำ", "Only Monday", "Pop Rock");
        Song sonThoeWaiNaiPhleng = new Song("ซ่อนเธอไว้ในเพลง", "Only Monday", "Pop Rock");
        Song wannanFonKorTokBapNeeLae = new Song("วันนั้นฝนก็ตกแบบนี้แหละ", "Mean", "Pop Rock");
        Song rakRaek = new Song("รักแรก", "Nont Tanont", "Pop");
        Song thoeThoePhueanRaoChob = new Song("เธอๆเพื่อนเราชอบ", "Serious Bacon", "Pop");
        Song phueanDeeDen = new Song("เพื่อนดีเด่น", "Serious Bacon", "Pop");
        Song khorThotTeeTidtThoPai = new Song("ขอโทษที่ติดต่อไป", "Three Man Down", "Rock");
        Song jebPuadTeeNgodNgarm = new Song("เจ็บปวดที่งดงาม", "Retrospect", "Rock");

        Playlist playlist = new Playlist();
        playlist.add(jodJam);
        playlist.add(sonThoeWaiNaiPhleng);
        playlist.add(wannanFonKorTokBapNeeLae);
        playlist.add(rakRaek);
        playlist.add(thoeThoePhueanRaoChob);
        playlist.add(phueanDeeDen);
        playlist.add(khorThotTeeTidtThoPai);
        playlist.add(jebPuadTeeNgodNgarm);

        System.out.println("\nSequence");
        showSong(playlist.createPlaylistIterator());

        System.out.println("\nShuffle 1");
        showSong(playlist.createShuffleIterator());

        System.out.println("\nShuffle 2");
        showSong(playlist.createShuffleIterator());

        System.out.println("\nShuffle 3");
        showSong(playlist.createShuffleIterator());

        System.out.println("\nRock");
        showSong(playlist.createGenreIterator("Rock"));

        System.out.println("\nPop");
        showSong(playlist.createGenreIterator("Pop"));

        System.out.println("\nPop Rock");
        showSong(playlist.createGenreIterator("Pop Rock"));

    }

    public static void showSong(MusicIterator iterator) {
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext().toString());
        }
    }
}


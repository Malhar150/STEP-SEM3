package WEEK_07.HOME_PROBLEM;

import java.util.Arrays;

public class SafePlaylist {

    static class Playlist {

        private final String[] songs;
        private int songCount;

        Playlist(int maxSongs) {
            this.songs = new String[maxSongs];
            this.songCount = 0;
        }

        public boolean addSong(String title) {
            if (songCount >= songs.length) {
                return false;      // playlist full
            }
            songs[songCount] = title;
            songCount++;
            return true;
        }

        public String[] getSongs() {
            return Arrays.copyOf(songs, songCount);   // defensive copy
        }

        public int getSongCount() {
            return songCount;
        }
    }

    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("Copy after edit: " + Arrays.toString(copy));
        System.out.println("Playlist songs:  " + Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}

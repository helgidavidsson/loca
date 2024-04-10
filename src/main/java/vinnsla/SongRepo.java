package vinnsla;

import java.util.ArrayList;
import java.util.List;

public class SongRepo {
    private static List<Song> songs = new ArrayList<>();

    public static void addSong(Song song) {
        songs.add(song);
    }

    public static List<Song> getSongs() {
        return songs;
    }

    public static Song findSongByName(String name) {
        for (Song song : songs) {
            if (song.getSongName().equals(name)) {
                return song; // Return the first song that matches the name
            }
        }
        return null; // Return null if no match is found
    }

}

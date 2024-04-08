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
}

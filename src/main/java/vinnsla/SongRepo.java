package vinnsla;

import java.util.ArrayList;
import java.util.List;

public class SongRepo {
    private static List<Song> songs = new ArrayList<>();

    // Static block to pre-populate songs
    static {

        addSong(new Song("./resources/samples/Gorillaz - Clint Eastwood (Official Video) (320 kbps).mp3",
                "Clint Eastwood", "Gorillaz", "Indie"));
    }

    public static void addSong(Song song) {
        songs.add(song);
    }

    public static List<Song> getSongs() {
        return songs;
    }

}

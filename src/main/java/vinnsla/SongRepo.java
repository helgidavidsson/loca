package vinnsla;

import java.util.ArrayList;
import java.util.List;

public class SongRepo {
    private static List<Song> songs = new ArrayList<>();

    // Static block to pre-populate songs
    static {

        addSong(new Song("./resources/samples/Gorillaz - Clint Eastwood (Official Video) (320 kbps).mp3",
                "Clint Eastwood", "Gorillaz", "Indie"));
        addSong(new Song("./resources/samples/P power (feat. Drake)-1195988677.mp3", "P power","Gunna(feat. Drake)", "Hip Hop"));
        addSong(new Song("./resources/samples/Best Song Ever-101496966.mp3", "Best Song Ever","One Direction","Pop"));
        addSong(new Song("./resources/samples/Seven Days by Craig David-175065308.mp3", "7 days","Craig David","R&B"));
        addSong(new Song("./resources/samples/The Rolling Stones - Paint It Black (ORIGINAL)-317705231.mp3", "Paint It Black","The Rolling Stones","Rock"));
        addSong(new Song("./resources/samples/Radiohead - Treefingers-182265714.mp3", "Treefingers","Radiohead","Ambient"));
    }


    public static void addSong(Song song) {
        songs.add(song);
    }

    public static List<Song> getSongs() {
        return songs;
    }

}

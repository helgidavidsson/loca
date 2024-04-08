package vidmot;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import vinnsla.Song;
import vinnsla.SongRepo;

public class LagalistiController {

    @FXML
    private Label currentGenre;

    @FXML
    private ListView<String> songListView; // Add this line to link to your FXML ListView

    // This method is called from GenreController when the genre changes
    public void setCurrentGenre(String genre) {
        currentGenre.setText(genre);
        updateSongList(genre);
    }

    private void updateSongList(String genre) {
        ObservableList<String> songsForGenre = FXCollections.observableArrayList();
        for (Song song : SongRepo.getSongs()) {
            if (song.getGenre().equalsIgnoreCase(genre)) { // Match the genre, ignoring case
                String displayText = song.getSongName() + " - " + song.getArtistName();
                songsForGenre.add(displayText);
            }
        }
        songListView.setItems(songsForGenre); // Update the ListView with songs matching the genre
    }
}

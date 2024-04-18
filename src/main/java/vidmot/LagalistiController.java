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
    private ListView<String> songListView;

    private SpilariController spilariController;

    public void setSpilariController(SpilariController spilariController) {
        this.spilariController = spilariController;
    }

    public void initialize() {
        setCurrentGenre("All Songs");
        songListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                // When a new song is selected, find its file path and tell SpilariController to
                // play it
                Song selectedSong = SongRepo.findSongByName(newSelection);
                if (selectedSong != null && spilariController != null) {
                    spilariController.playSong(selectedSong.getFilePath());
                }
            }
        });
    }

    public void setCurrentGenre(String genre) {
        currentGenre.setText(genre);
        updateSongList(genre);
    }

    private void updateSongList(String genre) {
        ObservableList<String> songsForGenre = FXCollections.observableArrayList();
        for (Song song : SongRepo.getSongs()) {
            if (genre.equals("All Songs") || song.getGenre().equalsIgnoreCase(genre)) {
                songsForGenre.add(song.getSongName()); // Assuming the song name is unique
            }
        }
        songListView.setItems(songsForGenre);
    }
}

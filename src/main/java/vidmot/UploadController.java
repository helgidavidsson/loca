package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import vinnsla.Song;
import javafx.collections.FXCollections;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import vinnsla.SongRepo;

public class UploadController {

    @FXML
    private TextField filePathField;

    @FXML
    private TextField songNameField;

    @FXML
    private TextField artistNameField;

    @FXML
    private ComboBox<String> genreComboBox;

    // Hér eiga að koma allar tónlistarstefnur
    @FXML
    public void initialize() {
        genreComboBox.setItems(FXCollections.observableArrayList(
                "Pop", "Rokk", "Hip Hop", "Metal Rokk", "Indie",
                "Alt", "Folk", "Country", "Kids Pop", "Klassísk",
                "K pop", "Jazz", "R&B", "Punk", "Ambient"));
    }

    @FXML
    private void onBrowse(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select MP3 File");
        FileChooser.ExtensionFilter mp3Filter = new FileChooser.ExtensionFilter("MP3 files (*.mp3)", "*.mp3");
        fileChooser.getExtensionFilters().add(mp3Filter);
        fileChooser.setSelectedExtensionFilter(mp3Filter);
        Stage stage = (Stage) filePathField.getScene().getWindow();
        var file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            filePathField.setText(file.getAbsolutePath());
        }
    }

    @FXML
    private void onSubmit(ActionEvent event) {
        String filePath = filePathField.getText();
        String songName = songNameField.getText();
        String artistName = artistNameField.getText();
        String genre = genreComboBox.getValue();

        if (filePath.isEmpty() || songName.isEmpty() || artistName.isEmpty() || genre == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Vantar gögn");
            alert.setHeaderText(null);
            alert.setContentText("Vinsamlegast settu inn allar upplýsingar áður en þú vistar");
            alert.showAndWait();
        } else {
            Song newSong = new Song(filePath, songName, artistName, genre);
            SongRepo.addSong(newSong);

            System.out.println("Song added: " + newSong.getSongName());

            // Print the entire list of songs
            System.out.println("Current list of songs:");
            for (Song song : SongRepo.getSongs()) {
                System.out.println("Song Name: " + song.getSongName() + ", Artist Name: " + song.getArtistName()
                        + ", Genre: " + song.getGenre() + ", File Path: " + song.getFilePath());
            }

            Stage stage = (Stage) genreComboBox.getScene().getWindow();
            stage.close();
        }
    }

}

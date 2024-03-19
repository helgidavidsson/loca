package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

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
                "K pop", "Jazz", "R&B", "Punk", "Ambient"

        ));
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

        // Skoðar ef eitthvert atriði er tómt
        if (filePath.isEmpty() || songName.isEmpty() || artistName.isEmpty() || genre == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Vantar gögn");
            alert.setHeaderText(null);
            alert.setContentText("Vinsamlegast settu inn allar upplýsingar áður en þú vistar");
            alert.showAndWait();
        } else {
            // HÉR MUN ÖLL LOGIC KOMA ÞEGAR LAGIÐ HEFUR VERIÐ VISTAÐ
            // S.S. MUNUM VIÐ LÍKLEGA ÞURFA AÐ BÚA TIL EINHVERSKONAR
            // GAGNASAFN AF LÖGUNUM
            System.out.println("File Path: " + filePath);
            System.out.println("Song Name: " + songName);
            System.out.println("Artist Name: " + artistName);
            System.out.println("Genre: " + genre);

            // Loka glugga
            Stage stage = (Stage) genreComboBox.getScene().getWindow();
            stage.close();
        }
    }
}

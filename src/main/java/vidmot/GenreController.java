package vidmot;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class GenreController {

    @FXML
    private ListView<String> genreListView;

    @FXML
    public void initialize() {
        genreListView.setItems(FXCollections.observableArrayList(
                "Pop", "Rokk", "Hip Hop", "Metal Rokk", "Indie",
                "Alt", "Folk", "Country", "Kids Pop", "Klassísk",
                "K pop", "Jazz", "R&B", "Punk", "Ambient"));
    }
}

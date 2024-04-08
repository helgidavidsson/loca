package vidmot;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class lagalistiController {

    private GenreController Genre;


    @FXML
    private ListView<String> Lagalisti;

    @FXML
    public void initalize() {
        Lagalisti.setItems(FXCollections.observableArrayList(
                "Pop", "Rokk", "Hip Hop", "Metal Rokk", "Indie",
                "Alt", "Folk", "Country", "Kids Pop", "Klassísk",
                "K pop", "Jazz", "R&B", "Punk", "Ambient"));
    }

}

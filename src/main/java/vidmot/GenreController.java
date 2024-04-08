package vidmot;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class GenreController {

    @FXML
    private ListView<String> genreListView;

    private LagalistiController lagalistiController;

    public void setLagalistiController(LagalistiController controller) {
        this.lagalistiController = controller;
    }

    @FXML
    public void initialize() {
        genreListView.setItems(FXCollections.observableArrayList(
                "Pop", "Rokk", "Hip Hop", "Metal Rokk", "Indie",
                "Alt", "Folk", "Country", "Kids Pop", "Klassísk",
                "K pop", "Jazz", "R&B", "Punk", "Ambient"));

        genreListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (lagalistiController != null) {
                    lagalistiController.setCurrentGenre(newValue); // Call the method on LagalistiController
                }
            }
        });
    }
}

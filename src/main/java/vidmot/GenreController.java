package vidmot;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

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
                "All Songs", "Pop", "Rock", "Hip Hop", "Metal Rock", "Indie",
                "Alt", "Folk", "Country", "Kids Pop", "Classical",
                "K pop", "Jazz", "R&B", "Punk", "Ambient"));

        genreListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (lagalistiController != null) {
                lagalistiController.setCurrentGenre(newValue); // Update LagalistiController based on the selected genre
            }
        });
    }
}

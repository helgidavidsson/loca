package vidmot;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import java.io.IOException;

public class LagalistiController {

    @FXML
    private Label currentGenre;

    public void setCurrentGenre(String genre) {
        currentGenre.setText(genre);
    }
}

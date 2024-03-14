package vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label helloLabel;

    @FXML
    protected void onHelloButtonClick() {
        helloLabel.setText("Halló Helgi!");
    }
}

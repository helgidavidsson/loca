package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private GenreController genreViewController;

    @FXML
    private LagalistiController lagalistiViewController; // Assuming this is correctly set via <fx:include>

    @FXML
    private SpilariController playerViewController; // This should match fx:id + "Controller"

    @FXML
    private void initialize() throws Exception {
        // Ensure that the genreViewController and lagalistiViewController are already
        // set via FXML injection
        if (genreViewController != null && lagalistiViewController != null) {
            genreViewController.setLagalistiController(lagalistiViewController);
        }

        // Assuming the Spilari view is included in the Main view, its controller should
        // be automatically instantiated.
        // We need to ensure that SpilariController is set in LagalistiController to
        // manage media playback.
        if (lagalistiViewController != null && playerViewController != null) {
            lagalistiViewController.setSpilariController(playerViewController);
        }
    }

    @FXML
    private void onUploadFileClick(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/upload-view.fxml"));
        if (fxmlLoader.getLocation() == null) {
            throw new IllegalStateException("Cannot find upload-view.fxml. Ensure it's in the correct location.");
        }
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Hlaða upp skrá");
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML
    private void exitApplication(ActionEvent event) {
        System.exit(0);
    }

}

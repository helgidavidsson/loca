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
    private LagalistiController lagalistiViewController; // Controller for lagalistiView

    @FXML
    private void initialize() {
        // Now you have references to both controllers, you can set up communication
        // between them
        // For example, by passing a reference of one to the other
        genreViewController.setLagalistiController(lagalistiViewController);

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

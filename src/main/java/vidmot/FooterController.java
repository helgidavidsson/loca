package vidmot;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class FooterController {

    @FXML
    private Label numberOfSongsLabel;

    @FXML
    private ListView<String> categoryListView;

    // Method to update the number of songs in the footer label
    public void updateNumberOfSongs(int numberOfSongs) {
        numberOfSongsLabel.setText("Number of Songs: " + numberOfSongs);
    }

    // Method to update the categories in the category list view
    public void updateCategories(/* You can pass category data here */) {
        // Update categoryListView with the provided data
    }

    // Other methods for additional functionality...
}


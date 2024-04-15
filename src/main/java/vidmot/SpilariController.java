package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.media.MediaPlayer;

public class SpilariController {

    private MediaPlayer mediaPlayer;

    public SpilariController(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @FXML
    protected void onPlay(ActionEvent actionEvent){mediaPlayer.play();}

    @FXML
    protected void onPause(ActionEvent actionEvent){mediaPlayer.pause();}

    @FXML
    protected void onStop(ActionEvent actionEvent){mediaPlayer.stop();}
}

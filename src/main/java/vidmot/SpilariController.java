package vidmot;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

public class SpilariController {

    private MediaPlayer mediaPlayer;

    public void playSong(String filePath) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.dispose(); // Dispose of the old player
        }
        Media media = new Media(new File(filePath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    @FXML
    public void play() {
        if (mediaPlayer != null)
            mediaPlayer.play();
    }

    @FXML
    public void pause() {
        if (mediaPlayer != null)
            mediaPlayer.pause();
    }

    @FXML
    public void stop() {
        if (mediaPlayer != null)
            mediaPlayer.stop();
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
}

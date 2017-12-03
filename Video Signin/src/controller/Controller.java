package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller implements Initializable {

	@FXML
	private MediaView mediaView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Media media2 = new Media(getClass().getResource("../view/media/SWTCWS2.mp4").toExternalForm());
		MediaPlayer player = new MediaPlayer(media2);
		mediaView.setMediaPlayer(player);
		player.setVolume(0);
		player.play();

	}
}

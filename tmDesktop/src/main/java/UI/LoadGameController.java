package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoadGameController implements Initializable {

	private JFileChooser fileChooser;
	private File file;
	private Button confirm;

	@FXML public Button fullScreenButton;

	public void load() {
		// TODO - implement LoadGameController.load
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param event
	 */
	@FXML
	private void backButtonClicked(ActionEvent event) throws Throwable {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation((new java.io.File("src/main/java/UI/view/MainMenu.fxml")).toURI().toURL());
		Scene scene = new Scene(loader.load());
		GameUI.stage.setScene(scene);
		GameUI.stage.setFullScreen(true);
	}

	public void handle(KeyEvent t) {
		if(t.getCode()== KeyCode.ESCAPE)
		{
			fullScreenButton.setVisible(true);
		}
	}

	/**
	 *
	 * @param event
	 */
	@FXML
	private void fullScreenButtonClicked(ActionEvent event) throws Throwable {
		fullScreenButton.setVisible(false);
		GameUI.stage.setFullScreen(true);
	}

	/**
	 * 
	 * @param event
	 */
	public void exitClicked(MouseEvent event) {
		// TODO - implement LoadGameController.exitClicked
		throw new UnsupportedOperationException();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		fullScreenButton.setVisible(false);
	}

}
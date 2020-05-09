
import java.io.IOException;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class StartController implements Initializable{

    @FXML
    private Button playGamebtn;
    
    @FXML
    private Button Instructions;

    @FXML
    private Button Quitbtn;
    
    @FXML
    private MediaView mediaView;
    
    private MediaPlayer mediaPlayer;
    
    private static final String MEDIA_URL = "InstructionVid.mp4";
    		
    @Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		System.out.println(location.toString());
    	System.out.println(this.getClass().getResource(MEDIA_URL).toExternalForm());
    	
    	mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));
    	mediaPlayer.setAutoPlay(true);
    	mediaView.setMediaPlayer(mediaPlayer);
		
	}
    		
    @FXML
    void handleInstructions(ActionEvent event) {
    	Alert alert = new Alert(AlertType.NONE);
		alert.setTitle("INSTRUCTIONS");
		ButtonType ok=new ButtonType("Okay!");
		alert.getDialogPane().getButtonTypes().add(ok);
		alert.setHeaderText(null);
		alert.setContentText("Ogi, the red Monster has gotten lost in a pixel universe. Help Ogi, return home to his friends by winning the dice game.\n" + 
				"\n" + 
				"OBJECTIVE\n" + 
				"\n" + 
				"The objective of this game is to score the maximum number of points which is 20, by rolling dice to make certain combinations. The game is played with three six-sided dice.\n" + 
				"\n" + 
				"GAMEPLAY\n" + 
				"Each player can roll the dice up until a winner is declared. In each turn the dice can be rolled once. This will roll three dice simultaneously, which gives the player a score. There are three combinations of scores which gives you a final score.\n" + 
				"\n" + 
				"SCORE SYSTEM\n" + 
				"•	If the two of the three dices generate a pair, the player score is the sum of that pair.\n" + 
				"•	If all three of dice have the same values, the player score will be 18.\n" + 
				"•	Otherwise, for any other combination, the player score will be 1.\n" + 
				"");
		 alert.showAndWait();

    }

    @FXML
    void handlePlayGame(ActionEvent event) {
    	try{
    		FXMLLoader loader= new FXMLLoader(getClass().getResource("FXML/PlayersNames.fxml"));
    		Parent root=(Parent) loader.load(); 
    		Stage scene = (Stage) playGamebtn.getScene().getWindow();
		    scene.setScene(new Scene(root));
    		}
    		catch(IOException e) {
    		e.printStackTrace(); }
    }

    @FXML
    void handleQuit(ActionEvent event) {
    	 Stage stage = (Stage) Quitbtn.getScene().getWindow();
    	    stage.close();
    }

	

}
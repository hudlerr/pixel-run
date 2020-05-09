import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class FinalController {
	
    @FXML
    private Label winner;
    
    @FXML
    private Label ogi;

    @FXML
    private Button playAgain;

    @FXML
    private Button Quitbtn;
    

    @FXML
    void handlePlayAgain(ActionEvent event) {
    	Parent theRoot;
		try {
			theRoot = FXMLLoader.load(getClass().getResource("FXML/PlayersNames.fxml"));
			Stage scene = (Stage) playAgain.getScene().getWindow();
	        scene.setScene(new Scene(theRoot));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void handleQuit(ActionEvent event) {
    	Stage stage = (Stage) Quitbtn.getScene().getWindow();
	    stage.close();
    }
    
    
	
}


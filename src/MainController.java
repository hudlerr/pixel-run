import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

	public class MainController {	
		public String playerName1, playerName2;
		
		@FXML
	    private TextField player1;

	    @FXML
	    private TextField player2;

	    @FXML
	    private Button startButton;
	    
	    @FXML
	    private ImageView btnback;

	    @FXML
	    void handleStartButton(ActionEvent event) {					
	    if(!player1.getText().isEmpty()&&!player2.getText().isEmpty()) {
    		try {
    			 FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML/Scoreboard.fxml"));
    		        Parent root= loader.load();
    		        DicePageController sc =loader.getController();
    		        sc.setText(player1.getText(),player2.getText());
    		        Stage scene = (Stage) startButton.getScene().getWindow();
    		        scene.setScene(new Scene(root));
    		        scene.getIcons().add(new Image("Images/giphy.gif"));
				} catch (IOException e) {
					System.err.println("Caught IOException: " + e.getMessage());
				}
				} else {	
					Alert alert = new Alert(AlertType.NONE);
		            alert.setTitle("Error");
		            alert.getDialogPane().getButtonTypes().add(ButtonType.OK);
		            alert.setHeaderText(null);
			        
		            alert.setContentText("Please fill in both fields to continue");
		    		alert.showAndWait();
				}
	   		}
	    
	    @FXML
	    void handleBackButton(MouseEvent event) throws Exception{
	    	 Parent theRoot = FXMLLoader.load(getClass().getResource("FXML/StartPage.fxml"));
	         Stage scene = (Stage) btnback.getScene().getWindow();
	         scene.setScene(new Scene(theRoot));
	    }
		 }

	

	

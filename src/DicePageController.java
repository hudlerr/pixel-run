

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;


public class DicePageController {
	
	private Dice dice;
	private int score;
	private Player p1;
	private Player p2;
	private static int MAX_SCORE = 15;  //I SET OUR MAX SCORE TO 15 
    private static int MIN_ROLLS = 0;
	private int rollsRemaining = MAX_SCORE;
	int count1, count2;
	
	
	public DicePageController() {
		dice = new Dice(6);
		p1 = new Player();
		p2 = new Player();
	}
	
	
	@FXML
    private Button player1;

    @FXML
    private ImageView die1;

    @FXML
    private Button player2;

    @FXML
    private ImageView die2;
    
    @FXML
    private ImageView die3;

    @FXML
    private ImageView die4;
    
    @FXML
    private Label p1Current;

    @FXML
    private Label p1Total;
    
   @FXML
    private Label p2Total;

    @FXML
    private Label p2Current;
    
    @FXML
    private ImageView btnback;
    
    @FXML
    private VBox vbox; 

    @FXML
    private ImageView die6;

    @FXML
    private ImageView die5;
    
    @FXML
    private Label leader;
    
	
    //Action button for player one
    @FXML
    public void PlayerOneClicked(ActionEvent event) {
    	count1++;	//Records equal number of turns
    	rollsRemaining--; // decrease remaining rolls for each roll done
    	disableMouseInput(p1); // to avoid double rolls and locking old score
    	
    	//Calculate score using an array list to change images shown according to score.
    	List<Integer> l2 = new ArrayList<Integer>();
		l2.clear();
    	int [] roll=new int[3]; 
    	for(int i=0;i<3;i++){
    		roll[i]=dice.roll(6);
    		l2.add(roll[i]);
    		
    	}
    	
    	boolean flag = true;
    	int first = roll[0];
    	for(int i = 1; i < 3 && flag; i++) {
    		if (roll[i] != first) flag = false;
    		die1.setImage(new Image("Images/die"+l2.get(0)+".png"));
    	    die5.setImage(new Image("Images/die"+l2.get(1)+".png"));
    	    die6.setImage(new Image("Images/die"+l2.get(2)+".png"));
    	
    	    
    	  //Transitions to move dice
    	    
    	    FadeTransition ft3 = new FadeTransition();{
	   		     ft3.setFromValue(1.5);
	   		     ft3.setToValue(1.5);
	   		     //ft.setCycleCount(2f);
	   		     ft3.setAutoReverse(true);
	   		     TranslateTransition tt3 = new TranslateTransition();
	   		     tt3.setFromX(0f);
	   		     tt3.setToX(0f);
	   		     //tt.setCycleCount(2f);
	   		     tt3.setAutoReverse(true);
	   		     RotateTransition rt3 = new RotateTransition();
	   		     rt3.setByAngle(180f);
	   		     //rt.setCycleCount(4f);
	   		     rt3.setAutoReverse(true);
	   		     ScaleTransition st3 = new ScaleTransition();
	   		     st3.setByX(0.0f);
	   		     st3.setByY(0.0f);
	   		     //st.setCycleCount(2f);
	   		     st3.setAutoReverse(true);
	   		 
	   		     ParallelTransition pt3 = new ParallelTransition(die5, ft3, tt3, rt3, st3);
	   		     pt3.play();
	   		     }
	    	    
	    	    FadeTransition ft4 = new FadeTransition();{
		   		     ft4.setFromValue(1.5);
		   		     ft4.setToValue(1.5);
		   		     //ft.setCycleCount(2f);
		   		     ft4.setAutoReverse(true);
		   		     TranslateTransition tt4 = new TranslateTransition();
		   		     tt4.setFromX(0f);
		   		     tt4.setToX(0f);
		   		     //tt.setCycleCount(2f);
		   		     tt4.setAutoReverse(true);
		   		     RotateTransition rt4 = new RotateTransition();
		   		     rt4.setByAngle(180f);
		   		     //rt.setCycleCount(4f);
		   		     rt4.setAutoReverse(true);
		   		     ScaleTransition st4 = new ScaleTransition();
		   		     st4.setByX(0.0f);
		   		     st4.setByY(0.0f);
		   		     //st.setCycleCount(2f);
		   		     st4.setAutoReverse(true);
		   		 
		   		     ParallelTransition pt4 = new ParallelTransition(die6, ft4, tt4, rt4, st4);
		   		     pt4.play();
		   		     }
	    	    
	    	    FadeTransition ft5 = new FadeTransition();{
		   		     ft5.setFromValue(1.5);
		   		     ft5.setToValue(1.5);
		   		     //ft.setCycleCount(2f);
		   		     ft5.setAutoReverse(true);
		   		     TranslateTransition tt5 = new TranslateTransition();
		   		     tt5.setFromX(0f);
		   		     tt5.setToX(0f);
		   		     //tt.setCycleCount(2f);
		   		     tt5.setAutoReverse(true);
		   		     RotateTransition rt5 = new RotateTransition();
		   		     rt5.setByAngle(180f);
		   		     //rt.setCycleCount(4f);
		   		     rt5.setAutoReverse(true);
		   		     ScaleTransition st5 = new ScaleTransition();
		   		     st5.setByX(0.0f);
		   		     st5.setByY(0.0f);
		   		     //st.setCycleCount(2f);
		   		     st5.setAutoReverse(true);
		   		 
		   		     ParallelTransition pt5 = new ParallelTransition(die1, ft5, tt5, rt5, st5);
		   		     pt5.play();
		   		     }
    	
    	
    	}
    	
    		if (flag) {
    			score=18;
    		} else {
    			Arrays.sort(roll);
    		} if (roll[0] == roll[1]) {
    			score = roll[0] + roll[1]; 
    		} else if (roll[1] == roll[2]) {
    			score = roll[1] + roll[2]; 
    		} else {
    			score=1;
    		}
    	
    		
    	p1Current.setText(Integer.toString(score));
    	p1.updatePlayerScore(score);
    	p1Total.setText(Integer.toString(p1.getPlayerScore()));
    	enableRollButton2();
    	highlightCurrentPlayer2();
    	disableHighlight();
    	leadername();
    	
    	//if turns are equal, do maxscoreReached
    	if(count1==count2){
    		maxscoreReached();
    	}else {
    		System.out.println(count1);	
    	}
    }

    
  //Action button for player two
	@FXML
    void PlayerTwoClicked(ActionEvent event) {
		count2++;
    	rollsRemaining--; 
		disableMouseInput2(p2); 
		
		
	    
		List<Integer> l1 = new ArrayList<Integer>();
		l1.clear();
    	int [] roll=new int[3]; 
    	for(int i=0;i<3;i++)  {
    		roll[i]=dice.roll(6);
    		l1.add(roll[i]);
    	}
    		
    	boolean flag = true;
    	int first = roll[0];
    	for(int i = 1; i < 3 && flag; i++) {
    		if (roll[i] != first) flag = false;
    		die2.setImage(new Image("Images/die"+l1.get(0)+".png"));
    	    die3.setImage(new Image("Images/die"+l1.get(1)+".png"));
    	    die4.setImage(new Image("Images/die"+l1.get(2)+".png"));
    	    System.out.println("second image");
    	
    	    
    	    
    	    //Transitions to move dice
    	    
    	    FadeTransition ft = new FadeTransition();{
    		     ft.setFromValue(1.5);
    		     ft.setToValue(1.5);
    		     //ft.setCycleCount(2f);
    		     ft.setAutoReverse(true);
    		     TranslateTransition tt = new TranslateTransition();
    		     tt.setFromX(0f);
    		     tt.setToX(0f);
    		     //tt.setCycleCount(2f);
    		     tt.setAutoReverse(true);
    		     RotateTransition rt = new RotateTransition();
    		     rt.setByAngle(180f);
    		     //rt.setCycleCount(4f);
    		     rt.setAutoReverse(true);
    		     ScaleTransition st = new ScaleTransition();
    		     st.setByX(0.0f);
    		     st.setByY(0.0f);
    		     //st.setCycleCount(2f);
    		     st.setAutoReverse(true);
    		 
    		     ParallelTransition pt = new ParallelTransition(die2, ft, tt, rt, st);
    		     pt.play();
    		     }
    		     FadeTransition ft1 = new FadeTransition();{
    			     ft1.setFromValue(1.5);
    			     ft1.setToValue(1.5);
    			     //ft.setCycleCount(2f);
    			     ft1.setAutoReverse(true);
    			     TranslateTransition tt1 = new TranslateTransition();
    			     tt1.setFromX(0f);
    			     tt1.setToX(0f);
    			     //tt.setCycleCount(2f);
    			     tt1.setAutoReverse(true);
    			     RotateTransition rt1 = new RotateTransition();
    			     rt1.setByAngle(180f);
    			     //rt.setCycleCount(4f);
    			     rt1.setAutoReverse(true);
    			     ScaleTransition st1 = new ScaleTransition();
    			     st1.setByX(0.0f);
    			     st1.setByY(0.0f);
    			     //st.setCycleCount(2f);
    			     st1.setAutoReverse(true);
    			 
    			     ParallelTransition pt1 = new ParallelTransition(die3, ft1, tt1, rt1, st1);
    			     pt1.play();
    			     }
    		     
    		     FadeTransition ft2 = new FadeTransition();{
    			     ft2.setFromValue(1.5);
    			     ft2.setToValue(1.5);
    			     //ft.setCycleCount(2f);
    			     ft2.setAutoReverse(true);
    			     TranslateTransition tt2 = new TranslateTransition();
    			     tt2.setFromX(0f);
    			     tt2.setToX(0f);
    			     //tt.setCycleCount(2f);
    			     tt2.setAutoReverse(true);
    			     RotateTransition rt2 = new RotateTransition();
    			     rt2.setByAngle(180f);
    			     //rt.setCycleCount(4f);
    			     rt2.setAutoReverse(true);
    			     ScaleTransition st2 = new ScaleTransition();
    			     st2.setByX(0.0f);
    			     st2.setByY(0.0f);
    			     //st.setCycleCount(2f);
    			     st2.setAutoReverse(true);
    			 
    			     ParallelTransition pt2 = new ParallelTransition(die4, ft2, tt2, rt2, st2);
    			     pt2.play();
    			     }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	}
	
    		if (flag) {
    			score=18;
    		} else {
    			Arrays.sort(roll);
    		} if (roll[0] == roll[1]) {
    			score = roll[0] + roll[1];  
    		} else if (roll[1] == roll[2]) {
    			score = roll[1] + roll[2]; 
    		} else {
    			score=1;
    	}
    		
    	p2Current.setText(Integer.toString(score)); 
    	p2.updatePlayerScore(score);
    	p2Total.setText(Integer.toString(p2.getPlayerScore()));
    	enableRollButton();
    	highlightCurrentPlayer();
    	disableHighlight2();
    	leadername();
    	if(count1==count2){
    		maxscoreReached();
    	}else {
    		System.out.println(count2);
    	}
    	
    }

	 @FXML
	    void handleBackButton(MouseEvent event) throws Exception {
		 Parent theRoot = FXMLLoader.load(getClass().getResource("FXML/PlayersNames.fxml"));
	        Stage scene = (Stage) btnback.getScene().getWindow();
	        scene.setScene(new Scene(theRoot));
	 }
    
    
    /**
     * END GAME USING PREDEFINED MAX SCORE
     */
    public void maxscoreReached() {
        if(p1.getPlayerTotal() >= 15 || p2.getPlayerTotal() >= 15) {
        disableMouseInput(p1);
        disableMouseInput2(p2);
            
        //Alert box
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle("CONGRATULATIONS");
        ButtonType ok=new ButtonType("ok");
        alert.getDialogPane().getButtonTypes().add(ok);
        alert.setHeaderText(null);
         
         
        //Possibilities of game ending
          if (p1.getPlayerTotal()>p2.getPlayerTotal()) {
                alert.setContentText("The Winner is "+ player1.getText());}
          if(p2.getPlayerTotal()>p1.getPlayerTotal()) {
                alert.setContentText("The Winner is "+player2.getText());}
          if(p1.getPlayerTotal()>15 && p2.getPlayerTotal() > 15) {
                 alert.setContentText("It's a Draw! ");
                 }
         alert.showAndWait();
         
         //Take us to final page
          if(ButtonType.OK==ok);{
            try{
          FXMLLoader loader= new FXMLLoader(getClass().getResource("FXML/LastPage.fxml"));
            Parent root=(Parent) loader.load(); 
            Stage scene = (Stage) player1.getScene().getWindow();
            scene.setScene(new Scene(root));
            }
            catch(IOException e) {
            e.printStackTrace(); 
            }}} 
          
          }
 
    /*
     * Print LeaderName
     */
    public void leadername() {
    	if (p1.getPlayerTotal()>p2.getPlayerTotal()) {
    		leader.setText(player1.getText()+" is leading");
    	}
    	else if (p2.getPlayerTotal()>p1.getPlayerTotal()){ 
    		leader.setText(player2.getText()+" is leading");
    		}
    	}
    
    
    
    
    /* 
	 * Mouse buttons
	 */
	private void disableMouseInput(Player p1) {
	        player1.setDisable(true);
    }
    
	private void disableMouseInput2(Player p2) {
       // disableRollButton();
        player2.setDisable(true);
    }
	
	private void resetRollButton() {
        rollsRemaining = MAX_SCORE;
        enableRollButton();
        enableRollButton2();
    }
	
	private void enableRollButton() {
        boolean state = rollsRemaining <= MIN_ROLLS;
        player1.setDisable(state);
    }
	
	private void enableRollButton2() {
        boolean state = rollsRemaining <= MIN_ROLLS;
        player2.setDisable(state);
    }
	
	
	
    /**
     * Highlight the name of the current player in the GUI
     */
    private void highlightCurrentPlayer() {
    	player1.setStyle(
                "-fx-background-color: gold;" + 
                "-fx-text-fill: white");
    }
    
    private void highlightCurrentPlayer2() {
    	player2.setStyle(
                "-fx-background-color: gold;" + 
                "-fx-text-fill: white");
    }
    
    private void disableHighlight() {
    	player1.setStyle(
    			"-fx-background-color: #EBEBEB;" + 
                "-fx-text-fill: black");
    }
    
    private void disableHighlight2() {
    	player2.setStyle(
                "-fx-background-color: #EBEBEB;" + 
                "-fx-text-fill: black");
    }
 
    
    
    
	public void setText(String name1,String name2){
        player1.setText(name1);
        player2.setText(name2);
    }
}
  

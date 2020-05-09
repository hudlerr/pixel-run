import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

		@Override
		public void start(Stage primaryStage) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("FXML/StartPage.fxml")); 
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Save OGI !");
		primaryStage.show();
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}



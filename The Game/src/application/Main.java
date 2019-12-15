package application;
	
import javafx.application.Application;
import javafx.stage.Stage; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.util.ResourceBundle;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	@Override
		public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Gui.fxml"));
			Parent find = FXMLLoader.load(getClass().getResource("/application/Gui.fxml"));
			Scene scene = new Scene(root);
			Scene make  = new Scene(find);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.*;
import javafx.application.Application;

public class Alert {
/*
	public static void diplay(String title, String message){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close Window");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		// TODO Auto-generated method stub
		window.showAndWait();

	}
/*
	public static Object display(String string, String string2) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(string);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(string2);
		Button closeButton = new Button("Close Window");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		// TODO Auto-generated method stub
		window.showAndWait();
		return "";
	}
	*/
	
/*	public void display(Stage stage)  throws Exception {
		VBox root = new VBox (10);
		Button btn = new Button("show");
		btn.setOnAction(e -> {
			
			Alert dg = new Alert (Alert.AlertType.INFORMATION);
		dg.setTitle("Indormation");
		dg.setContentText("My Name Is Nigger1234");
		dg.show();
		});
		
		Scene scene = new Scene(root, 300, 300);
		root.getChildren().add(btn);
		stage .setScene(scene);
		stage.show();
		}
*
}
*/
}
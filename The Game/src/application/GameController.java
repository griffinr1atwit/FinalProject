package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class GameController {
	@FXML
	Button submit;
	@FXML
	Button clear;
	@FXML
	Label label;
	@FXML
	Label label2;
	@FXML
	TextField guess;
	@FXML
	Label Label3;
	@FXML
	Label changeMe;
	@FXML
	Label changeMe1;
	@FXML
	Label changeMe2;
	
	private int MAX = 25;
	private int MIN = 1;
	private String ERROR = "Not between 1 and 25";
	
	Alert info = new Alert(Alert.AlertType.INFORMATION);
	int random_number;
	int life = 3;

	public GameController() {
		rand();
	}

	public void rand() { //how to generate a random number to be seeen/used by other numbers

		random_number = new Random().nextInt((MAX - MIN) + 1) + MIN; // (max - min)+1+min
		
	}
	
	public void submitClick() {
		life--;
		labelchange();
		

		String str = guess.getText();
		int number;

		try {
			number = Integer.parseInt(str);
				while (number == random_number) {
					ifCorrect();
					break;
				}

				while (number > random_number) {
					ifHigher();
					break;
				}
					
				while (number < random_number) {
					ifLower();
					break;
				}
				
				if (number < 0 || number > 25) {
					label.setText(ERROR);
					System.exit(0);
				}

			} catch (NumberFormatException ex) {

		}
		if (life == 0) {
			labelchanger();
		}
		if (life == -1) {
			option();
		}
		if (life == -2) {
			System.exit(0);
		}
		
		
		while (life !=0) {
		thankYou();
		break;
		}
	}
	private void ifLower() {
		
		changeMe.setText("Too Low");
	}

	private void ifHigher() {
		changeMe1.setText("Too High");
		
	}

	private void ifCorrect() {
		changeMe2.setText("CORRECT!");
		
	}

	public void thankYou() {

		
		win z = new win();

		if (life >= 0) {
			z.print_yes();
		}
	}

	public void option() {

		label.setText("Click Restart To Play again. Once more to quit");

	}

	public void labelchanger() {
		label.setText("You have ran out of guesses");

	}

	public void labelchange() {
		label.setText("You have " + life + " chances left");
		guess.setText("");

	}

	public void startOver() {
		rand();
		life = 3;
		labelchange();

	}
	

}

class finals extends GameController {
	public void print_win() {
		System.out.println("You");
	}
}

class win extends finals {

	public void print_yes() {
		System.out.println("Thanks for playing!");
	}

	{
	}
}


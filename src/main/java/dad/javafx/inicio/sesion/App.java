package dad.javafx.inicio.sesion;

import dad.inicio.sesion.inicioController;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private inicioView inicioView;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
	

		
		Scene primaryStage = new Scene();
		
		Stage verStage = new Stage();
		verStage.setTitle("Ver");
		verStage.setScene(verScene);
		verStage.show();

		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
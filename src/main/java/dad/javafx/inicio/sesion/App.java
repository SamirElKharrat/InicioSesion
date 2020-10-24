package dad.javafx.inicio.sesion;

import dad.inicio.sesion.inicioController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	private inicioController verController;

	
	@Override
	public void start(Stage primaryStage) throws Exception {

		verController = new inicioController();
		
		Scene escena = new Scene(verController.getView(), 350,250);
		
		primaryStage.setTitle("Inicio Sesion");
		primaryStage.setScene(escena);
		primaryStage.show();

		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
package dad.inicio.sesion;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class inicioView extends BorderPane {
	
	private TextField usuarioTf;
	private PasswordField contrase�aPf;
	
	private Button accederBt, cancelarBt;
	
	public inicioView() {
		super();
		
		usuarioTf = new TextField();
		usuarioTf.setPromptText("Usuario");
		contrase�aPf = new PasswordField();
		contrase�aPf.setPromptText("Contrase�a");
		
		accederBt = new Button("Acceder");
		accederBt.setDefaultButton(true);
		cancelarBt = new Button("Cancelar");
		
		HBox botones = new HBox(5, accederBt, cancelarBt);
		botones.setAlignment(Pos.BASELINE_CENTER);
		
		GridPane centro = new GridPane();
		centro.setHgap(15);
		centro.setVgap(15);
		centro.setAlignment(Pos.CENTER);
		centro.addRow(0, new Label("Usuario: "),usuarioTf);
		centro.addRow(1, new Label("Contrase�a: "),contrase�aPf);

		
		centro.add(botones, 0, 2);
		GridPane.setColumnSpan(botones, 2);
		
		this.setCenter(centro);
		
		
		
	    
	}


	public TextField getUsuarioTf() {
		return usuarioTf;
	}

	public PasswordField getContrase�aPf() {
		return contrase�aPf;
	}

	public Button getAccederBt() {
		return accederBt;
	}

	public Button getCancelarBt() {
		return cancelarBt;
	}
	
	

}

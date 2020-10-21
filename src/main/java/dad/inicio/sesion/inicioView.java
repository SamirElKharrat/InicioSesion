package dad.inicio.sesion;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class inicioView extends BorderPane {
	
	private TextField usuarioTf;
	private PasswordField contraseñaPf;
	
	private Button accederBt, cancelarBt;
	
	public inicioView() {
		super();
		
		usuarioTf = new TextField();
		contraseñaPf = new PasswordField();
		
		accederBt = new Button();
		cancelarBt = new Button();
		
		HBox botones = new HBox(5, accederBt, contraseñaPf);
		
		GridPane centro = new GridPane();
		centro.addRow(0, new Label("Usuario: "),usuarioTf);
		centro.addRow(1, new Label("Contraseña: "),contraseñaPf);

		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),	
			};
		
		
		centro.getColumnConstraints().setAll(cols);
		cols[0].setHalignment(HPos.LEFT);

		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		GridPane Boxito = new GridPane();
		Boxito.setPadding(new Insets(5, 5, 0, 0));
		Boxito.setHgap(10);
		Boxito.setVgap(5);
		
		Boxito.addRow(0, botones);

		
		centro.add(Boxito, 1, 2);
		
		setCenter(centro);
		
		
	    
	}

	public TextField getUsuarioTf() {
		return usuarioTf;
	}

	public PasswordField getContraseñaPf() {
		return contraseñaPf;
	}

	public Button getAccederBt() {
		return accederBt;
	}

	public Button getCancelarBt() {
		return cancelarBt;
	}
	
	

}

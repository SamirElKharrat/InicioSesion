package dad.inicio.sesion;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class inicioModel {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contraseña = new SimpleStringProperty();
	
	private HashMap<String, String> inicioSesion = new HashMap<String,String>();
	
}

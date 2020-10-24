package dad.inicio.sesion;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class inicioModel {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contraseña = new SimpleStringProperty();

	private HashMap<String, String> inicioSesion;

	public inicioModel(HashMap<String, String> inicioSesion) {
		this.inicioSesion = inicioSesion;
	}

	public HashMap<String, String> getInicioSesion() {
		return inicioSesion;
	}

	public void setInicioSesion(HashMap<String, String> inicioSesion) {
		this.inicioSesion = inicioSesion;
	}


	public final StringProperty usuarioProperty() {
		return this.usuario;
	}

	public final String getUsuario() {
		return this.usuarioProperty().get();
	}

	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}

	public final StringProperty contraseñaProperty() {
		return this.contraseña;
	}

	public final String getContraseña() {
		return this.contraseñaProperty().get();
	}

	public final void setContraseña(final String contraseña) {
		this.contraseñaProperty().set(contraseña);
	}

}

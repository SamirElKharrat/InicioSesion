package dad.inicio.sesion;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class inicioModel {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contrase�a = new SimpleStringProperty();

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

	public final StringProperty contrase�aProperty() {
		return this.contrase�a;
	}

	public final String getContrase�a() {
		return this.contrase�aProperty().get();
	}

	public final void setContrase�a(final String contrase�a) {
		this.contrase�aProperty().set(contrase�a);
	}

}

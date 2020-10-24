package dad.inicio.sesion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.codec.digest.DigestUtils;

import javafx.application.Platform;

public class inicioController {
	
	private inicioView view = new inicioView();
	
	private inicioModel model;
	
	
	public inicioController() throws IOException {
		
		try {
			model = new inicioModel(insercionFichero("Contraseña.csv"));
		}catch(IOException e) {
			e.getStackTrace();
		}

		
		model.usuarioProperty().bind(view.getUsuarioTf().textProperty());
		model.contraseñaProperty().bind(view.getContraseñaPf().textProperty());
		
		view.getCancelarBt().setOnAction(e -> Platform.exit());
		view.getAccederBt().setOnAction(e -> Comprobar());


	}
	

	private HashMap<String, String> insercionFichero(String nom) throws IOException {

	    BufferedReader br =new BufferedReader(new FileReader(nom));
		HashMap<String, String> resultado = new HashMap<String, String>();
        String  line = "";
		
		while((line = br.readLine()) != null) {
			String[] field = line.split(",");
			resultado.put(field[0], field[1]);
		}
		
		br.close();
		return resultado;

}
	public boolean usuarioExistente() {
		return model.getInicioSesion().containsKey(model.getUsuario());
	}
	
	private void Comprobar() {
		if(usuarioExistente()) {
		String md5 = DigestUtils.md5Hex(model.getContraseña()).toUpperCase();
		if(model.getInicioSesion().get(model.getUsuario()).equals(md5))
			view.accesoConcedido();
		else	
			view.accesoNoConcedido();
		}else {
			view.nombreNoCorrecto();
		}
		
	}
	
	
	
	

	public inicioView getView() {
		return view;
	}

	public void setView(inicioView view) {
		this.view = view;
	}





}
package ar.edu.unq.po2.tpSOLIDrefactorizado;

import java.util.List;

import ar.edu.unq.po2.tpSOLID.Correo;

public interface IServidorCorreo {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
}

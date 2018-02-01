package Model;

public class Usuario {

	private String usuario;
	private String tipo;
	private String password;

	/**
	 * Permite acceder al tipo del usuario
	 * @return Tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Permite acceder al nombre del usuario
	 * @return usuario
	 */
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Permite acceder a la contrasena del usuario
	 * @return contrasena
	 */
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}

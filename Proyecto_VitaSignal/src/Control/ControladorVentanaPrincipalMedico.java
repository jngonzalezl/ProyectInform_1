package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import View.VentanaLogin;
import View.VentanaPrincipalMedico;

public class ControladorVentanaPrincipalMedico implements ActionListener {

	private VentanaPrincipalMedico view;
	private VentanaLogin vntLogin;
	private ControladorLogin cntrlLogin;
	
	/**
	 * Permite acceder controlador login
	 * @return controladorLogin
	 */
	
	public ControladorLogin getCntrlLogin() {
		return cntrlLogin;
	}

	public void setCntrlLogin(ControladorLogin cntrlLogin) {
		this.cntrlLogin = cntrlLogin;
	}

	/**
	 * Asigna la ventana
	 * @param view la ventana principal medico
	 */

	public ControladorVentanaPrincipalMedico(VentanaPrincipalMedico view) {
		super();
		this.view = view;
	}

	/**
	 * Controla lo que ocurre al pulsar "Cerrar sesion"
	 */

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		switch(evento.getActionCommand()){
		
		case "Cerrar sesion":{
			try {
				cntrlLogin=view.getCntrlVenMed().cntrlLogin;
				vntLogin = new VentanaLogin(cntrlLogin);
				cntrlLogin.setV1(vntLogin);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			vntLogin.setVisible(true);
			view.dispose();
			break;
		}
				
		}
		
		
	}

}

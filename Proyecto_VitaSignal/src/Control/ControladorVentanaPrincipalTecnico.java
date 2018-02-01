package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import View.VentanaLogin;
import View.VentanaPrincipalMedico;
import View.VentanaPrincipalTecnico;

public class ControladorVentanaPrincipalTecnico implements ActionListener{

	private VentanaPrincipalTecnico view;
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
	 * @param view la ventana principal tecnico
	 */
	
	public ControladorVentanaPrincipalTecnico(VentanaPrincipalTecnico view) {
		super();
		this.view = view;
	}

	/**
	 * Controla lo que ocurre al pulsar "Cerrar sesion"
	 */

	public void actionPerformed(ActionEvent evento) {
		
		switch(evento.getActionCommand()){
		case "Cerrar sesion":{
			
			try {
				cntrlLogin=view.getCntrlVenTec().cntrlLogin;
				vntLogin = new VentanaLogin(cntrlLogin);
				cntrlLogin.setV1(vntLogin);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			vntLogin.setVisible(true);
			view.dispose();
			break;
		}
				
		}
		
		
	}
}

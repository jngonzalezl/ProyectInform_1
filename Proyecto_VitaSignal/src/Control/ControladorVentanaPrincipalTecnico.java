package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import View.VentanaLogin;
import View.VentanaPrincipalMedico;
import View.VentanaPrincipalTecnico;

public class ControladorVentanaPrincipalTecnico implements ActionListener{

	VentanaPrincipalTecnico view;
	
	VentanaLogin vntLogin;
	
	ControladorLogin cntrlLogin;
	
	
	public ControladorLogin getCntrlLogin() {
		return cntrlLogin;
	}



	public void setCntrlLogin(ControladorLogin cntrlLogin) {
		this.cntrlLogin = cntrlLogin;
	}



	public ControladorVentanaPrincipalTecnico(VentanaPrincipalTecnico view) {
		super();
		this.view = view;
	}



	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		switch(arg0.getActionCommand()){
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

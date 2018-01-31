package View;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;

import Control.ControladorVentanaPrincipalAdministrador;
import Control.ControladorVentanaPrincipalTecnico;

public class VentanaPrincipalAdministrador extends JFrame {

	ControladorVentanaPrincipalAdministrador cntrlVenAdmin;

	public ControladorVentanaPrincipalAdministrador getCntrlVenAdmin() {
		return cntrlVenAdmin;
	}
	
	
	public VentanaPrincipalAdministrador() {
		this.setTitle("Ventana Principal Administrador");

		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        
		cntrlVenAdmin = new ControladorVentanaPrincipalAdministrador(this);

		this.setBounds(200, 200, 500, 500);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sesion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mntmCerrarSesion.addActionListener(cntrlVenAdmin);
		mnNewMenu.add(mntmCerrarSesion);
		
		//JMenu mnAdmrPacientes = new JMenu("Admr. Pacientes");
		//menuBar.add(mnAdmrPacientes);
		
		//JMenuItem mntmVerPacientes = new JMenuItem("Ver pacientes");
		//mnAdmrPacientes.add(mntmVerPacientes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		

	
		
		
		JButton btnNuevoTecnico = new JButton("Nuevo Tecnico");
		btnNuevoTecnico.addActionListener(cntrlVenAdmin);
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoTecnico, 177, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoTecnico, 41, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNuevoTecnico, 234, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoTecnico, 203, SpringLayout.WEST, getContentPane());

		getContentPane().add(btnNuevoTecnico);
		
		JButton btnNuevoMedico = new JButton("Nuevo Medico");
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoMedico, 6, SpringLayout.NORTH, btnNuevoTecnico);
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoMedico, -214, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNuevoMedico, 228, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoMedico, -81, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnNuevoMedico);
	
	}
}

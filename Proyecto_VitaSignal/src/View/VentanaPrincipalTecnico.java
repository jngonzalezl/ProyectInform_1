package View;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;

import Control.ControladorVentanaPrincipalMedico;
import Control.ControladorVentanaPrincipalTecnico;

import java.awt.Frame;

import javax.swing.JButton;

public class VentanaPrincipalTecnico extends JFrame{
	
	
	ControladorVentanaPrincipalTecnico cntrlVenTec;

	public ControladorVentanaPrincipalTecnico getCntrlVenTec() {
		return cntrlVenTec;
	}
	
	
	public VentanaPrincipalTecnico() {
		
		this.setTitle("Ventana Principal Tecnico");

		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        
		cntrlVenTec=new ControladorVentanaPrincipalTecnico(this);

		this.setBounds(200, 200, 500, 500);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sesion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mntmCerrarSesion.addActionListener(cntrlVenTec);
		mnNewMenu.add(mntmCerrarSesion);
		
		//JMenu mnAdmrPacientes = new JMenu("Admr. Pacientes");
		//menuBar.add(mnAdmrPacientes);
		
		//JMenuItem mntmVerPacientes = new JMenuItem("Ver pacientes");
		//mnAdmrPacientes.add(mntmVerPacientes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		

	
		
		
		JButton btnNuevoPaciente = new JButton("Añadir ECG");
		btnNuevoPaciente.addActionListener(cntrlVenTec);
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoPaciente, 177, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoPaciente, 41, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNuevoPaciente, 234, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoPaciente, 203, SpringLayout.WEST, getContentPane());

		getContentPane().add(btnNuevoPaciente);
	
	}
}

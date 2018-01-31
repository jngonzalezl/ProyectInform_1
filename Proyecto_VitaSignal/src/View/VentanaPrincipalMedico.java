package View;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import java.awt.Frame;

import Control.ControladorVentanaPrincipalMedico;


public class VentanaPrincipalMedico extends JFrame{
	
	ControladorVentanaPrincipalMedico cntrlVenMed;

	public ControladorVentanaPrincipalMedico getCntrlVenMed() {
		return cntrlVenMed;
	}

	public VentanaPrincipalMedico() {
		this.setTitle("Ventana Principal Medico");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		cntrlVenMed=new ControladorVentanaPrincipalMedico(this);
        //this.setExtendedState(MAXIMIZED_BOTH);

		
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

        this.setBounds(200, 200, 500, 500);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sesion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mntmCerrarSesion.addActionListener(cntrlVenMed);
		mnNewMenu.add(mntmCerrarSesion);
		
		JMenu mnAdmrPacientes = new JMenu("Admr. Pacientes");
		menuBar.add(mnAdmrPacientes);
		
		JMenuItem mntmVerPacientes = new JMenuItem("Ver pacientes");
		mnAdmrPacientes.add(mntmVerPacientes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		

	
		
		
		JButton btnNuevoPaciente = new JButton("Nuevo Paciente");
		btnNuevoPaciente.addActionListener(cntrlVenMed);
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoPaciente, 177, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoPaciente, 41, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNuevoPaciente, 234, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoPaciente, 203, SpringLayout.WEST, getContentPane());

		getContentPane().add(btnNuevoPaciente);
	
	}

	
}

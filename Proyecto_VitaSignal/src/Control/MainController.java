package Control;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Usuario;
import View.VentanaLogin;


/**
 * El controlador principal que se encarga de todas las acciones realizadas en el menu del programa
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
 * @author Miguel Chacon
 *
 */

public class MainController {

	public static void main(String[] args) {
		File f = new File("src/Usuarios/users.txt");
		FileReader fr;
		BufferedReader br;
		
		
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		
		try {
			
			fr = new FileReader(f);
			Scanner scanner;
			scanner = new Scanner(fr).useDelimiter(";|\r\n|\n");
			
			while (scanner.hasNext()) {
				Usuario u1 = new Usuario();
				
			    u1.setUsuario(scanner.next());   
			    u1.setPassword(scanner.next());
			    u1.setTipo(scanner.next());
			    users.add(u1);		    

			}
			
	
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		ControladorLogin cntrlLogin = new ControladorLogin(users);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					VentanaLogin venLogin = new VentanaLogin(cntrlLogin);
					cntrlLogin.setV1(venLogin);
					venLogin.setVisible(true);
					venLogin.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	}



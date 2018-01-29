import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import Control.ControladorLogin;
import Model.Usuario;
import View.VentanaLogin;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("src/Usuarios/users.txt");
		FileReader fr;
		BufferedReader br;
		Usuario u1 = new Usuario();
		try {
			fr = new FileReader(f);
			br= new BufferedReader(fr);
			
			
			u1.setUsuario(br.readLine());
			u1.setPassword(br.readLine());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		ControladorLogin clLog= new ControladorLogin(u1);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin(clLog);
					clLog.setV1(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	}



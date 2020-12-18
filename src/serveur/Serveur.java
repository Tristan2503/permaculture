package serveur;

import java.net.ServerSocket;
import java.util.Scanner;
import java.io.PrintStream;
import java.net.*;

public class Serveur {
	
	public static void main(String arg[]) {
		while(true) {
			try {
				int number, temp;
				ServerSocket server = new ServerSocket(3000);

				
				while(true) {

					Socket s = server.accept();
					//System.out.println("Connected");
				
					Scanner sc = new Scanner(s.getInputStream());
					number = sc.nextInt();
					
					temp = number * 2;
					
					PrintStream p = new PrintStream(s.getOutputStream());
					p.println(temp);
				}
				
			
			}catch (Exception e) {
					System.out.println("erreur serveur");
			}
		}		
	}

}

package client;

import java.net.ServerSocket;
import java.util.Scanner;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.*;

public class Serveur {
	
	public static void main(String arg[]) {
		//while(true) {
			try {
				ServerSocket server = new ServerSocket(2000);

				
				//while(true) {

					Socket socket = server.accept();
					
					//Get the input Stream from the connected Client
					InputStream inputStream = socket.getInputStream();
					
					//Create a DataInputStream so we can read data from it
					ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
					
					//Reception of the Terrain 
					Terrain terrain = (Terrain) objectInputStream.readObject();
					
					//Afficher le terrain dans la console serveur
					System.out.println("Message du serveur : ");
					terrain.afficher();
					
					//Envoyer une réponse au client
					//PrintStream p = new PrintStream(socket.getOutputStream());
					//p.println("Terrain " + terrain.getNom() + " bien reçu");
				//}
					
					server.close();
				
			
			}catch (Exception e) {
					System.out.println("erreur serveur : " + e);
			}
		//}		
	}

}

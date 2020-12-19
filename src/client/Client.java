package client;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Client {
	
	public static void main(String arg[]) {
		try {
			//Nouveau terrain
			Terrain terrain = new Terrain("Mon Terrain", 5, 5);
			
			//Nouvelles plantes
			terrain.ajouterPlante(new Plante("Tomate", "Fruit qui pousse en été", 70, Mois.MARS, Mois.MAI, 
					niveauIrrigation.FREQUENT, 60, couleurPlante.ROUGE));
			
			terrain.ajouterPlante(new Plante("Salade", "Legume vert feuillu qui pousse toute l'année", 60, Mois.JANVIER, Mois.DECEMBRE, 
					niveauIrrigation.FREQUENT, 20, couleurPlante.VERT));
			
			terrain.ajouterPlante(new Plante("Carotte", "Legume orange pour les lapins - pousse plutot en automne-hiver", 30, Mois.OCTOBRE, Mois.FEVRIER, 
					niveauIrrigation.REGULIER, 10, couleurPlante.ORANGE));
			
			terrain.ajouterPlante(new Plante("Pomme de Terre", "Tubercule de couleur jaune utilisé pour produire de la vodka - pousse toute l'année", 
					80, Mois.MARS, Mois.MAI, niveauIrrigation.LEGER, 40, couleurPlante.JAUNE));
			
			terrain.ajouterPlante(new Plante("Pangolin", "Legume poilu venu de Chine, connu pour ses nombreux atouts, notament celui de nous faire de la place pour la retraite.",
					7, Mois.JANVIER, Mois.DECEMBRE, niveauIrrigation.LEGER, 60, couleurPlante.GRIS));
			
									
			Socket socket = new Socket("127.0.0.1", 2000);
			
			//get the output stream from the socket
			OutputStream outputStream = socket.getOutputStream();
				
			//Create an object output stream from the output stream so we can send an object through it
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			
			//Send the object to the server
			objectOutputStream.writeObject(terrain);
			
			//Get the response of the serveur
			//PrintStream p = new PrintStream(socket.getOutputStream());
			//System.out.println(p);
			
			//temp = sc1.nextInt();
			//System.out.println(temp);
			
			//Fermeture du socket
			socket.close();
		
		} catch (Exception e) {
			System.out.println("erreur serveur");
		}
		
	}

}

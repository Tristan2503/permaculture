package client;

import java.util.Date;

public class Plante {
	private String nom;
	private String description;
	private int duree_pousse;
	private Date date_debut_semis; 
	private Date date_fin_semis; 
	//private int besoin_soleil; //peut pousser à l'ombre ou au soleil.
	private niveauIrrigation arrosage; //Niveau d'irrigation
	private int taille; //Taille en cm2
	private couleurPlante couleur;
	
	public Plante(String nom, String description, int duree_pousse, Date date_debut_semis, Date date_fin_semis, 
			niveauIrrigation arrosage, int taille, couleurPlante couleur) {
		this.nom = nom;
		this.description = description;
		this.duree_pousse = duree_pousse;
		this.date_debut_semis = date_debut_semis;
		this.date_fin_semis = date_fin_semis;
		this.arrosage = arrosage;
		this.taille = taille;
		this.couleur = couleur;		
	}

}

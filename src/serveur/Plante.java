package serveur;

import java.io.Serializable;

public class Plante implements Serializable {
	private String nom;
	private String description;
	private int duree_pousse;
	private Mois date_debut_semis; 
	private Mois date_fin_semis; 
	//private int besoin_soleil; //peut pousser à l'ombre ou au soleil.
	private niveauIrrigation arrosage; //Niveau d'irrigation
	private int taille; //Taille en cm2
	private couleurPlante couleur;
	
	
	/*
	 * 		Constructeur
	 */
	
	public Plante(String nom, String description, int duree_pousse, Mois date_debut_semis, Mois date_fin_semis, 
			niveauIrrigation arrosage, int taille, couleurPlante couleur) {
		this.setNom(nom);
		this.setDescription(description);
		this.setDuree_pousse(duree_pousse);
		this.setDate_debut_semis(date_debut_semis);
		this.setDate_fin_semis(date_fin_semis);
		this.setArrosage(arrosage);
		this.setTaille(taille);
		this.setCouleur(couleur);		
	}
	
	/*
	 *  	Méthodes 
	 */
	
	public void afficher() {
		System.out.println("Nom de la plante : " + this.nom);
		System.out.println("Description : " + this.description);
		System.out.println("Durée de pousse : " + this.duree_pousse + " jours");
		System.out.println("Taille : " + this.taille + "cm");
		System.out.println("Couleur : " + this.couleur);
		System.out.println("\t");
	}
	
	/*
	 * 		getters + setters
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuree_pousse() {
		return duree_pousse;
	}

	public void setDuree_pousse(int duree_pousse) {
		this.duree_pousse = duree_pousse;
	}

	public Mois getDate_debut_semis() {
		return date_debut_semis;
	}

	public void setDate_debut_semis(Mois date_debut_semis) {
		this.date_debut_semis = date_debut_semis;
	}

	public Mois getDate_fin_semis() {
		return date_fin_semis;
	}

	public void setDate_fin_semis(Mois date_fin_semis) {
		this.date_fin_semis = date_fin_semis;
	}

	public niveauIrrigation getArrosage() {
		return arrosage;
	}

	public void setArrosage(niveauIrrigation arrosage) {
		this.arrosage = arrosage;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public couleurPlante getCouleur() {
		return couleur;
	}

	public void setCouleur(couleurPlante couleur) {
		this.couleur = couleur;
	}


}

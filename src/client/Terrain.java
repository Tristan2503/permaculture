package client;

import java.util.List;

public class Terrain {
	private String nom;
	private int longueur;
	private int largeur;
	private List<Plante> plantes;
	
	
	/*
	 * 		Méthodes
	 */
	
	public void ajouterPlante(Plante p) {
		//Tester la place du terrain avant d'ajouter le terrain
		this.plantes.add(p);
	}
	
	public void supprimerPlante(Plante p) {
		/*
		 * Pour chaque plante dans la liste,
		 * Si le nom de la plante en paramètre == le nom de la plante dans la boucle
		 * 		Alors l'index = index de la plante dans la liste.
		 * 
		 * Fin Pour
		 * 
		 * Suppression de la plante pour l'index donné.
		 * 
		 * 
		 * 
		 * 	--> !!! Attention, cette méthode va évoluer avec l'interface graphique !!! <--
		 * 
		 * 
		 */
		int index = 0;
		for(Plante objPlante : this.plantes) {
			if(p.getNom() == objPlante.getNom()) {
				index = plantes.indexOf(objPlante);				
			}
		}		
		this.plantes.remove(index);		
	}
	
	public void modifierTailleTerrain(int longueur, int largeur) {
		//Suppression des plantes présentes ? 		
		
		this.setLargeur(largeur);
		this.setLongueur(longueur);
	}
	
	
	
	/*
	 * 		Constructeur
	 */
	
	public Terrain(String nom, int longueur, int largeur, List<Plante> plantes) {
		this.setNom(nom);
		this.setLongueur(longueur);
		this.setLargeur(largeur);
		this.setPlantes(plantes);
	}
	
	/*
	 * 		Getter et Setter
	 */
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public List<Plante> getPlantes() {
		return plantes;
	}
	public void setPlantes(List<Plante> plantes) {
		this.plantes = plantes;
	}
}

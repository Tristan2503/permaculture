package client;

import java.util.List;

public class Terrain {
	private String nom;
	private int longueur;
	private int largeur;
	private List<Plante> plantes;
	
	public Terrain(String nom, int longueur, int largeur, List<Plante> plantes) {
		this.setNom(nom);
		this.setLongueur(longueur);
		this.setLargeur(largeur);
		this.setPlantes(plantes);
	}
	
	
	//Getter et Setter
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

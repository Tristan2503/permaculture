package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Ce formulaire permet d'ajouter un nouveau terrain en choissisant le nom, la largeur et la longuer.
 * Je n'ai pas encore implémenté la liste des plantes [Luca].  
 * 
 */

public class FormulaireNouveauTerrain {

	private JFrame frmCrerUnNouveau;
	private JTextField TextFieldNomTerrain;
	private JTextField TextFieldLongeurTerrain;
	private JTextField TextFieldLargeurTerrain;
	
	/**
	 * Lancement de l'application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormulaireNouveauTerrain window = new FormulaireNouveauTerrain();
					window.frmCrerUnNouveau.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Création du formulaire
	 */
	public FormulaireNouveauTerrain() {
		initialize();
	}

	/**
	 * Initialisation des contenus du formulaire.
	 */
	private void initialize() {
		frmCrerUnNouveau = new JFrame();
		frmCrerUnNouveau.setTitle("Ajouter un nouveau terrain");
		frmCrerUnNouveau.setBounds(100, 100, 450, 300);
		frmCrerUnNouveau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrerUnNouveau.getContentPane().setLayout(null);
		
		JButton ValiderNouveauTerrain = new JButton("Créer nouveau terrain");
		ValiderNouveauTerrain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int longeur = 0, largeur = 0;
				String name = TextFieldNomTerrain.getText();

				if(name.isEmpty() || TextFieldLongeurTerrain.getText().isEmpty() || TextFieldLargeurTerrain.getText().isEmpty()) {
					System.out.println("Text field est vide !");
				}
				try {
					longeur = Integer.parseInt(TextFieldLongeurTerrain.getText());
				}catch (NumberFormatException e) {
					//e.methods
					System.out.println("Veuillez saisir un nombre entier pour Longeur !");
					//longeur = 1;
				}
				try {
					largeur = Integer.parseInt(TextFieldLargeurTerrain.getText());
				}catch (NumberFormatException e) {
					System.out.println("Veuillez saisir un nombre entier pour Largeur !");
					//largeur = 1;
				}
				Terrain terrain = new Terrain(name, longeur, largeur);
				terrain.afficher();
			}
		});
		ValiderNouveauTerrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ValiderNouveauTerrain.setBounds(76, 164, 185, 23);
		frmCrerUnNouveau.getContentPane().add(ValiderNouveauTerrain);
		
		TextFieldNomTerrain = new JTextField();
		TextFieldNomTerrain.setBounds(104, 57, 131, 20);
		frmCrerUnNouveau.getContentPane().add(TextFieldNomTerrain);
		TextFieldNomTerrain.setColumns(10);
		
		TextFieldLongeurTerrain = new JTextField();
		TextFieldLongeurTerrain.setBounds(104, 88, 131, 20);
		frmCrerUnNouveau.getContentPane().add(TextFieldLongeurTerrain);
		TextFieldLongeurTerrain.setColumns(10);
		
		TextFieldLargeurTerrain = new JTextField();
		TextFieldLargeurTerrain.setBounds(104, 119, 131, 20);
		frmCrerUnNouveau.getContentPane().add(TextFieldLargeurTerrain);
		TextFieldLargeurTerrain.setColumns(10);
		
		JLabel lblTypeTerrain = new JLabel("Type de terrain");
		lblTypeTerrain.setBounds(131, 32, 131, 14);
		frmCrerUnNouveau.getContentPane().add(lblTypeTerrain);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(48, 60, 46, 14);
		frmCrerUnNouveau.getContentPane().add(lblNom);
		
		JLabel lblLongeur = new JLabel("Longeur");
		lblLongeur.setBounds(48, 91, 46, 14);
		frmCrerUnNouveau.getContentPane().add(lblLongeur);
		
		JLabel lblLargeur = new JLabel("Largeur");
		lblLargeur.setBounds(48, 122, 46, 14);
		frmCrerUnNouveau.getContentPane().add(lblLargeur);
	}
}

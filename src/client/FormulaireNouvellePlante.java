package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Ce formulaire va être utilisé par l'administrateur pour ajouter une nouvelle plante.
 * 
 */


public class FormulaireNouvellePlante {

	private JFrame frmAjouterUnePlante;
	private JTextField textField_NomPlante;
	private JTextField textField_DescriptionPlante;
	private JTextField textField_DureePousse;
	private JLabel lblDateDebutSemis;
	private JTextField textField_DateDebutSemis;
	private JLabel lblDateFinSemis;
	private JTextField textField_DateFinSemis;
	private JLabel lblNiveauIrrigation;
	private JTextField textField_NiveauIrrigation;
	private JLabel lblTaillePlante;
	private JTextField textField_TaillePlante;
	private JTextField textField_CouleurPlante;
	private JLabel lblCouleurPlante;

	/**
	 * Lancement de l'application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormulaireNouvellePlante window = new FormulaireNouvellePlante();
					window.frmAjouterUnePlante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Création du formulaire.
	 */
	public FormulaireNouvellePlante() {
		initialize();
	}

	/**
	 * Initialisation des contenus du formulaire.
	 */
	private void initialize() {
		frmAjouterUnePlante = new JFrame();
		frmAjouterUnePlante.setTitle("Ajouter une plante");
		frmAjouterUnePlante.setBounds(100, 100, 388, 385);
		frmAjouterUnePlante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjouterUnePlante.getContentPane().setLayout(null);
		
		textField_NomPlante = new JTextField();
		textField_NomPlante.setBounds(182, 14, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_NomPlante);
		textField_NomPlante.setColumns(10);
		
		JLabel lblNomPlante = new JLabel("Nom");
		lblNomPlante.setBounds(31, 14, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblNomPlante);
		
		textField_DescriptionPlante = new JTextField();
		textField_DescriptionPlante.setColumns(10);
		textField_DescriptionPlante.setBounds(182, 45, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_DescriptionPlante);
		
		JLabel lblDescriptionPlante = new JLabel("Description");
		lblDescriptionPlante.setBounds(31, 45, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblDescriptionPlante);
		
		textField_DureePousse = new JTextField();
		textField_DureePousse.setColumns(10);
		textField_DureePousse.setBounds(182, 76, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_DureePousse);
		
		JLabel lblDureePousse = new JLabel("Durée de pousse (int)");
		lblDureePousse.setBounds(31, 76, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblDureePousse);
		
		lblDateDebutSemis = new JLabel("Date de début semis (mois)");
		lblDateDebutSemis.setBounds(31, 107, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblDateDebutSemis);
		
		textField_DateDebutSemis = new JTextField();
		textField_DateDebutSemis.setColumns(10);
		textField_DateDebutSemis.setBounds(182, 107, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_DateDebutSemis);
		
		lblDateFinSemis = new JLabel("Date de fin semis (mois)");
		lblDateFinSemis.setBounds(31, 140, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblDateFinSemis);
		
		textField_DateFinSemis = new JTextField();
		textField_DateFinSemis.setColumns(10);
		textField_DateFinSemis.setBounds(182, 140, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_DateFinSemis);
		
		lblNiveauIrrigation = new JLabel("Niveau d'irrigation");
		lblNiveauIrrigation.setBounds(31, 168, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblNiveauIrrigation);
		
		textField_NiveauIrrigation = new JTextField();
		textField_NiveauIrrigation.setColumns(10);
		textField_NiveauIrrigation.setBounds(182, 168, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_NiveauIrrigation);
		
		lblTaillePlante = new JLabel("Taille (en cm2)");
		lblTaillePlante.setBounds(31, 196, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblTaillePlante);
		
		textField_TaillePlante = new JTextField();
		textField_TaillePlante.setColumns(10);
		textField_TaillePlante.setBounds(182, 196, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_TaillePlante);
		
		textField_CouleurPlante = new JTextField();
		textField_CouleurPlante.setColumns(10);
		textField_CouleurPlante.setBounds(182, 224, 86, 20);
		frmAjouterUnePlante.getContentPane().add(textField_CouleurPlante);
		
		lblCouleurPlante = new JLabel("Couleur de la plante");
		lblCouleurPlante.setBounds(31, 224, 141, 14);
		frmAjouterUnePlante.getContentPane().add(lblCouleurPlante);
		
		JButton btnAjouterPlante = new JButton("Ajouter nouvelle plante");
		btnAjouterPlante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAjouterPlante.setBounds(97, 276, 175, 23);
		frmAjouterUnePlante.getContentPane().add(btnAjouterPlante);
	}
}

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

public class FormulaireNouveauTerrain {

	private JFrame frame;
	private JTextField TextFieldNomTerrain;
	private JTextField TextFieldLongeurTerrain;
	private JTextField TextFieldLargeurTerrain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormulaireNouveauTerrain window = new FormulaireNouveauTerrain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormulaireNouveauTerrain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ValiderNouveauTerrain = new JButton("Créer nouveau terrain");
		ValiderNouveauTerrain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Terrain terrain = new Terrain(TextFieldNomTerrain.getText(),Integer.parseInt(TextFieldLongeurTerrain.getText()),Integer.parseInt(TextFieldLargeurTerrain.getText()));
				terrain.afficher();
			}
		});
		ValiderNouveauTerrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ValiderNouveauTerrain.setBounds(76, 164, 185, 23);
		frame.getContentPane().add(ValiderNouveauTerrain);
		
		TextFieldNomTerrain = new JTextField();
		TextFieldNomTerrain.setBounds(104, 57, 131, 20);
		frame.getContentPane().add(TextFieldNomTerrain);
		TextFieldNomTerrain.setColumns(10);
		
		TextFieldLongeurTerrain = new JTextField();
		TextFieldLongeurTerrain.setBounds(104, 88, 131, 20);
		frame.getContentPane().add(TextFieldLongeurTerrain);
		TextFieldLongeurTerrain.setColumns(10);
		
		TextFieldLargeurTerrain = new JTextField();
		TextFieldLargeurTerrain.setBounds(104, 119, 131, 20);
		frame.getContentPane().add(TextFieldLargeurTerrain);
		TextFieldLargeurTerrain.setColumns(10);
		
		JLabel lblTypeTerrain = new JLabel("Type de terrain");
		lblTypeTerrain.setBounds(131, 32, 131, 14);
		frame.getContentPane().add(lblTypeTerrain);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(48, 60, 46, 14);
		frame.getContentPane().add(lblNom);
		
		JLabel lblLongeur = new JLabel("Longeur");
		lblLongeur.setBounds(48, 91, 46, 14);
		frame.getContentPane().add(lblLongeur);
		
		JLabel lblLargeur = new JLabel("Largeur");
		lblLargeur.setBounds(48, 122, 46, 14);
		frame.getContentPane().add(lblLargeur);
	}
}

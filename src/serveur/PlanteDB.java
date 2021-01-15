package serveur;

import java.sql.*;

public class PlanteDB {
	
	public Plante ObtenirParNom(String nom) throws SQLException {
		Connection con = ConnectionDB.creationConnection();
		ResultSet rs = null;
		String requete = "SELECT * FROM plante where nom = '"+ nom +"'";

		try {
		   Statement stmt = con.createStatement();
		   rs = stmt.executeQuery(requete);
		} catch (SQLException e) {
		}
		
		Plante plante = new Plante("", "", 0, null, null, null, 0, null);
		while(rs.next()) {
			
			plante.setNom(rs.getString(2));
			plante.setDescription(rs.getString(3));
			plante.setDuree_pousse(rs.getInt(4));			
			Mois moisDebut = Mois.getByNum(rs.getInt(5));
			Mois moisFin = Mois.getByNum(rs.getInt(6));
			plante.setDate_debut_semis(moisDebut);
			plante.setDate_fin_semis(moisFin);
			
		}
		rs.close();
		con.close();
		return plante;
	}
	
	public boolean Inserer(Plante p) throws SQLException {
		Connection con = ConnectionDB.creationConnection();
		ResultSet rs = null;
		
		String requete = "insert into plante (nom, description, temps_pousse, semis_debut, semis_fin) values ('"
					+ p.getNom() +"','"+ p.getDescription() +"','"+ p.getDuree_pousse() +"','"+ p.getDate_debut_semis().getNum() +"','"+ p.getDate_fin_semis().getNum();

		try {
		   Statement stmt = con.createStatement();
		   rs = stmt.executeQuery(requete);
		} catch (SQLException e) {
			return false;
		}
		rs.close();
		con.close();
		return true;
	}
}

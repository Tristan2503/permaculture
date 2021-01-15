package serveur;

import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		PlanteDB PlanteDB = new PlanteDB();
		PlanteDB.ObtenirParNom("tomate").afficher();
	}

}

package serveur;

public enum Mois {
	JANVIER(1), FEVRIER(2), MARS(3), AVRIL(4), MAI(5), JUIN(6), JUILLET(7), AOUT(8), SEPTEMBRE(9), OCTOBRE(10), NOVEMBRE(11), DECEMBRE(12) ;
	
	private int numMois;

	Mois(int i) {
		numMois = i;
	}

	public static Mois getByNum(int num) {
	    for(Mois m : values()) {
	        if(m.numMois == num) return m;
	    }
	    return null;
	}
	
	public int getNum() {
		return numMois;
	}
}

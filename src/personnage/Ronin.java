package personnage;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);
		honneur =0;
	}

	public int getHonneur() {
		return honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		int argentdonner = getArgent()/10;
		parler(beneficiaire.getNom() + "prend ces " + argentdonner + " sous.");
		perdreArgent(argentdonner);
		
	}
	

}


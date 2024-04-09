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
		parler(beneficiaire.getNom() + " prend ces " + argentdonner + " sous.");
		perdreArgent(beneficiaire.recevoir(argentdonner));
		
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		honneur++;
		return argentPerdu;
		
	}
	public void gagner(int gain) {
		parler("Je t’ai eu petit yakusa!");
		honneur--;
		gagnerArgent(gain);
		
	}
	
	public void provoquer(Yakuza adversaire) {
		if((2*getHonneur()) > adversaire.getReputation()) {
			gagner(adversaire.perdre());
		}
		else {
			adversaire.gagner(perdre());
		}
	}

}


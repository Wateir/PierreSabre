package personnage;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu, le monde est injuste !");
		int argentperdu = getArgent();
		return perdreArgent(argentperdu);

	}

	public int recevoir(int argent) {
		parler(argent + " sous ! Je te remerci genereux donnateur");
		return gagnerArgent(argent);

	}

}

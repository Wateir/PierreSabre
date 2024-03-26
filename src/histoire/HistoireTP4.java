package histoire;

import personnage.Commercant;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombuchua", 54);
		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.boire();
		prof.acheter("jeu", 2);
		prof.parler("Je n'ai plus que " + prof.getArgent() + " sous en poche . Je ne peux meme pas m'offrir un kimono à 50 sous");
		
		Commercant commercant = new Commercant("Marco", 20);
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();
		
	}
}


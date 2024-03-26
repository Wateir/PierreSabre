package histoire;

import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombuchua", 54);
		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.boire();
		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		prof.perdreArgent(2);
		prof.parler("Je n'ai plus que " + prof.getArgent() + " sous en poche . Je ne peux meme pas m'offrir un kimono à 50 sous");
		
	}
}


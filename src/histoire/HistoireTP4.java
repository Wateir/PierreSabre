package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombuchua", 54);
		prof.direBonjour();
		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.boire();
		prof.acheter("jeu", 2);
		prof.parler("Je n'ai plus que " + prof.getArgent()
				+ " sous en poche . Je ne peux meme pas m'offrir un kimono à 50 sous");

		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

		Yakuza yakulenoir = new Yakuza("Yaku le noir", "Wisky", 30, "Warsong");
		yakulenoir.parler("Tiens, tiens ne serait-ce pas un faible marchand qui passe par la ?");
		yakulenoir.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "socho", 6);
		roro.donner(marco);
		
	}
}

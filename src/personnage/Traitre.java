package personnage;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonfavorite, int argent) {
		super(seigneur, nom, boissonfavorite, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Ma traitrise est de" + getNiveauTraitrise() + ". Chut ....");
	}
	
	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}
	
	public void ranconner(Commercant victime) {
		if (niveauTraitrise < 3) {
			int argentRanconner = victime.getArgent();
			victime.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir me payer ! Donne-moi " + argentRanconner +" sous ou gare a toi !");
			victime.parler("Tout de suite grand" + getNom()+ ".");
			niveauTraitrise++;
		}
		else {
			parler("Mince je ne plus rancooner personne sinon un samourai risque de me demasquer!");
		}
		
	}

	public void faireleGentil(Humain ami) {
		if (nombreConnaissance < 1){
			parler("Je ne peux faire ami-ami avec personne car je ne connais personne ! Snif");
		}
		else {
			int don = getArgent() * (1/20);
			Random numuroAleatoire = new Random();
			String nomAmi = maMemoire[numuroAleatoire.nextInt(nombreConnaissance+1)].getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais vous aider en vous donnant" + don +" sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci" + this.getNom() + "Vous êtes quelqu'un de bien.");
			niveauTraitrise--;
		}
	}

}

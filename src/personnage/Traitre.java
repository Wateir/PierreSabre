package personnage;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonfavorite, int argent) {
		super(seigneur, nom, boissonfavorite, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Ma traitrise est de" + getNiveauTraitrise() + ".");
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
		}
		else {
			parler("Mince je ne plus rancooner personne sinon un samourai risque de me demasquer!");
		}
		
	}

}

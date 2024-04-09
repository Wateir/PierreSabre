package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private final int TAILLE_MEMOIRE = 30;
	private int nombreConnaissance = 0;
	private Humain[] maMemoire = new Humain[TAILLE_MEMOIRE];

	public Humain(String nom, String boissonfavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonfavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");

	}

	public void boire() {
		parler("Mmm, un bon verre de " + boissonFavorite + " ! Gloups !");
		argent = getArgent() - 12;
	}

	public void acheter(String bien, int prix) {
		parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
		perdreArgent(prix);
	}

	protected int gagnerArgent(int gain) {
		argent = argent + gain;
		return argent;
	}

	protected int perdreArgent(int perte) {
		argent = argent - perte;
		return argent;
	}
	
	public void faireConnaissanceAvec(Humain autrehumain) {
		direBonjour();
		repondre(this);
		memoriser(autrehumain);
	}
	

	private void memoriser(Humain autrehumain) {
		if (nombreConnaissance < TAILLE_MEMOIRE) {
			maMemoire[nombreConnaissance] = autrehumain;
			nombreConnaissance++;
			
		}
		else {
			for (int i = 0; i < TAILLE_MEMOIRE-1 ; i++) {
				maMemoire[i] = maMemoire[i+1];
				}
			maMemoire[TAILLE_MEMOIRE] = autrehumain;
		}
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
		
	}
	
	public void listeConnaissance() {
		parler("Je connais beaucoup de monde dont : ");
	}

	public void parler(String texte) {
		System.out.println(nom + " : " + "« " + texte + "»");

	}

	public int getMemoirelongeur() {
		return nombreConnaissance;
	}

}

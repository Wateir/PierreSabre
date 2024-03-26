package personnage;

public class Humain {
	private String nom;
	private String boissonfavorite;
	private int argent;

	public Humain(String nom, String boissonfavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public  int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + "et j'aime boire du " + boissonfavorite + ".");

	}

	public void boire() {
		parler("Mmm, un bon verre de " + boissonfavorite + " ! Gloups !");
		argent = getArgent() - 12;
	}

	public void acheter(String bien, int prix) {
		parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
		perdreArgent(prix);
	}

	protected int gagnerArgent(int gain) {
		argent = getArgent();
		argent = argent + gain;
		return argent;
	}

	protected int perdreArgent(int perte) {
		argent = getArgent();
		argent = argent - perte;
		return argent;
	}

	public void parler(String texte) {
		System.out.println(nom + " : " + "« " + texte + "»");

	}

}


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

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	private void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + "et j'aime boire du " + boissonfavorite + ".");

	}

	public void boire() {
		parler("Mmm, un bon verre de " + boissonfavorite + " ! Gloups !");
		argent = getArgent() - 12;
	}

	private void acheter(String bien, int prix) {

	}

	private void gagnerArgent(int gain) {

	}

	public void perdreArgent(int perte) {

	}

	public void parler(String texte) {
		System.out.println(nom + " : " + "« " + texte + "»");

	}

}

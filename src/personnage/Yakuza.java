package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);
	}

	public void extorquer(Commercant victime) {
		int argentvoler = victime.seFaireExtorquer();
		gagnerArgent(argentvoler);
		setReputation(getReputation() + 1);
		parler("J'ai piquer les " + argentvoler + " sous de " + victime.getNom() + " , ce qui me fais " + getArgent() + " sous dans ma poche ! Hi ! Hi !");
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

}

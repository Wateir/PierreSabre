package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonfavorite, int argent, String clan) {
		super(nom, boissonfavorite, argent);
		reputation = 0;
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		int argentvoler = victime.seFaireExtorquer();
		gagnerArgent(argentvoler);
		reputation++;
		parler("J'ai piquer les " + argentvoler + " sous de " + victime.getNom() + " , ce qui me fais " + getArgent()
				+ " sous dans ma poche ! Hi ! Hi !");
	}

	public int getReputation() {
		return reputation;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		parler("J’ai perdu mon duel et mes " + argentPerdu + "sous, snif... J'ai déshonoré le clan de "
				+ getClan());
		reputation--;
		return argentPerdu;
		
	}
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre"+ getNom() + "du clan de" + getClan() + "?Je l'ai dépouillé de ses" + gain + "sous.");
		gagner(gain);
		reputation++;
		
	}
}

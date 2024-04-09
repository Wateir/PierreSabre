package personnage;

public class Samourai extends Ronin{
	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + getSeigneur() +" .");
	}

	public String getSeigneur() {
		return seigneur;
	}

	

}

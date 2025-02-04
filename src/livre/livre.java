package livre;

public class livre {
	private String nom;
	private double prix;
	private int quantité;
	
	public livre ()
	{
		nom = "Claude";
		prix = 3;
		quantité = 84;
	}
	
	public livre (String nom, double prix, int quantité)
	{
		this.nom = nom;
		this.prix = prix;
		this.quantité = quantité;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	public String toString()
	{
		return nom;
	}
}

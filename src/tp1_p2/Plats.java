package tp1_p2;

public class Plats {

	
	public String nom;
	public double prix;
	
	
	public Plats(String nom, double prix) {
		
		this.nom = nom;
		this.prix = prix;
	}
	
	
	public String ToString() {
		
		return nom + prix;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public static void afficher(String plats, double prix) {
		
		System.out.println(plats + prix);
	}
	
	
}

package tp1_p2;

public class Plats {

	
	public String plats;
	public double prix;
	
	
	public Plats(String plats, double prix) {
		
		this.plats = plats;
		this.prix = prix;
	}
	
	
	public String ToString() {
		
		return plats + prix;
	}
	
	public String getNom() {
		return this.plats;
	}
	
	public static void afficher(String plats, double prix) {
		
		System.out.println(plats + prix);
	}
	
	
}
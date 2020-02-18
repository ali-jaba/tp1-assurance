package tp1_p2;

public class Commandes {

	
	
	public String nom;
	public String plat;
	public int qnt;
	
	
	
	public Commandes(String nom, String plat, int qnt) {
		super();
		this.nom = nom;
		this.plat = plat;
		this.qnt = qnt;
	}
	
	public double prixTotal(int qnt, String plat) {
		double prix = 0;
		
		double prixFinal;

		switch (plat) {

		case "Poutine":
			prix = 10.5;
			break;
		case "Frites":
			prix = 2.5;
			break;
		case "Repas_Poulet":
			prix = 15.75;
			break;
		}

		prixFinal = prix * qnt;

		return prixFinal ;
	}
	public void afficher() {
		System.out.println(this.nom);
		System.out.println(prixTotal(qnt, plat));
	}
	
	
	
}

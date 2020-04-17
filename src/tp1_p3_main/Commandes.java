package tp1_p3_main;


public class Commandes {

	public double TPS = 0.05;
	public double TVQ = 0.0975;
	public String nom;
	public String plat;
	public int qnt;
	public boolean pasDePlat = false;

	public Commandes(String nom, String plat, int qnt) {
		super();
		this.nom = nom;
		this.plat = plat;
		this.qnt = qnt;

	}

	public double prixTotal(int qnt, String plat) {
		double prix = 0;

		double prixTot;

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

		prixTot = prix * qnt;

		return calculerTaxe(prixTot);
	}

	public double calculerTaxe(double total) {
		double totalTax;

		totalTax = (total * (TPS + TVQ)) + total;
		return totalTax ;
		
	}
	
	public boolean aucunPlat() {
		if(this.qnt==0) {
			pasDePlat = true;
			
		}
		return pasDePlat;
		
	}

	public void afficher(double prix) {
		
		if(!pasDePlat) {
			System.out.print(this.nom + " " + prix + "\n ");
		}
		

	}

}
package tp1_p3_test;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import tp1_p3_main.Commandes;
import tp1_p3_main.principal;


public class test {
	@Test
	public void testCreationCommande() throws FileNotFoundException, IOException {
		Commandes test = new Commandes("ali","Poutine",3);
		Commandes test2 = new Commandes("paul","fromage",0);
		double prix = test.prixTotal(3, "Poutine");
		double prix2 = test2.prixTotal(0, "fromage");
		

		
		principal.lireFichier(new File("entree.txt").getAbsolutePath());
		
		
		
	}
	@Test
	public void creationFacture() throws IOException {
		String tab[] = {"Clients","Roger","Céline","Steeve","Plats","Poutine","10.5","Frites","2.5","Repas_Poulet","15.75","Commandes","Roger","Poutine","1","Céline","Frites","2","Céline","Repas_Poulet","1","Fin"};
		principal.main(tab);
	}
	@Test
	public void commande() throws IOException {
		
	}
	
}

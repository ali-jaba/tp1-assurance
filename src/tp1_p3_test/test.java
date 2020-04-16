package tp1_p3_test;
import static org.junit.Assert.assertEquals;

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
		test.calculerTaxe(50);
		principal.lireFichier(new File("entree.txt").getAbsolutePath());
		
	}
	
}

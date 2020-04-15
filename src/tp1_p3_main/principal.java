package tp1_p3_main;

import java.io.BufferedReader; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class principal {

	public static void main(String[] args) throws IOException {
		System.out.println("Bienvenue chez Barette!");
		String[] tableau = lireFichier(new File("entree.txt").getAbsolutePath());
		
		
		System.out.println("Factures :");
		
		Client[] tabCli = new Client[3];
		tabCli[0] = new Client(tableau[1]);
		tabCli[1] = new Client(tableau[2]);
		tabCli[2] = new Client(tableau[3]);
		
		Commandes[] tabComm = new Commandes[4];
		tabComm[0] = new Commandes(tableau[1], tableau[13], Integer.parseInt(tableau[14]));
		tabComm[1] = new Commandes(tableau[2], tableau[16], Integer.parseInt(tableau[17]));
		tabComm[2] = new Commandes(tableau[2], tableau[19], Integer.parseInt(tableau[20]));
		tabComm[3] = new Commandes(tableau[3], tableau[19], 0);
		
		
		
		
		double prix1, prix2, prix3, prix4, prix5;
		prix1= tabComm[0].prixTotal(Integer.parseInt(tableau[14]), tableau[13]);
		prix2 = tabComm[1].prixTotal(Integer.parseInt(tableau[17]), tableau[16]);
		prix3=tabComm[2].prixTotal(Integer.parseInt(tableau[20]), tableau[19]);
		prix4= prix2+prix3;
		prix5=tabComm[3].prixTotal(0, tableau[13]);
		tabComm[0].afficher(prix1);
		tabComm[1].afficher(prix4);
		tabComm[3].afficher(prix5);	
	}
	

	public static String[] lireFichier(String chemin) throws FileNotFoundException, IOException {

		String[] tab = null;

		try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
			String ligne;

			ligne = br.readLine();
			tab = ligne.split(";");
		} catch(Exception e) {
			System.out.println("Le fichier ne respect pas les normes");
		}

		return tab;
	}
}
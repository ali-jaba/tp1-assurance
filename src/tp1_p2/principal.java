package tp1_p2;

import java.io.BufferedReader; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class principal {

	
	
	public static void main(String[] args) throws IOException {
		
		String[] tableau = lireFichier(new File("entree.txt").getAbsolutePath());
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
		
		Plats[] tabPlats = new Plats[3];
		tabPlats[0] = new Plats(tableau[5], Double.valueOf(tableau[6]));
		tabPlats[1] = new Plats(tableau[7], Double.valueOf(tableau[8]));
		tabPlats[2] = new Plats(tableau[9], Double.valueOf(tableau[10]));
		
		Client[] tabCli = new Client[3];
		tabCli[0] = new Client(tableau[1]);
		tabCli[1] = new Client(tableau[2]);
		tabCli[2] = new Client(tableau[3]);
		
		Commandes comm1 = new Commandes(tableau[12], tableau[13], Integer.parseInt(tableau[14]));
			
		
		
	}
	
	
	public static String[] lireFichier( String chemin ) throws FileNotFoundException, IOException {

		String[] tab;

		try (BufferedReader br = new BufferedReader( new FileReader( chemin ) )) {
			String ligne;

			 ligne = br.readLine();
				tab = ligne.split(";");
			}
		
		return tab;
	}
}

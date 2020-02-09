package tp1;

public class CV {

	static private String nom;
	static private String prenom;
	static private String formation;
	static private int experience;
	static private String[] competences;
	static private String attente;
	
	public CV (String pNom, String pPrenom, String pFormation, int pExperience, String[] pCompetences, String pAttente) {
		nom = pNom;
		prenom = pPrenom;
		formation = pFormation;
		experience = pExperience;
		competences = pCompetences;
		attente = pAttente;
	}
	
	public void affichage() {
		System.out.println("\nnom : " + nom);
		System.out.println("prenom : " + prenom);
		System.out.println("formation : " + formation);
		System.out.println("experience : " + experience + " an(s)");
		System.out.print("competences : ");
		for (int i = 0; i < competences.length; i++) {
			System.out.print(competences[i]);
		}
		
		System.out.println("attente : " + attente);
	}
	
	
}

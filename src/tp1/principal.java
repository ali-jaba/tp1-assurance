package tp1;

public class principal {
	
	public static void main(String[] args) {
		
		String[] tabCv1 = {"Travail d'équipe, ","Communication, ","Adaptation\n"};
		String[] tabCv2 = {"Flexible, ","Adaptation au changement\n"};
		System.out.println("Bienvenue  chez  Barette!");
		
		
		CV cv1 = new CV("Jabakhanji","Ali","Vente et programmation",3,tabCv1,"J'èspere pouvoir apprendre a bien exécuter des tests");
		cv1.affichage();
		CV cv2 = new CV("Sanchez","Gregory","Vente",2,tabCv2,"Pouvoir apprendre à configurer correctement des réseaux");
		cv2.affichage();
		//allo 123
		
	}
}

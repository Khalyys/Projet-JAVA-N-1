package Package_3;

import java.util.Scanner;

public class Exo_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre âge");
		
		int age = sc.nextInt();
		
		System.out.println("Âge saisi : " + age + " ans");
		
		double prix;
		int montant=78;
		int x = age;
		int y = 5;
		if (x < y) {
		  System.out.println("Le billet est gratuit");
		}
		
		
		if (age >= 5 && age <= 11) {
			prix=montant * 0.5;
		  System.out.println("le billet coûte " + prix);
		  
		} else if (age >= 12 && age <= 17) {
			prix=montant * 0.75;
		  System.out.println("le billet coûte " + prix);
		  
		} else if (age >= 62 ){
			prix=montant * 0.77;
		  System.out.println("le billet coûte " + prix);
		  
		} else if (age >= 18 && age <= 61 ){
			prix=montant * 1;
		  System.out.println("le billet coûte " + prix);

	}
	}
}
	




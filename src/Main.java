import java.util.Scanner;
//import java.util.Random;

public class Main {
	
	public static Scanner saisie = new Scanner(System.in);
	
	static int nbrAleatoire = 0;
	static int nMax = 100;
	static int reponse = 0;
	static int nbrEssais = 0;

	public static void main(String[] args) {
		try {
			GenerateNbr();
			Saisie();
			Close();
		} catch (Exception e) {
			
		}
	}
	
	public static void GenerateNbr() {
		//Random rand = new Random();
		//nbrAleatoire = rand.nextInt(101); //Entre 0 et 100
		nbrAleatoire = (int) (Math.random() * nMax + 1);		
	}

	public static void Saisie() {		
		System.out.println("> Definir le nombre d'essais possible :");
		nbrEssais = Integer.parseInt(saisie.nextLine());	
		System.out.println("---------------------------------------------\n");
		for(int i = 1; i <= nbrEssais ; i++) {
			System.out.println("Essai "+i+" > Veuillez saisir un nombre :");
			reponse = Integer.parseInt(saisie.nextLine());	
			
			if (reponse == nbrAleatoire){
				System.out.println("\nBravo, la réponse étrait bien "+nbrAleatoire+" !");
				System.out.println("---------------------------------------------\n");
				System.out.println("Il vous aura fallu "+i+" essais sur les "+nbrEssais+" max !");
				i=nbrEssais+1;
			} else {
				if (reponse < nbrAleatoire) { 
					System.out.println("\n"+reponse+" est plus petit que le nombre à trouver..."); 
				} else {
					System.out.println("\n"+reponse+" est plus grand que le nombre à trouver..."); 
				}
				
				if (i < nbrEssais){
					System.out.println("Il ne vous reste que "+(nbrEssais-i)+"\n");
				}
				if (i == nbrEssais){
					System.out.println("C'était votre dernier essai...");
					System.out.println("---------------------------------------------\n");
					System.out.println("\nLa réponse était : "+nbrAleatoire);
				} 
				if (i >= nbrEssais){
					//System.out.println("Souhaitez vous recommencer une partie ?");					
				}
			}			
		}		
	}
	
	public static void Close() {
		saisie.close();
	}
}

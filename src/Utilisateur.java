import java.util.Scanner;
/**
 * class Utilisateur qui comporte les differentes methodes necessaires a la gestion d'un compte
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public class Utilisateur extends Personne {
	
	/**
	 *  Création d'une méthode publique qui permettra de créer un compte.
	 */
	public void créerCompte() { 
		
		/* 
		 * Création d'un objet 'sc' de type Scanner.
		 */
		Scanner sc = new Scanner(System.in);
		/* 
		 * Afficher la phrase "creer un compte".
		 */
		System.out.println("CREER UN COMPTE");
		/* 
		 * Afficher la phrase "Enregistrez votre nom:".
		 */
		System.out.println("Enregistrez votre nom:");
		/*
		 *  On fait appel à la méthode setNom de la classe mère.
		 */
		super.setNom(sc.nextLine());
		
		System.out.println("Enregistrez votre prenom:");
		/*
		 *  On fait appel à la méthode setPrenom de la classe mère.
		 */
		super.setPrenom(sc.nextLine());
		
		System.out.println("Enregistrez email:");
		/*
		 *  On fait appel à la méthode setEmail de la classe mère.
		 */
		super.setEmail(sc.nextLine());
		
		System.out.println("Enregistrez un nom d'utilisateur:");
		/*
		 *  On fait appel à la méthode setNomutilisateur de la classe mère.
		 */
		super.setNomutilisateur(sc.nextLine());
		
		System.out.println("Enregistrez un mot de passe:");
		/*
		 *  On fait appel à la méthode setMotdepasse de la classe mère.
		 */
		super.setMotdepasse(sc.nextLine());
		
		/* 
		 * Afficher les informations entrées par l'utilisateur".
		 */
		System.out.println("Vos informations ont été bien enregistrées:");
		System.out.println("NOM:" + " " + super.getNom());
		System.out.println("PRENOM:" + " " + super.getPrenom());
		System.out.println("EMAIL:" + " " + super.getEmail());
		System.out.println("NOM D'UTILISATEUR:" + " " + super.getNomutilisateur());
		System.out.println("MOT DE PASSE:" + " " + "**********");
	}
	
	/**
	 * création d'une méthode qui permet de se connecter à son compte utilidateur
	 */
	public void connexion() {  
		
	
		/*
		 * Déclaration d'une variable 'u' de type String.
		 */
		String u; 
		/*
		 *  Déclaration d'une variable 'p' de type String.
		 */
		String p; 
		
	
		/*
		 * On affiche les instructions .
		 */
		System.out.println("CONNECTEZ VOUS A VOTRE  COMPTE");
	
		System.out.println("Entrez votre nom d'utilisateur:");
		
		/*
		 *  La variable 'u' reçoit la chaine de caractères saisis par l'utilisateur.
		 */
		u = sc.nextLine();
		
		
		/*
		 *  Création d'une boucle WHILE qui doit redemander
		 */
		
		while (!u.equals(super.getNomutilisateur()))
		{
			System.out.println("Nom d'utilisateur incorrect, veuillez reessayer:");
			System.out.println("Entrez votre nom d'utilisateur:");
			// La variable 'u' reçoit la chaine de caractères saisis par l'utilisateur.
			u = sc.nextLine();		
		}
		
		
		/*
		 * On affiche les instructions 
		 */
				System.out.println("Entrez votre mot de passe:");
				// La variable 'p' reçoit la chaine de caractères saisis par l'utilisateur.
				p = sc.nextLine();  
							
		while (!p.equals(super.getMotdepasse()))
		{
			System.out.println(" mot de passe incorrect, veuillez reessayer:");
			
			System.out.println("Entrez votre mot de passe:");
			/*
			 *  La variable 'p' reçoit la chaine de caractères saisis par l'utilisateur.
			 */
			p = sc.nextLine();  
			
		}
		/*
		 * On affiche les instructions 
		 */
		System.out.println(u + " " + "Bienvenue dans votre compte"); 
	}
}		



import java.util.Scanner;
/**
 * class Utilisateur qui comporte les differentes methodes necessaires a la gestion d'un compte
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public class Utilisateur extends Personne {
	
	/**
	 *  Cr�ation d'une m�thode publique qui permettra de cr�er un compte.
	 */
	public void cr�erCompte() { 
		
		/* 
		 * Cr�ation d'un objet 'sc' de type Scanner.
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
		 *  On fait appel � la m�thode setNom de la classe m�re.
		 */
		super.setNom(sc.nextLine());
		
		System.out.println("Enregistrez votre prenom:");
		/*
		 *  On fait appel � la m�thode setPrenom de la classe m�re.
		 */
		super.setPrenom(sc.nextLine());
		
		System.out.println("Enregistrez email:");
		/*
		 *  On fait appel � la m�thode setEmail de la classe m�re.
		 */
		super.setEmail(sc.nextLine());
		
		System.out.println("Enregistrez un nom d'utilisateur:");
		/*
		 *  On fait appel � la m�thode setNomutilisateur de la classe m�re.
		 */
		super.setNomutilisateur(sc.nextLine());
		
		System.out.println("Enregistrez un mot de passe:");
		/*
		 *  On fait appel � la m�thode setMotdepasse de la classe m�re.
		 */
		super.setMotdepasse(sc.nextLine());
		
		/* 
		 * Afficher les informations entr�es par l'utilisateur".
		 */
		System.out.println("Vos informations ont �t� bien enregistr�es:");
		System.out.println("NOM:" + " " + super.getNom());
		System.out.println("PRENOM:" + " " + super.getPrenom());
		System.out.println("EMAIL:" + " " + super.getEmail());
		System.out.println("NOM D'UTILISATEUR:" + " " + super.getNomutilisateur());
		System.out.println("MOT DE PASSE:" + " " + "**********");
	}
	
	/**
	 * cr�ation d'une m�thode qui permet de se connecter � son compte utilidateur
	 */
	public void connexion() {  
		
	
		/*
		 * D�claration d'une variable 'u' de type String.
		 */
		String u; 
		/*
		 *  D�claration d'une variable 'p' de type String.
		 */
		String p; 
		
	
		/*
		 * On affiche les instructions .
		 */
		System.out.println("CONNECTEZ VOUS A VOTRE  COMPTE");
	
		System.out.println("Entrez votre nom d'utilisateur:");
		
		/*
		 *  La variable 'u' re�oit la chaine de caract�res saisis par l'utilisateur.
		 */
		u = sc.nextLine();
		
		
		/*
		 *  Cr�ation d'une boucle WHILE qui doit redemander
		 */
		
		while (!u.equals(super.getNomutilisateur()))
		{
			System.out.println("Nom d'utilisateur incorrect, veuillez reessayer:");
			System.out.println("Entrez votre nom d'utilisateur:");
			// La variable 'u' re�oit la chaine de caract�res saisis par l'utilisateur.
			u = sc.nextLine();		
		}
		
		
		/*
		 * On affiche les instructions 
		 */
				System.out.println("Entrez votre mot de passe:");
				// La variable 'p' re�oit la chaine de caract�res saisis par l'utilisateur.
				p = sc.nextLine();  
							
		while (!p.equals(super.getMotdepasse()))
		{
			System.out.println(" mot de passe incorrect, veuillez reessayer:");
			
			System.out.println("Entrez votre mot de passe:");
			/*
			 *  La variable 'p' re�oit la chaine de caract�res saisis par l'utilisateur.
			 */
			p = sc.nextLine();  
			
		}
		/*
		 * On affiche les instructions 
		 */
		System.out.println(u + " " + "Bienvenue dans votre compte"); 
	}
}		



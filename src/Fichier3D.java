import java.util.Scanner;

/**
 * Cration d'une classe fichier3D qui comporte les differentes methodes 
 * necessaires a la gestion de ses fichiers 3D
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public class Fichier3D {								
	/*
	 *  Propri�t�s
	 */
	protected String fichier;
	protected String description;
	protected String categorie;
	protected String auteur;
	
		/*
		 *  Getters et Setters
		 */
	
	public String getFichier() {
		return fichier;
	}

	public void setFichier() {
		String fichier = sc.nextLine();
		this.fichier = fichier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription() {
		String description = sc.nextLine();
		this.description = description;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie() {
		String categorie = sc.nextLine();
		this.categorie = categorie;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur() {
		String auteur = sc.nextLine();
		this.auteur = auteur;
	}

	/*
	 *  Cr�ation d'un objet 'sc' de type Scanner.
	 */
	Scanner sc = new Scanner(System.in);
	
	/*
	 *  Mise en place d'une m�thode enregistrerFichier3D.
	 */
	protected void enregistrerFichier3D () {
	
		/*
		 * On affiche les instructions .
		 */
		System.out.println ("Entrez le nom du fichier");
		
		/*
		 *  La variable 'fichier' re�oit la chaine de caract�res saisis par l'utilisateur.
		 */
		this.setFichier();
		
		/*
		 * On affiche les instructions .
		 */
		System.out.println ("Effectuez une breve description du fichier");
		/*
		 *  La variable 'description' re�oit la chaine de caract�res saisis par l'utilisateur.
		 */
		this.setDescription();
		
		System.out.println ("Entrez une categorie pour votre fichier");
		/*
		 *  La variable 'cat�gorie' re�oit la chaine de caract�res saisis par l'utilisateur.
		 */
		this.setCategorie();
		
		System.out.println ("Nom et contact de l'auteur:");
		/*
		 *  La variable 'auteur' re�oit la chaine de caract�res saisis par l'utilisateur.
		 */
	this.setAuteur();

	System.out.println ("VOTRE FICHIER EST BIEN ENREGISTRE");
	}
}

import java.util.Scanner;

/**
 *Création d'une classe personne qui regroupe les informations de base d'un utilisateur
 * @author BILIM TONYE Emmanuel Roussel
 */
public class Personne {
	/*
	 *  Propriétés
	 */
	protected String nom;
	protected String prenom;
	protected String email;
	protected String nomutilisateur;
	protected String motdepasse;
	
	/*
	 *  Création d'un objet 'sc' de type Scanner.
	 */
	Scanner sc = new Scanner(System.in);

	/*
	 * Getters & Setters
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomutilisateur() {
		return nomutilisateur;
	}

	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;

	

	}
	
}

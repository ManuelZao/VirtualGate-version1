import java.util.Scanner;
/**
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public class VirtualGate {								

	public static void main (String arg[]) {
		System.out.println ("VirtualGate acc�s autoris�");
		
		/*
		 *  Instanciation des objets.
		 */
		Utilisateur ut = new Utilisateur() ;
		Fichier3D f = new Fichier3D() ;
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  Afficher les informations suivantes
		 */
		System.out.println ("Que voulez vous faire:");
		System.out.println ("a/ Cr�er un compte");
		System.out.println ("b/ Se connecter � votre compte");
		System.out.println ("c/ Enregistrer un fichier 3D");
		System.out.println ("d/ Continuer la visite");
		System.out.println ("Entrer a, b, c ou d:");
		
		char reponse = sc.nextLine().charAt(0);
		
		while (reponse == 'a' || reponse == 'b' || reponse == 'c' || reponse == 'd')
		{
			/*
			 * Pour chaque choix effectu� on fera appel � la m�thode correspondante
			 */

				switch (reponse)
					{
					case 'a':
						ut.cr�erCompte();
						break;
					  case 'b':
						  ut.connexion();;
						break;
					  case 'c':
						  f.enregistrerFichier3D();
						break;
					  case 'd':
						  System.out.println("Bonne visite virtuelle");
							break;
					  default:
						System.out.println("Merci de votre visite.");
					}
					/*
					 * On demande si la personne veut effectuer une autre op�ration
					 */
			  System.out.println("Voulez-vous effectuer une autre operation ? Entrer a, b, c ou d. ou N pour continuer la visite: ");
			  
			  /*
			   * On r�cup�re la r�ponse de l'utilisateur
			   */
			  reponse = sc.nextLine().charAt(0);
		}
		/*
		 * Message de fin de programme
		 */
		System.out.println("Merci de votre visite.");
	}
		
}		
		
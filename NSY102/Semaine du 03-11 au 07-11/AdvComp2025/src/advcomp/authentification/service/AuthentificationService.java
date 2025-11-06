package advcomp.authentification.service;

/**
 * Service dédié à l'authentification des utilisateur 
 *
 */
public interface AuthentificationService {

	/**
	 * Authentification d'un utilisateur d'après son login et mot de passe
	 * @param login
	 * @param password
	 * @return treu si l'authentification a réussie et false sinon
	 */
	public boolean authentifier(String login, String password);
	
}

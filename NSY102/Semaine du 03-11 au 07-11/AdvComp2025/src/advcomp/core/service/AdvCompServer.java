package advcomp.core.service;

public interface AdvCompServer {

	/**
	 * Connexion à AdvComp^
	 * retourne le service pour le client si son authentification a réussi
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	public AdvCompService connecter(String login, String password);
	
}

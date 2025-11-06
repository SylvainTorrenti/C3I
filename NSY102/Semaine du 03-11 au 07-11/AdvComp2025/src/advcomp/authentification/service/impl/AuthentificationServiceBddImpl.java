package advcomp.authentification.service.impl;

import advcomp.ServiceLocator;
import advcomp.authentification.service.AuthentificationService;
import advcomp.utilisateur.dao.UtilisateurDao;
import advcomp.utilisateur.entity.Utilisateur;

public class AuthentificationServiceBddImpl implements AuthentificationService {

	private UtilisateurDao utilisateurDao;
	

	public AuthentificationServiceBddImpl() {
		super();
	}
	
	public AuthentificationServiceBddImpl(UtilisateurDao utilisateurDao) {
		super();
		this.utilisateurDao = utilisateurDao;
	}

	public UtilisateurDao getUtilisateurDao() {
		// Si pas de service alors in le demande au ServiceLocator
		if(utilisateurDao == null) {
			utilisateurDao = ServiceLocator.getInstance().getUtilisateurDao();
		}

		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}


	@Override
	public boolean authentifier(String login, String password) {
		Utilisateur utilisateur = getUtilisateurDao().getUtilisateurParMail(login);
		return utilisateur != null && utilisateur.getMotDePasse().equals(password);
	}

}

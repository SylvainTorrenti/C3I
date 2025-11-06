package advcomp.core.service.impl;

import java.util.function.Function;

import advcomp.ServiceLocator;
import advcomp.authentification.service.AuthentificationService;
import advcomp.core.service.AdvCompServer;
import advcomp.core.service.AdvCompService;
import advcomp.utilisateur.dao.UtilisateurDao;
import advcomp.utilisateur.entity.Utilisateur;

public class AdvCompServerImpl implements AdvCompServer {

	private AuthentificationService authentificationService;
	
	private UtilisateurDao utilisateurDao;
	
	private Function<Utilisateur, AdvCompService> fabriqueAdvCompService;
	
	public AdvCompServerImpl(Function<Utilisateur, AdvCompService> fabriqueAdvCompService) {
		super();
		this.fabriqueAdvCompService = fabriqueAdvCompService;
	}

	public AdvCompServerImpl(AuthentificationService authentificationService, UtilisateurDao utilisateurDao, Function<Utilisateur, AdvCompService> fabriqueAdvCompService) {
		super();
		this.authentificationService = authentificationService;
		this.utilisateurDao = utilisateurDao;
		this.fabriqueAdvCompService = fabriqueAdvCompService;
	}

	public AdvCompServerImpl() {
		
	}

	public AuthentificationService getAuthentificationService() {
		// Si pas de service alors in le demande au ServiceLocator
		if(authentificationService == null) {
			authentificationService = ServiceLocator.getInstance().getAuthentificationService();
		}

		return authentificationService;
	}

	public void setAuthentificationService(AuthentificationService authentificationService) {
		this.authentificationService = authentificationService;
	}

	public UtilisateurDao getUtilisateurDao() {
		if(utilisateurDao == null) {
			utilisateurDao = ServiceLocator.getInstance().getUtilisateurDao();
		}
		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}



	@Override
	public AdvCompService connecter(String login, String password) {
		if(getAuthentificationService().authentifier(login, password)) {
			Utilisateur client = getUtilisateurDao().getUtilisateurParMail(login);
			//XXX: si client non trouvé lever erreur
			return fabriqueAdvCompService.apply(client);
		} else {
			return null;			
		}
	}

}

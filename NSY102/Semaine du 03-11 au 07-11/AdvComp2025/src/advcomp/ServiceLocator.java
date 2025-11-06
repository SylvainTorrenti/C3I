package advcomp;

import advcomp.authentification.service.AuthentificationService;
import advcomp.calcul.service.CalculService;
import advcomp.facturation.dao.FactureDao;
import advcomp.facturation.dao.OperationDao;
import advcomp.facturation.service.FacturationService;
import advcomp.utilisateur.dao.UtilisateurDao;

public class ServiceLocator {

	// Singleton
	
	private static ServiceLocator instance;
	
	public static ServiceLocator getInstance() {
		if(instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	// Services

	private UtilisateurDao utilisateurDao;
	private FactureDao factureDao;
	private OperationDao operationDao;
	
	private FacturationService facturationService;
	private AuthentificationService authentificationService;
	private CalculService calculService;
	
	public UtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}
	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}
	
	public FactureDao getFactureDao() {
		return factureDao;
	}
	public void setFactureDao(FactureDao factureDao) {
		this.factureDao = factureDao;
	}
	
	public OperationDao getOperationDao() {
		return operationDao;
	}
	public void setOperationDao(OperationDao operationDao) {
		this.operationDao = operationDao;
	}
	
	public FacturationService getFacturationService() {
		return facturationService;
	}
	public void setFacturationService(FacturationService facturationService) {
		this.facturationService = facturationService;
	}
	
	public AuthentificationService getAuthentificationService() {
		return authentificationService;
	}
	public void setAuthentificationService(AuthentificationService authentificationService) {
		this.authentificationService = authentificationService;
	}
	
	public CalculService getCalculService() {
		return calculService;
	}
	public void setCalculService(CalculService calculService) {
		this.calculService = calculService;
	}
	
	
	
}

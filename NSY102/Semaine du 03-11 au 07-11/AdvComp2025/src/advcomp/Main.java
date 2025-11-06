package advcomp;

import java.util.function.Function;

import advcomp.authentification.service.AuthentificationService;
import advcomp.authentification.service.impl.AuthentificationServiceBddImpl;
import advcomp.calcul.service.CalculService;
import advcomp.calcul.service.impl.CalculServiceBugImpl;
import advcomp.calcul.service.impl.CalculServiceImpl;
import advcomp.core.service.AdvCompServer;
import advcomp.core.service.AdvCompService;
import advcomp.core.service.impl.AdvCompServerImpl;
import advcomp.core.service.impl.AdvCompServiceImpl;
import advcomp.facturation.dao.FactureDao;
import advcomp.facturation.dao.OperationDao;
import advcomp.facturation.dao.impl.FactureDaoBddImpl;
import advcomp.facturation.dao.impl.OperationDaoBddImpl;
import advcomp.facturation.entity.Operateur;
import advcomp.facturation.service.FacturationService;
import advcomp.facturation.service.impl.FacturationServiceImpl;
import advcomp.utilisateur.dao.UtilisateurDao;
import advcomp.utilisateur.dao.impl.UtilisateurDaoBddImpl;
import advcomp.utilisateur.entity.Utilisateur;

public class Main {

	/**
	 * Instanciation de tous les services en remplissant les dépendances nécessaires
	 * @return
	 */
	public static AdvCompServer advCompMontageManuel() {
		OperationDao operationDao = new OperationDaoBddImpl();
		FactureDao factureDao = new FactureDaoBddImpl();
		UtilisateurDao utilisateurDao = new UtilisateurDaoBddImpl();
		
		CalculService calculService = new CalculServiceImpl(); 
		FacturationService facturationService = new FacturationServiceImpl(operationDao, factureDao);
		AuthentificationService authentificationService = new AuthentificationServiceBddImpl(utilisateurDao);

		// Fabrique de service par client
		Function<Utilisateur, AdvCompService> fabriqueAdvCompService = (client) -> new AdvCompServiceImpl(client, calculService, facturationService);
		
		AdvCompServer advCompServer = new AdvCompServerImpl(authentificationService, utilisateurDao, fabriqueAdvCompService);
		
		return advCompServer;
	}
	
	public static AdvCompServer advCompMontageManuel2() {
		OperationDao operationDao = new OperationDaoBddImpl();
		FactureDao factureDao = new FactureDaoBddImpl();
		UtilisateurDao utilisateurDao = new UtilisateurDaoBddImpl();
		
		CalculService calculService = new CalculServiceBugImpl();
		FacturationService facturationService = new FacturationServiceImpl(operationDao, factureDao);
		AuthentificationService authentificationService = new AuthentificationServiceBddImpl(utilisateurDao);

		// Fabrique de service par client
		Function<Utilisateur, AdvCompService> fabriqueAdvCompService = (client) -> new AdvCompServiceImpl(client, calculService, facturationService);
		
		AdvCompServer advCompServer = new AdvCompServerImpl(authentificationService, utilisateurDao, fabriqueAdvCompService);
		
		return advCompServer;
	}
	
	/**
	 * Montage avec configuration d'un ServiceLocator
	 * @return
	 */
	public static AdvCompServer advCompMontageLocator() {
		OperationDao operationDao = new OperationDaoBddImpl();
		FactureDao factureDao = new FactureDaoBddImpl();
		UtilisateurDao utilisateurDao = new UtilisateurDaoBddImpl();
		
		CalculService calculService = new CalculServiceImpl(); 
		FacturationService facturationService = new FacturationServiceImpl();
		AuthentificationService authentificationService = new AuthentificationServiceBddImpl();
		
		ServiceLocator serviceLocator = ServiceLocator.getInstance();

		serviceLocator.setAuthentificationService(authentificationService);
		serviceLocator.setCalculService(calculService);
		serviceLocator.setFacturationService(facturationService);
		serviceLocator.setFactureDao(factureDao);
		serviceLocator.setOperationDao(operationDao);
		serviceLocator.setUtilisateurDao(utilisateurDao);

		// Fabrique de service par client
		Function<Utilisateur, AdvCompService> fabriqueAdvCompService = (client) -> new AdvCompServiceImpl(client);
		
		AdvCompServer advCompServer = new AdvCompServerImpl(fabriqueAdvCompService);
		
		return advCompServer;
	}
	
	
	private static void test(AdvCompServer advCompServer ) {
		AdvCompService advCompService = advCompServer.connecter("toto@tutu.com", "secret");
		System.out.println(advCompService.faireOperationBasique(1d, Operateur.ADDITION, 2d));
		System.out.println(advCompService.faireOperationBasique(55d, Operateur.MULTIPLICATION, 12d));		
	}
	
	public static void main(String[] args) {
		
		test(advCompMontageManuel());
		
		System.out.println("--------------------------");
		
		test(advCompMontageManuel2());
		
		System.out.println("--------------------------");
		
		test(advCompMontageLocator());
		
		
		
		
		
	}
	
}

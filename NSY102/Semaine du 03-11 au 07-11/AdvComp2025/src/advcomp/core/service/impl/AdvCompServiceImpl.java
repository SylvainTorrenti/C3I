package advcomp.core.service.impl;

import advcomp.ServiceLocator;
import advcomp.calcul.service.CalculService;
import advcomp.core.service.AdvCompService;
import advcomp.facturation.entity.Operateur;
import advcomp.facturation.service.FacturationService;
import advcomp.utilisateur.entity.Utilisateur;

public class AdvCompServiceImpl implements AdvCompService {


	private Utilisateur client;
	
	private CalculService calculService;
	
	private FacturationService facturationService;
	
	
	public AdvCompServiceImpl() {
		
	}	
	
	public AdvCompServiceImpl(Utilisateur client) {
		super();
		this.client = client;
	}
	
	public AdvCompServiceImpl(Utilisateur client, CalculService calculService, FacturationService facturationService) {
		super();
		this.calculService = calculService;
		this.facturationService = facturationService;
		this.client = client;
	}

	public CalculService getCalculService() {
		if(calculService == null) {
			calculService = ServiceLocator.getInstance().getCalculService();
		}
		return calculService;
	}

	public void setCalculService(CalculService calculService) {
		this.calculService = calculService;
	}

	public FacturationService getFacturationService() {
		if(facturationService == null) {
			facturationService = ServiceLocator.getInstance().getFacturationService();
		}
		return facturationService;
	}

	public void setFacturationService(FacturationService facturationService) {
		this.facturationService = facturationService;
	}

	
	
	@Override
	public Double faireOperationBasique(Double facteur1, Operateur operateur, Double facteur2) {
		
		Double resultat;
		
		// Calcul
		switch(operateur) {
		case ADDITION:
			resultat = getCalculService().additionner(facteur1, facteur2);
			break;
		case SOUSTRACTION:
			resultat = getCalculService().soustraire(facteur1, facteur2);
			break;
		case MULTIPLICATION:
			resultat = getCalculService().multiplier(facteur1, facteur2);
			break;
		case DIVISION:
			resultat = getCalculService().diviser(facteur1, facteur2);
		default :
			throw new RuntimeException("Opération non traitée");		
		}

		// Historiqation pour facturation
		getFacturationService().historiserOperation(client, facteur1, operateur, facteur2);
		
		return resultat;
	}

	@Override
	public void demarrerOperationChainee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculerMaillon(Operateur operateur, Double facteur) {
		// TODO Auto-generated method stub

	}

	@Override
	public Double terminerOperationChainee() {
		// TODO Auto-generated method stub
		return null;
	}

}

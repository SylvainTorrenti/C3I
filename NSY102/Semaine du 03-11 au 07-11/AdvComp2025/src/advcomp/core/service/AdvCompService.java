package advcomp.core.service;

import advcomp.facturation.entity.Operateur;

public interface AdvCompService {
	
	public Double faireOperationBasique(Double facteur1, Operateur operateur, Double facteur2);
	
	public void demarrerOperationChainee();
	
	public void calculerMaillon(Operateur operateur, Double facteur);
	
	public Double terminerOperationChainee();
	
}

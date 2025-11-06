package advcomp.facturation.service;

import java.time.LocalDateTime;

import advcomp.facturation.entity.Operateur;
import advcomp.utilisateur.entity.Utilisateur;

public interface FacturationService {
	
	public void lancerFacturation(LocalDateTime dateDebut, LocalDateTime dateFin);
	
	public void historiserOperation(Utilisateur utilisateur, Double fact1, Operateur operteur, Double fact2);
}

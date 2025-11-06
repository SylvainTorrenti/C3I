package advcomp.facturation.service.impl;

import java.time.LocalDateTime;
import java.util.Date;

import advcomp.ServiceLocator;
import advcomp.facturation.dao.FactureDao;
import advcomp.facturation.dao.OperationDao;
import advcomp.facturation.entity.Operateur;
import advcomp.facturation.entity.Operation;
import advcomp.facturation.service.FacturationService;
import advcomp.utilisateur.entity.Utilisateur;

public class FacturationServiceImpl implements FacturationService {

	private OperationDao operationDao;
	
	private FactureDao factureDao;
	
	
	public FacturationServiceImpl() {
	}
	
	public FacturationServiceImpl(OperationDao operationDao, FactureDao factureDao) {
		super();
		this.operationDao = operationDao;
		this.factureDao = factureDao;
	}


	public OperationDao getOperationDao() {
		// Si pas de service alors in le demande au ServiceLocator
		if(operationDao == null) {
			operationDao = ServiceLocator.getInstance().getOperationDao();
		}
		return operationDao;
	}

	public void setOperationDao(OperationDao operationDao) {
		this.operationDao = operationDao;
	}

	public FactureDao getFactureDao() {
		// Si pas de service alors in le demande au ServiceLocator
		if(factureDao == null) {
			factureDao = ServiceLocator.getInstance().getFactureDao();
		}
		return factureDao;
	}

	public void setFactureDao(FactureDao factureDao) {
		this.factureDao = factureDao;
	}

	@Override
	public void historiserOperation(Utilisateur utilisateur, Double fact1, Operateur operateur, Double fact2) {
		// Création et alimentation instance d'opération
		Operation operation = getOperationDao().getNew();
		operation.setHoroDate(LocalDateTime.now());
		operation.setClient(utilisateur);
		operation.setFacteur1(fact1);
		operation.setOperateur(operateur);
		operation.setFacteur2(fact2);
		// Enregistrement de l'opération
		getOperationDao().create(operation);
	}
	
	@Override
	public void lancerFacturation(LocalDateTime dateDebut, LocalDateTime dateFin) {
		// TODO Auto-generated method stub

	}



}

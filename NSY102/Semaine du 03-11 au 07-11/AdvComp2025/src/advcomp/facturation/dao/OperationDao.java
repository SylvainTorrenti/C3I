package advcomp.facturation.dao;

import java.time.LocalDateTime;
import java.util.List;

import advcomp.facturation.entity.Operation;
import advcomp.fmk.Dao;

public interface OperationDao extends Dao<Operation, Long> {
	
	/**
	 * Retourne la liste des opérations sur la période non attachées à une facture
	 * la liste des fournis triés par idClient et date
	 * @param dateDebut
	 * @param dateFin
	 * @return
	 */
	public List<Operation> getOperationsAFacturer(LocalDateTime dateDebut, LocalDateTime dateFin);
	
}

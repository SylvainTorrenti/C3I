package advcomp.facturation.dao.impl;

import java.time.LocalDateTime;
import java.util.List;

import advcomp.facturation.dao.OperationDao;
import advcomp.facturation.entity.Operation;
import advcomp.facturation.entity.impl.OperationBddImpl;

public class OperationDaoBddImpl implements OperationDao {

	@Override
	public Operation create(Operation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation read(Long ID_TYPE) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation update(Operation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Operation entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Operation getNew() {
		return new OperationBddImpl();
	}


	@Override
	public List<Operation> getOperationsAFacturer(LocalDateTime dateDebut, LocalDateTime dateFin) {
		// TODO Auto-generated method stub
		return null;
	}

}

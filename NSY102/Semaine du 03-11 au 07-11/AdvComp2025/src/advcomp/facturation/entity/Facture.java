package advcomp.facturation.entity;

import java.util.Date;
import java.util.List;

import advcomp.utilisateur.entity.Utilisateur;

public interface Facture {

	String getNumero();

	void setNumero(String numero);

	Date getDate();

	void setDate(Date date);

	Double getMontant();

	void setMontant(Double montant);

	Boolean getReglee();

	void setReglee(Boolean reglee);

	Utilisateur getClient();

	void setClient(Utilisateur client);

	List<Operation> getOperations();

	void setOperations(List<Operation> operations);
	
	

}
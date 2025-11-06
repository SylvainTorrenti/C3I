package advcomp.facturation.entity.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import advcomp.facturation.entity.Facture;
import advcomp.facturation.entity.Operation;
import advcomp.utilisateur.entity.Utilisateur;

public class FactureImpl implements Facture {

	private String numero;
	private Date date;
	private Double montant;
	private Boolean Reglee;

	private Utilisateur client;
	
	private List<Operation> operations = new ArrayList<Operation>();


	@Override
	public String getNumero() {
		return numero;
	}

	@Override
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public Double getMontant() {
		return montant;
	}

	@Override
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	@Override
	public Boolean getReglee() {
		return Reglee;
	}

	@Override
	public void setReglee(Boolean reglee) {
		Reglee = reglee;
	}
	
	@Override
	public Utilisateur getClient() {
		return client;
	}

	@Override
	public void setClient(Utilisateur client) {
		this.client = client;
	}

	@Override
	public List<Operation> getOperations() {
		return operations;
	}

	@Override
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
}

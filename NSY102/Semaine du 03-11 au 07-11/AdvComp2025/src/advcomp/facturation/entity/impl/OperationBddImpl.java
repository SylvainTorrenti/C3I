package advcomp.facturation.entity.impl;

import java.time.LocalDateTime;

import advcomp.facturation.entity.Operateur;
import advcomp.facturation.entity.Operation;
import advcomp.utilisateur.entity.Utilisateur;


public class OperationBddImpl implements Operation {

	private final String TABLE = "TOperation";
	private Long id;
	private LocalDateTime horoDate;
	private Double facteur1;
	private Double facteur2;
	private Operateur operateur;
	
	private FactureImpl facture;
	private Utilisateur client;
	
	
	public String getTable() {
		return TABLE;
	}
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public LocalDateTime getHoroDate() {
		return horoDate;
	}

	@Override
	public void setHoroDate(LocalDateTime horoDate) {
		this.horoDate = horoDate;
	}

	@Override
	public Double getFacteur1() {
		return facteur1;
	}

	@Override
	public void setFacteur1(Double facteur1) {
		this.facteur1 = facteur1;
	}

	@Override
	public Double getFacteur2() {
		return facteur2;
	}

	@Override
	public void setFacteur2(Double facteur2) {
		this.facteur2 = facteur2;
	}

	@Override
	public Operateur getOperateur() {
		return operateur;
	}

	@Override
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	public FactureImpl getFacture() {
		return facture;
	}

	public void setFacture(FactureImpl facture) {
		this.facture = facture;
	}

	public Utilisateur getClient() {
		return client;
	}

	public void setClient(Utilisateur client) {
		this.client = client;
	}
	
	
}

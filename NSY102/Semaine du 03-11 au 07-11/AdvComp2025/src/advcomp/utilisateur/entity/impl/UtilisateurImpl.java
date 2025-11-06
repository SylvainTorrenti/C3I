package advcomp.utilisateur.entity.impl;

import java.util.ArrayList;
import java.util.List;

import advcomp.facturation.entity.Facture;
import advcomp.utilisateur.entity.Role;
import advcomp.utilisateur.entity.Utilisateur;

public class UtilisateurImpl implements Utilisateur {

	private Long id;
	private String mail;
	private String motDePasse;
	private String nom;
	private Role role;

	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getMail() {
		return mail;
	}

	@Override
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String getMotDePasse() {
		return motDePasse;
	}

	@Override
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public Role getRole() {
		return role;
	}

	@Override
	public void setRole(Role role) {
		this.role = role;
	}



	
}

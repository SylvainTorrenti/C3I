package advcomp.utilisateur.entity;

import java.util.List;

import advcomp.facturation.entity.Facture;

public interface Utilisateur {

	Long getId();

	void setId(Long id);

	String getMail();

	void setMail(String mail);

	String getMotDePasse();

	void setMotDePasse(String motDePasse);

	String getNom();

	void setNom(String nom);

	Role getRole();

	void setRole(Role role);

	

}
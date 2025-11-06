package advcomp.facturation.entity;

import java.time.LocalDateTime;

import advcomp.utilisateur.entity.Utilisateur;

public interface Operation {
	public Long getId();
	public void setId(Long id);
	public LocalDateTime getHoroDate();
	public void setHoroDate(LocalDateTime horoDate);
	public Double getFacteur1();
	public void setFacteur1(Double facteur1);
	public Double getFacteur2();
	public void setFacteur2(Double facteur2);
	public Operateur getOperateur();
	public void setOperateur(Operateur operateur);
	
	public Utilisateur getClient();
	public void setClient(Utilisateur client);
}

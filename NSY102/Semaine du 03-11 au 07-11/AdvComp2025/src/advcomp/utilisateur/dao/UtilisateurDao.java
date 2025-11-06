package advcomp.utilisateur.dao;

import advcomp.fmk.Dao;
import advcomp.utilisateur.entity.Utilisateur;

public interface UtilisateurDao extends Dao<Utilisateur, Long> {

	public Utilisateur getUtilisateurParMail(String mail);
	
}

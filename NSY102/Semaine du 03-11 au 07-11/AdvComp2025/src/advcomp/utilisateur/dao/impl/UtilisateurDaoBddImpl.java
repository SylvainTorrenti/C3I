package advcomp.utilisateur.dao.impl;

import advcomp.utilisateur.dao.UtilisateurDao;
import advcomp.utilisateur.entity.Role;
import advcomp.utilisateur.entity.Utilisateur;
import advcomp.utilisateur.entity.impl.UtilisateurImpl;

public class UtilisateurDaoBddImpl implements UtilisateurDao {

	@Override
	public Utilisateur create(Utilisateur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur read(Long ID_TYPE) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Utilisateur entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur getNew() {
		return new UtilisateurImpl();
	}

	@Override
	public Utilisateur getUtilisateurParMail(String mail) {
		if("toto@tutu.com".equals(mail)) {
			Utilisateur utilisateur = getNew();
			utilisateur.setId(1l);
			utilisateur.setMail(mail);
			utilisateur.setNom("Toto");
			utilisateur.setRole(Role.CLIENT);	
			utilisateur.setMotDePasse("secret");
			return utilisateur;
		} else {
			return null;			
		}
	}
	
}

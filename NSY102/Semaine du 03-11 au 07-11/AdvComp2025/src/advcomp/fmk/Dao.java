package advcomp.fmk;

/**
 * DAO Type
 */
public interface Dao<ENTITY, ID_TYPE> {
	
	/**
	 * Création d'une entité
	 * @param entity
	 * @return
	 */
	public ENTITY create(ENTITY entity);
	
	/**
	 * Obtention d'une entité persistée par son id
	 * @param ID_TYPE
	 * @return
	 */
	public ENTITY read(Long ID_TYPE);
	
	/**
	 * Mise à jour de l'état d'une entité persistée
	 * @param entity
	 * @return
	 */
	public ENTITY update(ENTITY entity);
	
	
	/**
	 * Suppression d'une entité persistée
	 * @param entity
	 * @return
	 */
	public void delete(ENTITY entity);
	
	
	/**
	 * Retourne une nouvelle instance du type d'entité gérée
	 * @return
	 */
	public ENTITY getNew();
	
}

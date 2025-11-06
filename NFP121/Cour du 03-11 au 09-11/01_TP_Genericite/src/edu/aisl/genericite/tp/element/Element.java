package edu.aisl.genericite.tp.element;

public abstract class Element {

	/**
	 * Code identifiant l'élément
	 */
	protected String code;
	
	/**
	 * Libellé descriptif de l'élément
	 */
	protected String libelle;

	
	public Element(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	/**
	 * Représentation texte de l'élément
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + ":" + code + " - " + libelle;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
}

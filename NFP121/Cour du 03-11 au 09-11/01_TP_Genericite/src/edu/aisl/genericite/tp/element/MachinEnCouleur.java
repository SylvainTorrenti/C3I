package edu.aisl.genericite.tp.element;

public class MachinEnCouleur extends Machin {

	/**
	 * Couleur du machin
	 */
	protected String couleur;
	
	public MachinEnCouleur(String code, String libelle, String couleur) {
		super(code, libelle);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + couleur;
	}

}

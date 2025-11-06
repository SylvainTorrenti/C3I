package edu.aisl.genericite.tp.element;

/**
 * Un Element Truc en flacon
 */
public class TrucEnFlacon extends Truc implements EnBouteille {

	public TrucEnFlacon(String code, String libelle) {
		super(code, libelle);
	}
	
	@Override
	public void remplir() {
		System.out.println("Remplissage du truc en flacon");
	}

	@Override
	public void vider() {
		System.out.println("Vidage du truc en flacon");
	}

}

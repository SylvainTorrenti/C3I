package edu.aisl.genericite.tp.element;

/**
 * Un Element Bidule en bouteille
 */
public class BiduleEnBouteille extends Bidule implements EnBouteille{

	public BiduleEnBouteille(String code, String libelle) {
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

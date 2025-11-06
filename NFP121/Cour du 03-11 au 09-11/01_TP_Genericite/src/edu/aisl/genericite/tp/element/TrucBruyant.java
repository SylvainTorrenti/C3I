package edu.aisl.genericite.tp.element;

/**
 * Un Element Truc Bruyant
 */
public class TrucBruyant extends Truc {

	public TrucBruyant(String code, String libelle) {
		super(code, libelle);
	}
	
	public void faireDuBruit() {
		System.out.println("DU BRUIT !!!!!");
	}

}

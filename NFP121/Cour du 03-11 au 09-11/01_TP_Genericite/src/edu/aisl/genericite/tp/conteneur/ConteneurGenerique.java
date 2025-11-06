package edu.aisl.genericite.tp.conteneur;

import java.util.ArrayList;
import java.util.List;

import edu.aisl.genericite.tp.element.Element;

/**
 * Conteneur générique pouvant stocker tout type d'objet
 * 
 */
public class ConteneurGenerique <ELEMENT_CONTENU> {
	/**
	 * Stockage des éléments
	 */
	protected List<ELEMENT_CONTENU> contenu = new ArrayList<>();
	
	/**
	 * Akput d'un élément au conteneur
	 * @param element
	 */
	public void add(ELEMENT_CONTENU element) {
		contenu.add(element);
	}

	/**
	 * Retrait d'un élément du conteneur
	 * @param element
	 */
	public void remove(ELEMENT_CONTENU element) {
		contenu.remove(element);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CONTENEUR :{");
		for(ELEMENT_CONTENU e : contenu) {
			sb.append(e.toString() + ", ");
		}
		sb.append("}");
		return sb.toString();
	}

}

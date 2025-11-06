package edu.aisl.genericite.tp.conteneur;

import java.util.ArrayList;
import java.util.List;

import edu.aisl.genericite.tp.element.Element;

/**
 * Conteneur pouvant stocker tous les objets de type Element
 * 
 */
public class ConteneurPourElements {
	/**
	 * Stockage des éléments
	 */
	protected List<Element> contenu = new ArrayList<>();
	
	/**
	 * Akput d'un élément au conteneur
	 * @param element
	 */
	public void add(Element element) {
		contenu.add(element);
	}

	/**
	 * Retrait d'un élément du conteneur
	 * @param element
	 */
	public void remove(Element element) {
		contenu.remove(element);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CONTENEUR :{");
		for(Element e : contenu) {
			sb.append(e.toString() + ", ");
		}
		sb.append("}");
		return sb.toString();
	}

}

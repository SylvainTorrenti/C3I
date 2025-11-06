package edu.aisl.genericite.tp.conteneur;

import java.util.ArrayList;
import java.util.List;

import edu.aisl.genericite.tp.element.Element;
import edu.aisl.genericite.tp.element.EnBouteille;

public class ConteneurElementEnBouteilleV2 {

	protected List<Element> elements = new ArrayList<>();
	
	public <TYPE_ELEMENT extends Element & EnBouteille>  void add(TYPE_ELEMENT element) {
		elements.add(element);
	}
	
	public <TYPE_ELEMENT extends Element & EnBouteille> void remove(TYPE_ELEMENT element) {
		elements.remove(element);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Object objElem : elements) {
			sb.append(objElem.toString() + "\n");
		}
		return sb.toString();
	}
		
}

package edu.aisl.genericite.tp.conteneur;

import edu.aisl.genericite.tp.element.Element;
import edu.aisl.genericite.tp.element.EnBouteille;

/**
 * @param <ELEMENT_EN_BOUTEILLE> type d'élément en bouteille stockable par le conteneur
 */
public class ConteneurEnBouteille<ELEMENT_EN_BOUTEILLE extends Element & EnBouteille> extends ConteneurGeneriqueElement<ELEMENT_EN_BOUTEILLE > {

}

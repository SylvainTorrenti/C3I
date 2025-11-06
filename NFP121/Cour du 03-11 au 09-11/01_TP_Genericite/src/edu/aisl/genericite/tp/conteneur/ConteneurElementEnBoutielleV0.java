package edu.aisl.genericite.tp.conteneur;

import edu.aisl.genericite.tp.element.Element;

/**
 * On tente de donner la valeur Element & EnBouteille au ConteneurGeneriqueElement
 * mais ce n'est pas syntaxiquement correct : on ne peut donner qu'un type et pas une contrainte
 */
public class ConteneurElementEnBoutielleV0 extends ConteneurGeneriqueElement<Element & EnBouteille>{

}

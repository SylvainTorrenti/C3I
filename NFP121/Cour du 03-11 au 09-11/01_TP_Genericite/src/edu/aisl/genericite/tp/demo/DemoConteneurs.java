package edu.aisl.genericite.tp.demo;

import edu.aisl.genericite.tp.conteneur.ConteneurElementEnBouteilleV2;
import edu.aisl.genericite.tp.conteneur.ConteneurElementEnBouteilleV1;
import edu.aisl.genericite.tp.conteneur.ConteneurEnBouteille;
import edu.aisl.genericite.tp.conteneur.ConteneurGeneriqueElement;
import edu.aisl.genericite.tp.conteneur.ConteneurPourElements;
import edu.aisl.genericite.tp.element.Bidule;
import edu.aisl.genericite.tp.element.BiduleEnBouteille;
import edu.aisl.genericite.tp.element.Element;
import edu.aisl.genericite.tp.element.EnBouteille;
import edu.aisl.genericite.tp.element.Machin;
import edu.aisl.genericite.tp.element.MachinEnCouleur;
import edu.aisl.genericite.tp.element.Truc;
import edu.aisl.genericite.tp.element.TrucBruyant;
import edu.aisl.genericite.tp.element.TrucEnFlacon;

public class DemoConteneurs {

	public static void demoConteneurElement() {
		ConteneurPourElements conteneurElem = new ConteneurPourElements();
		conteneurElem.add(new Bidule("BID1", "Bidule 1"));
		conteneurElem.add(new MachinEnCouleur("MACH01", "Machin 01", "Bleu"));
		System.out.println(conteneurElem);		
	}

	public static void demoConteneurTruc() {
		ConteneurGeneriqueElement<Truc> conteneurTruc = new ConteneurGeneriqueElement<>();
		conteneurTruc.add(new Truc("TRUC1", "TRuc 1"));
		conteneurTruc.add(new TrucBruyant("TRUC2", "TRuc 2"));
		// Impossible car un Bidule n'est pas un Truc
		//conteneurTruc.add(new Bidule("TRUC2", "TRuc 2"));
		System.out.println(conteneurTruc);		
	}
	
	public static void demoConteneurMachin() {
		ConteneurGeneriqueElement<Machin> conteneurMachin = new ConteneurGeneriqueElement<>();
		conteneurMachin.add(new Machin("MACHIN1", "Machin1 1"));
		conteneurMachin.add(new MachinEnCouleur("MACH2", "Machinc 2 blanc", "Blanc"));
		System.out.println(conteneurMachin);		
	}

	
	
	
	public static void demoConteneurEnBouteille() {

		// Il est possible de créer des conteneurs d'élément en bouteille mais impossible de mélanger des
		// TrucEnFlacon et BiduleEnBouteille dans un même conteneur
		
		ConteneurEnBouteille<TrucEnFlacon> conteneurDeFlacon = new ConteneurEnBouteille<>();
		conteneurDeFlacon.add(new TrucEnFlacon("TRUCFL1", "TRuc flacon 1"));
		conteneurDeFlacon.add(new TrucEnFlacon("TRUCFL2", "TRuc flacon 2"));
		System.out.println(conteneurDeFlacon);		

		ConteneurEnBouteille<BiduleEnBouteille> conteneurBidEnBout = new ConteneurEnBouteille<>();
		conteneurBidEnBout.add(new BiduleEnBouteille("BIDBOU1", "Bidul en bout 1"));
		conteneurBidEnBout.add(new BiduleEnBouteille("BIDBOU2", "Bidul en bout 2"));
		System.out.println(conteneurBidEnBout);		
	}
	
	public static <ELEM_EN_BOUT extends Element & EnBouteille> void demoConteneurEnBouteille2() {
		// Pour mélanger les TrucEnFlacon et les BiduleEnBouteille on est obligé de caster
		// car il n'ont aucun ancêtre commun étant un Element et EnBouteille
		// Il faudrait créer un ancêtre commun réalisant une interface ElementDeConteneur et EnBouteille
		// pour éviter ce problème.

		ConteneurGeneriqueElement<ELEM_EN_BOUT> conteneurElemEnBout = new ConteneurGeneriqueElement<>();
		conteneurElemEnBout.add((ELEM_EN_BOUT) new TrucEnFlacon("TRUCFL1", "TRuc flacon 1"));
		conteneurElemEnBout.add((ELEM_EN_BOUT) new BiduleEnBouteille("BIDBOU2", "Bidul en bout 2"));
		Bidule bidule1 = new Bidule("BIDUL","Bidule 1");
		// Aiiii (????)
		conteneurElemEnBout.add((ELEM_EN_BOUT) bidule1);

		System.out.println(conteneurElemEnBout);		
		
		Element elem = bidule1;
		EnBouteille enBout = (EnBouteille) bidule1;
	}

	public static void demoConteneurEnBouteille4() {
		ConteneurElementEnBouteilleV1 conteneurElmeEnBout = new ConteneurElementEnBouteilleV1();
		conteneurElmeEnBout.add(new TrucEnFlacon("TRUCFL1", "TRuc flacon 1"));
		conteneurElmeEnBout.add(new BiduleEnBouteille("BIDBOU2", "Bidul en bout 2"));
		// N'est pas une Element en bouteille
		conteneurElmeEnBout.add(new Bidule("BIDUL","Bidule 1"));
		// N'est même pas un élément
		conteneurElmeEnBout.add(44);
		
		// Pb : seul ancêtre commun à Element et EnBouteille : Object d'où possibilité d'ajouter des Oject
		
		System.out.println(conteneurElmeEnBout);		
	}

	public static void demoConteneurEnBouteille3() {
		// Utilisation d'une classe spécifique : on ne profite pas de l'héritage du conteneur générique	
		// On a paramétré la méthode add de ConteneurElementEnBouteilleV2 avec  <TYPE_ELEMENT extends Element & EnBouteille>
		ConteneurElementEnBouteilleV2 conteneurElmeEnBout = new ConteneurElementEnBouteilleV2();
		conteneurElmeEnBout.add(new TrucEnFlacon("TRUCFL1", "TRuc flacon 1"));
		conteneurElmeEnBout.add(new BiduleEnBouteille("BIDBOU2", "Bidul en bout 2"));
		// N'est pas une Element en bouteille
		//conteneurElmeEnBout.add(new Bidule("BIDUL","Bidule 1"));		
		//conteneurElmeEnBout.add(44);
		System.out.println(conteneurElmeEnBout);		
	}

	public static void main(String[] args) {
//		demoConteneurElement();
//		System.out.println("-----------------------------------------------------------");
//		demoConteneurTruc();
//		System.out.println("-----------------------------------------------------------");
//		demoConteneurMachin();
//		System.out.println("-----------------------------------------------------------");
//		demoConteneurEnBouteille();
//		System.out.println("-----------------------------------------------------------");
//		demoConteneurEnBouteille2();
		demoConteneurEnBouteille4();
	}
	
	
}

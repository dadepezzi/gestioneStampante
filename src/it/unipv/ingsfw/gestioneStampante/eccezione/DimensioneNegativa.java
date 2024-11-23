package it.unipv.ingsfw.gestioneStampante.eccezione;

public class DimensioneNegativa extends Exception {

	public DimensioneNegativa() {
		super("Dimensione inserita negativa!");
	}

}

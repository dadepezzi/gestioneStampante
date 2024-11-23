package it.unipv.ingsfw.gestioneStampante.forma;

import it.unipv.ingsfw.gestioneStampante.colore.Colore;

public abstract class Forma implements Measurable {
	private Colore colore;

	public Forma(Colore colore) {
		this.colore = colore;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}
	
	public abstract String identita();
	
}

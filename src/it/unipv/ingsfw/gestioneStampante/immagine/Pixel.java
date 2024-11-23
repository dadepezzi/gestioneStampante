package it.unipv.ingsfw.gestioneStampante.immagine;

import it.unipv.ingsfw.gestioneStampante.colore.Colore;

public class Pixel {
	Colore colore;
	
	public Pixel(Colore colore) {
		this.colore = colore;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}
	
	
}

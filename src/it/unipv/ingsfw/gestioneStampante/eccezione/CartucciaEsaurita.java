package it.unipv.ingsfw.gestioneStampante.eccezione;

import it.unipv.ingsfw.gestioneStampante.colore.Colour;


public class CartucciaEsaurita extends Exception {
	private Colour cartucciaEsaurita;
	
	public CartucciaEsaurita(Colour colore){ //prende in ingresso colore di cartuccia
		super("Cartuccia esaurita!");
		
		switch (colore) {
		case ROSSO:
			cartucciaEsaurita = Colour.ROSSO;
			break;
		case VERDE:
			cartucciaEsaurita = Colour.VERDE;
			break;
		case BLU:
			cartucciaEsaurita =  Colour.BLU;
			break;
		default:
			break;
		}
	}
	
	public Colour getCartucciaEsaurita() {
		return cartucciaEsaurita;
	}
	
}

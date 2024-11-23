package it.unipv.ingsfw.gestioneStampante.stampante;

import it.unipv.ingsfw.gestioneStampante.colore.Colour;
import it.unipv.ingsfw.gestioneStampante.colore.Colour;
import it.unipv.ingsfw.gestioneStampante.eccezione.CartucciaEsaurita;

public class Cartuccia {
	private Colour colore;
	private double livello, livelloResiduo;
	
	public Cartuccia(Colour colore, double livello) { 
		this.colore = colore;
		this.livello = livello;
		livelloResiduo = livello;
	}
	
	public Cartuccia(Colour colore) { 
		this.colore = colore;
		livello = 100;
		livelloResiduo = 100;
	}

	public Colour getColore() {
		return colore;
	}

	public void setColore(Colour colore) {
		this.colore = colore;
	}

	public void consumaCartuccia(double consumo) throws CartucciaEsaurita { //lancio eccezione se finisco colore
		if(livelloResiduo <= consumo) {
			throw new CartucciaEsaurita(colore);
		}else
			livelloResiduo -= consumo;
	}
	
	public double percentualeCartuccia() {
		double percentuale; 
		
		percentuale = livelloResiduo / livello * 100;
		return percentuale;
	}
	
}

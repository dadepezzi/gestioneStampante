package it.unipv.ingsfw.gestioneStampante.forma;

import it.unipv.ingsfw.gestioneStampante.colore.Colore;
import it.unipv.ingsfw.gestioneStampante.eccezione.DimensioneNegativa;

public class Quadrato extends Forma {
	
	private double lato;

	public Quadrato(Colore rgb, double lato) throws DimensioneNegativa {
		super(rgb);
		if(lato >= 0)
			this.lato = lato;
		else
			throw new DimensioneNegativa();
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public double calcolaPerimetro() {
		return 4*lato;
	}

	@Override
	public double calcolaArea() {
		return lato*lato;
	}

	@Override
	public String identita() {
		return "quadrato";
	}
	
	
}

package it.unipv.ingsfw.gestioneStampante.forma;

import it.unipv.ingsfw.gestioneStampante.colore.Colore;
import it.unipv.ingsfw.gestioneStampante.eccezione.DimensioneNegativa;

public class Cerchio extends Forma {

	private double raggio;
	
	public Cerchio(Colore colore,double raggio) throws DimensioneNegativa {
		super(colore);
		if(raggio >= 0)
			this.raggio = raggio;
		else
			throw new DimensioneNegativa();
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		
		this.raggio = raggio;
	}

	@Override
	public double calcolaPerimetro() {
		return 2*Math.PI*raggio;
	}

	@Override
	public double calcolaArea() {
		return Math.PI * raggio*raggio;
	}

	@Override
	public String identita() {
		return "cerchio";
	}

	 
}

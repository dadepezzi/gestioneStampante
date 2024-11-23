package it.unipv.ingsfw.gestioneStampante.forma;

import it.unipv.ingsfw.gestioneStampante.colore.Colore;
import it.unipv.ingsfw.gestioneStampante.eccezione.DimensioneNegativa;

public class Rettangolo extends Forma {
	double base, altezza;

	public Rettangolo(Colore rgb, double base, double altezza) throws DimensioneNegativa {
		super(rgb);
		if(base >= 0 && altezza >= 0) {
			this.base = base;
			this.altezza = altezza;
		}
		else
			throw new DimensioneNegativa();

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return 2*(base+altezza);
	}

	@Override
	public double calcolaArea() {
		return base*altezza;
	}

	@Override
	public String identita() {
		return "rettangolo";
	}
	
	
}

package forma;

import colore.Colore;

public class Quadrato extends Forma {
	
	private double lato;

	public Quadrato(Colore rgb, double lato) {
		super(rgb);
		this.lato = lato;
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
	
	
}

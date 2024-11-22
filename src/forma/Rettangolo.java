package forma;

import colore.Colore;

public class Rettangolo extends Forma {
	double base, altezza;

	public Rettangolo(Colore rgb, double base, double altezza) {
		super(rgb);
		this.base = base;
		this.altezza = altezza;
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

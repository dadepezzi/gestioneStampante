package stampante;

import colore.Colore;

public class Cartuccia {
	private Colore colore;
	private double areaTotale, areaResidua;
	
	public Cartuccia(Colore colore, double areaTotale) {
		this.colore = colore;
		this.areaTotale = areaTotale;
		areaResidua = areaTotale;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public void consumaCartuccia(double consumo) { //lancio eccezione se finisco colore
		areaResidua -= consumo;
	}
	
	public double percentualeCartuccia() {
		double percentuale; 
		
		percentuale = areaResidua / areaTotale * 100;
		return percentuale;
	}
	
}

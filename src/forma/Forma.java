package forma;

import colore.Colore;

public abstract class Forma implements Measurable {
	private colore.Colore colore;

	public Forma(Colore colore) {
		this.colore = colore;
	}

	public colore.Colore getColore() {
		return colore;
	}

	public void setColore(colore.Colore colore) {
		this.colore = colore;
	}
	
	public abstract String identita();
}

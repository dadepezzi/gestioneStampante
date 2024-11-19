package immagine;

import colore.Colore;

public abstract class Immagine {
	protected double[] areaColore; //0R, 1G, 2B
	
	
	public Immagine() {
	    areaColore = new double[3];
	    for (int i = 0; i < 3; i++) {
	        areaColore[i] = 0;
	    }
	}
	
	public double getArea(Colore colore) {
		if((colore.getRed() == 255) && (colore.getGreen() == 0) && (colore.getBlue() == 0))
			return areaColore[0];
		else if((colore.getRed() == 0) && (colore.getGreen() == 255) && (colore.getBlue() == 0))
			return areaColore[1];
		else if((colore.getRed() == 0) && (colore.getGreen() == 0) && (colore.getBlue() == 255))
			return areaColore[2];
		return 0;
	}
	
	public abstract void areaColoreConsumata();

}

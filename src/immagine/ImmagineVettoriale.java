package immagine;
import colore.Colore;
import forma.Forma;

public class ImmagineVettoriale extends Immagine {
	
	private Forma[] arrayForme;
	private int numForme, maxForme;
	
	
	public ImmagineVettoriale() {
		super();
		maxForme = 100;
		numForme = 0;
		arrayForme = new Forma[maxForme];
	}
	
	public void aggiungiForma(Forma forma) {
		arrayForme[numForme] = forma;
		numForme ++;
	}
	
	@Override
	public void areaColoreConsumata() {
		
		for(int i=0; i<numForme; i++) {
			
			double areaForma = arrayForme[i].calcolaArea();
			Colore coloreForma = arrayForme[i].getColore();
			
			double percRed = ((double)coloreForma.getRed()) /255; 
			double percGreen = ((double)coloreForma.getGreen()) /255;
			double percBlue = ((double)coloreForma.getBlue()) /255;
			
			areaColore[0] += percRed * areaForma;
			areaColore[1] += percGreen * areaForma;
			areaColore[2] += percBlue * areaForma;
		}
		
			
	}
	
	
}

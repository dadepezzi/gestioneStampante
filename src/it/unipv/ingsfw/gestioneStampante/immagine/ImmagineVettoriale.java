package it.unipv.ingsfw.gestioneStampante.immagine;
import it.unipv.ingsfw.gestioneStampante.colore.Colore;
import it.unipv.ingsfw.gestioneStampante.colore.Colour;
import it.unipv.ingsfw.gestioneStampante.forma.Forma;

public class ImmagineVettoriale implements Printable {
	
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
	public double getConsumoByColore(Colour e) {
		double area=0;
		
		for(int i=0; i<numForme; i++) {
			
			double areaForma = arrayForme[i].calcolaArea();
			Colore coloreForma = arrayForme[i].getColore();
			
			switch(e) {
			
			case ROSSO:
				area += areaForma*((double)coloreForma.getRed() / 255);
				break;
			case VERDE:
				area += areaForma*((double)coloreForma.getGreen() / 255);
				break;
			case BLU:
				area += areaForma*((double)coloreForma.getBlue() / 255);
				break;
			default:
				break;
			}
		}
		
		return area;	
	}

	@Override
	public void stampa() {
		
		for(int i=0; i<numForme; i++) {
			System.out.println("sto stampando un "+arrayForme[i].identita());
		}
		
	}
	
	
}

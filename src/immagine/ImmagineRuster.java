package immagine;

import colore.Colore;
import colore.Colour;

public class ImmagineRuster implements Printable{
	
	private Pixel[][] matPixel;
	private int altezza, larghezza;
	private int countRiga, countColonna;
	
	public ImmagineRuster(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		matPixel = new Pixel[altezza][larghezza];
		countRiga = 0;
		countColonna = 0;
		
	}
	
	public boolean aggiungiPixel(Pixel p) {
		
		if(countColonna == larghezza) {
			//controllo se ho raggiunto la fine della riga
			countColonna = 0;
			countRiga ++;
			
			if(countRiga == altezza) {
				//esaurito la matrice
				return false;
			}
		}

		matPixel[countRiga][countColonna] = p;
		countColonna ++;
		
		return true;
	}


	@Override
	public double getConsumoByColore(Colour e) {
		double area=0;
		
		for(int i=0; i<altezza; i++) 
			for(int j=0; j<larghezza; j++) {
				
				Colore colorePixel = matPixel[i][j].getColore();
				
				switch(e) {
				case ROSSO:
					area += (double)colorePixel.getRed() / 255;
					break;
				case VERDE:
					area += (double)colorePixel.getGreen() / 255;
					break;
				case BLU:
					area += (double)colorePixel.getBlue() / 255;
					break;
				default:
					break;
			
				}		
			}
			
		return area;
	}

	@Override
	public void stampa() {
		for(int i=0; i<altezza; i++) 
			for(int j=0; j<larghezza; j++) {
				
				System.out.println("stampo pixel in posizione ("+i+","+j+") di colore RGB("+matPixel[i][j].getColore().getRed()+","+matPixel[i][j].getColore().getGreen()+","+matPixel[i][j].getColore().getBlue()+")");
			
			}
	}
	
}

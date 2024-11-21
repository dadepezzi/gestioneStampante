package immagine;

import colore.Colore;

public class ImmagineRuster extends Printable{
	
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
		
		if(countRiga == larghezza) {
			//controllo se ho raggiunto la fine della riga
			countColonna ++;
			countRiga = 0;
			
			if(countColonna == altezza) {
				//esaurito la matrice
				return false;
			}
		}

		matPixel[countRiga][countColonna] = p;
		countRiga ++;
		
		return true;
	}

	@Override
	public void areaColoreConsumata() {
		//HP: area di un pixel = 1
			
		for(int i=0; i<altezza; i++) {
			for(int j=0; j<larghezza; j++) {
				
				Colore colorePixel = matPixel[i][j].getColore();
				
				double percRed = ((double)colorePixel.getRed()) /255; 
				double percGreen = ((double)colorePixel.getGreen()) /255;
				double percBlue = ((double)colorePixel.getBlue()) /255;
				
				areaColore[0] += percRed;
				areaColore[1] += percGreen;
				areaColore[2] += percBlue;
				
			}
		
		}
		
	}
	
}

package stampante;
import colore.Colore;
import immagine.*;

public class Stampante {
	
	private Cartuccia[] arrayDiCartucce; 
	private int currentCartuccia;
	private final Colore ROSSO = new Colore(255,0,0);
	private final Colore VERDE = new Colore(0,255,0);
	private final Colore BLU = new Colore(0,0,255);
	
	public Stampante() {
		arrayDiCartucce = new Cartuccia[3];
		currentCartuccia = 0;
	}
	
	public void aggiungiCartuccia(Cartuccia c) {
		
		if(currentCartuccia < 3) {
			arrayDiCartucce[currentCartuccia] = c;
			currentCartuccia ++;
		}
	}
	
	public void checkCartucce() {
		System.out.println("cartuccia rossa: %"+arrayDiCartucce[0].percentualeCartuccia()+"\ncartuccia verde: %"+arrayDiCartucce[1].percentualeCartuccia()+"\ncartuccia blu: %"+arrayDiCartucce[2].percentualeCartuccia());

	}
	
	public void stampa(Immagine img) {
		img.areaColoreConsumata();
		arrayDiCartucce[0].consumaCartuccia(img.getArea(ROSSO));
		arrayDiCartucce[1].consumaCartuccia(img.getArea(VERDE));
		arrayDiCartucce[2].consumaCartuccia(img.getArea(BLU));
		
	}
	
	public boolean sostituisciCartuccia(Cartuccia c) {
		for(int i=0; i<3; i++)
			if(arrayDiCartucce[i].getColore().equals(c.getColore())){
				arrayDiCartucce[i] = c;
				return true;
			}
		System.out.println("Cartuccia non valida!");
		return false;
	}
}

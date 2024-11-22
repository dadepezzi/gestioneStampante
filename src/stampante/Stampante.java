package stampante;
import java.util.HashMap;
import java.util.Map;

//caio-
import colore.Colore;
import colore.Colour;
import immagine.*;

public class Stampante {
	//ciao
	//ciao 3
	
	private Map<Colour, Cartuccia> mappaCartucce = new HashMap<>();
	private Cartuccia[] arrayDiCartucce; 
	private int currentCartuccia;
	private final Colore ROSSO = new Colore(255,0,0);
	private final Colore VERDE = new Colore(0,255,0);
	private final Colore BLU = new Colore(0,0,255);
	
	public Stampante() {
		arrayDiCartucce = new Cartuccia[3];
		currentCartuccia = 0;
	}
	
	public void aggiungiCartuccia(Colour e, Cartuccia c) {
		
		if(mappaCartucce.size() < 3) {
			mappaCartucce.put(e, c);
		}
	}
	
	public void checkCartucce() { //prende in ingresso un colore della cartuccia da controllare
		System.out.println("cartuccia rossa: %"+mappaCartucce.get(Colour.ROSSO).percentualeCartuccia()+"\ncartuccia verde: %"+mappaCartucce.get(Colour.VERDE).percentualeCartuccia()+"\ncartuccia blu: %"+mappaCartucce.get(Colour.BLU).percentualeCartuccia());

	}
	
	public void stampa(Printable img) { //CAMBIA
		//chiede ad immagine quanto consuma per ogni colore
		//per ogni colore vado da cartuccia e dico consumati
		//la cartuccia prova a consumarsi (in cartuccia, se finisce colore lancia eccezione)
		//qui ho try catch che se cartuccia aveva fatto eccezione chiamo cambia cartuccia
		
		//se non ho eccezione allora faccio printable.stampa()
		
		
//		img.areaColoreConsumata();
//		arrayDiCartucce[0].consumaCartuccia(img.getArea(ROSSO));
//		arrayDiCartucce[1].consumaCartuccia(img.getArea(VERDE)); //non va bene INCAPSULAMENTO
//		arrayDiCartucce[2].consumaCartuccia(img.getArea(BLU));
		
	}
	
	public void sostituisciCartuccia(Colour e, Cartuccia c) {
		mappaCartucce.put(e,c);
	}
}

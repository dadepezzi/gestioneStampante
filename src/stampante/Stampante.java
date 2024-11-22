package stampante;
import java.util.HashMap;
import java.util.Map;

import colore.Colore;
import colore.Colour;
import eccezione.CartucciaEsaurita;
import immagine.*;

public class Stampante {
	
	private Map<Colour, Cartuccia> mappaCartucce = new HashMap<>();
//	private final Colore ROSSO = new Colore(255,0,0);
//	private final Colore VERDE = new Colore(0,255,0);
//	private final Colore BLU = new Colore(0,0,255);
//	
	public Stampante() {
		
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
		
		double consumoRosso = img.getConsumoByColore(Colour.ROSSO);
		double consumoVerde = img.getConsumoByColore(Colour.VERDE);
		double consumoBlu = img.getConsumoByColore(Colour.BLU);
		
		try {
			mappaCartucce.get(Colour.ROSSO).consumaCartuccia(consumoRosso);
			mappaCartucce.get(Colour.VERDE).consumaCartuccia(consumoVerde);
			mappaCartucce.get(Colour.BLU).consumaCartuccia(consumoBlu);
		} catch(CartucciaEsaurita e) { //eccezione: cartucciaEsaurita
			//chiamo metodo sostituisci cartuccia
			//chi ha lanciato l'eccezione??
	
		}
		img.stampa();
	}
	
	public void sostituisciCartuccia(Colour e, Cartuccia c) {
		mappaCartucce.put(e,c);
	}
}

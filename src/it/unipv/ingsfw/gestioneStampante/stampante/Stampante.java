package it.unipv.ingsfw.gestioneStampante.stampante;
import java.util.HashMap;
import java.util.Map;

import it.unipv.ingsfw.gestioneStampante.colore.Colore;
import it.unipv.ingsfw.gestioneStampante.colore.Colour;
import it.unipv.ingsfw.gestioneStampante.eccezione.CartucciaEsaurita;
import it.unipv.ingsfw.gestioneStampante.immagine.*;

public class Stampante {
	
	private Map<Colour, Cartuccia> mappaCartucce = new HashMap<>();
	
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
		boolean out = true;
		double consumoRosso = img.getConsumoByColore(Colour.ROSSO);
		double consumoVerde = img.getConsumoByColore(Colour.VERDE);
		double consumoBlu = img.getConsumoByColore(Colour.BLU);
		
		try {
			mappaCartucce.get(Colour.ROSSO).consumaCartuccia(consumoRosso);
			mappaCartucce.get(Colour.VERDE).consumaCartuccia(consumoVerde);
			mappaCartucce.get(Colour.BLU).consumaCartuccia(consumoBlu);
		} catch(CartucciaEsaurita e) { //eccezione: cartucciaEsaurita
			
			switch(e.getCartucciaEsaurita()) {
			case ROSSO:
				sostituisciCartuccia(new Cartuccia(Colour.ROSSO));
				System.out.println("sostituita cartuccia rossa...");
				out = false;
				break;
			case VERDE:
				sostituisciCartuccia(new Cartuccia(Colour.VERDE));
				System.out.println("sostituita cartuccia verde...");
				out = false;
				break;
			case BLU:
				sostituisciCartuccia(new Cartuccia(Colour.BLU));
				System.out.println("sostituita cartuccia blu...");
				out = false;
				break;
			default:
				break;
			}
		}
		
		if(out) 
			img.stampa();
		else
			System.out.println("Stampa non andata a buon fine! ");
	}
	
	private void sostituisciCartuccia(Cartuccia c) {
		mappaCartucce.put(c.getColore(),c);
	}
}

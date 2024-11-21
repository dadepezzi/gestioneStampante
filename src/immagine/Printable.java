package immagine;

import colore.Colour;

public interface Printable {
	
	public double getConsumoByColore(Colour e); //restituisco quanto colore togliere
	
	public void stampa(); //
}

package immagine;

import colore.Colour;

public interface Printable {
	
	public double getConsumoByColore(Colour e); //restituisco quanto colore togliere
	
	public void stampa(); //dice come l'immagine si stampa (quante frome ho, quanti rettangoli, qunata area, quanto colore..)
	
}

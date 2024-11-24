package it.unipv.ingsfw.gestioneStampante.stampante;
import it.unipv.ingsfw.gestioneStampante.colore.*;
import it.unipv.ingsfw.gestioneStampante.eccezione.DimensioneNegativa;
import it.unipv.ingsfw.gestioneStampante.forma.*;
import it.unipv.ingsfw.gestioneStampante.immagine.*;
public class Esecuzione {
	public static void main(String[] args) throws DimensioneNegativa{
		
		Stampante s = new Stampante();
		Cartuccia car1 = new Cartuccia(Colour.ROSSO,100);
		Cartuccia car2 = new Cartuccia(Colour.VERDE,100);
		Cartuccia car3 = new Cartuccia(Colour.BLU,100);
		
		s.aggiungiCartuccia(Colour.ROSSO,car1);
		s.aggiungiCartuccia(Colour.VERDE,car2);
		s.aggiungiCartuccia(Colour.BLU,car3);
		
		
		
		Colore c1 = new Colore(200,100,0); //rosso
		Colore c2 = new Colore(10,255,0);
		Colore c3 = new Colore(0,0,255); 
	
		Forma f1 = new Rettangolo(c1, 10, 8);
		Forma f2 = new Quadrato(c2, 5);
		
		ImmagineVettoriale img = new ImmagineVettoriale(); 
		
		
		img.aggiungiForma(f1);
		img.aggiungiForma(f2);
		
		s.stampa(img);
		
		s.checkCartucce();
		
//		s.stampa(img);
//		
//		s.checkCartucce();
//		
//		s.stampa(img);
//		
//		s.checkCartucce();
//		
//		s.stampa(img);
//		
//		s.checkCartucce();
//
//		s.stampa(img);
//		
//		s.checkCartucce();
//		
		
		
		ImmagineRuster imgrust = new ImmagineRuster(2, 2);
		Pixel p1 = new Pixel(c1);
		Pixel p2 = new Pixel(c2);
		Pixel p3 = new Pixel(c3);
		Pixel p4 = new Pixel(c1);
		
		imgrust.aggiungiPixel(p1);
		imgrust.aggiungiPixel(p2);
		imgrust.aggiungiPixel(p3);
		imgrust.aggiungiPixel(p4);
		
		imgrust.stampa();
		
	}
}

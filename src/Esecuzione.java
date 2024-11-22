import immagine.*;
import stampante.Cartuccia;
import stampante.Stampante;
import forma.*;
import colore.*;
public class Esecuzione {
	public static void main(String[] args) {
		
		Stampante s = new Stampante();
		Colore rosso = new Colore(0,255,0);
		Colore verde = new Colore(0,255,0);
		Colore blu = new Colore(0,0,255);
//		Colore viola = new Colore(255,0,255);
		Cartuccia car1 = new Cartuccia(rosso,100);
		Cartuccia car2 = new Cartuccia(verde,100);
		Cartuccia car3 = new Cartuccia(blu,100);
		
		s.aggiungiCartuccia(Colour.ROSSO,car1);
		s.aggiungiCartuccia(Colour.VERDE,car2);
		s.aggiungiCartuccia(Colour.BLU,car3);
		
		
		
		Colore c1 = new Colore(200,100,0); //rosso
		Colore c2 = new Colore(10,255,0);
		Colore c3 = new Colore(0,0,255); 
		Forma f1 = new Rettangolo(c1, 2, 3);
		Forma f2 = new Quadrato(c2, 5);
		Printable img = new ImmagineVettoriale();
		
		
		((ImmagineVettoriale)img).aggiungiForma(f1);
		((ImmagineVettoriale)img).aggiungiForma(f2);
		
		s.stampa(img);
		
		
		
		
		
		Printable imgrust = new ImmagineRuster(2, 1);
		Pixel p1 = new Pixel(c1);
		Pixel p2 = new Pixel(c2);
		Pixel p3 = new Pixel(c3);
		//Pixel p4 = new Pixel(c1);
		
		((ImmagineRuster)imgrust).aggiungiPixel(p1);
		((ImmagineRuster)imgrust).aggiungiPixel(p2);
		//((ImmagineRuster)imgrust).aggiungiPixel(p3);
		//((ImmagineRuster)imgrust).aggiungiPixel(p4);
		
		imgrust.stampa();
		
	}
}

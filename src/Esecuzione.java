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
		Colore viola = new Colore(255,0,255);
		Cartuccia car1 = new Cartuccia(rosso,100);
		Cartuccia car2 = new Cartuccia(verde,100);
		Cartuccia car3 = new Cartuccia(blu,100);
		
		s.aggiungiCartuccia(car1);
		s.aggiungiCartuccia(car2);
		s.aggiungiCartuccia(car3);
		
		
		
		Colore c1 = new Colore(255,0,0); //rosso
		Forma f1 = new Rettangolo(c1, 2, 3);
		Forma f2 = new Quadrato(c1, 5);
		Immagine img = new ImmagineVettoriale();
//		
		((ImmagineVettoriale)img).aggiungiForma(f1);
		((ImmagineVettoriale)img).aggiungiForma(f2);
//		img.areaColoreConsumata();
//		
//		
		Colore c2 = new Colore(0,0,255); //blu
		Colore c3 = new Colore(78,128,255);
		Pixel p1 = new Pixel(c1);
		Pixel p2 = new Pixel(c2);
		
		Pixel p3 = new Pixel(c3);
		Pixel p4 = new Pixel(c1);
		
		Immagine img1 = new ImmagineRuster(2,2);
		Immagine img2 = new ImmagineRuster(2,2);
		System.out.println(((ImmagineRuster)img1).aggiungiPixel(p1));
		System.out.println(((ImmagineRuster)img1).aggiungiPixel(p2));
		System.out.println(((ImmagineRuster)img1).aggiungiPixel(p2));
		System.out.println(((ImmagineRuster)img1).aggiungiPixel(p2)); 
		System.out.println(((ImmagineRuster)img1).aggiungiPixel(p4)); // pixel di troppo
		
		System.out.println(((ImmagineRuster)img2).aggiungiPixel(p3));
		System.out.println(((ImmagineRuster)img2).aggiungiPixel(p2));
		System.out.println(((ImmagineRuster)img2).aggiungiPixel(p3));
		System.out.println(((ImmagineRuster)img2).aggiungiPixel(p3));
//		img1.areaColoreConsumata();
//		
		System.out.println("-----------------------------------------------");
//		img2.areaColoreConsumata();
		
		s.stampa(img1);
		
		s.checkCartucce();
		
		System.out.println("------");
		Cartuccia car4 = new Cartuccia(blu,100);
		s.sostituisciCartuccia(car4);
		
		s.checkCartucce();
		
		System.out.println("------");
		
		s.stampa(img1);
		
		s.checkCartucce();
		
		System.out.println("------");
		
		s.stampa(img);
		
		s.checkCartucce();
	}
}

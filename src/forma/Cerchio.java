package forma;

public class Cerchio extends Forma {

	private double raggio;
	
	public Cerchio(colore.Colore colore,double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcolaPerimetro() {
		return 2*Math.PI*raggio;
	}

	@Override
	public double calcolaArea() {
		return Math.PI * raggio*raggio;
	}

	@Override
	public String identita() {
		return "cerchio";
	}

	 
}

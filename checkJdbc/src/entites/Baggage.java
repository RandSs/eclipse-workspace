package entites;

public class Baggage {

	
	private int id;
	
	private String numero;
	
	
	public Baggage() {
		
	}

public Baggage(String num) {
	setNumero(num);

	}

public int getId() {
	return id;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}




}

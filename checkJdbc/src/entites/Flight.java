package entites;

public class Flight {
	private int id;
	private String numero;
	private String destination;

	
	
	public Flight()
	{
		
		
	}
	
	public Flight(String num, String des) {
		
		setNumero(num);
		setDestination(des);
		
	}


	public String toString() {
		return "id : " + id + ", numero : " + numero + ", destination : " + destination ;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int idf) {
		this.id = idf;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	

}

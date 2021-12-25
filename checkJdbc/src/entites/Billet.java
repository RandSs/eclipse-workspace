package entites;

public class Billet {

	private int id;
	
	private String numero;
	
	
	public Billet() {
		
	}

public Billet(String num) {
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

	public String toString() {
		return "Billet [id=" + id + ", numero=" + numero + "]";
	}
	
	
	
	
	
	
}

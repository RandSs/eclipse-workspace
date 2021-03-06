package entites;

public class Passenger {
	
	private int id;
	private String nom;
	private String prenom;
	private String numBillet;
	private int baggage;
	private String seat;
	private Boolean checked;
	
	
	public int getBaggage() {
		return baggage;
	}



	public void setBaggage(int baggage) {
		this.baggage = baggage;
	}



	public String getSeat() {
		return seat;
	}



	public void setSeat(String seat) {
		this.seat = seat;
	}



	public Boolean getChecked() {
		return checked;
	}



	public void setChecked(Boolean checked) {
		this.checked = checked;
	}



	public Passenger() {
		
		
		
	}
	
	
	
public Passenger(String n, String p, String num) {
	setNom(n);
	setPrenom( p);
	setNumBillet(num);
		
	}
	
	



	@Override
public String toString() {
	return " nom=" + nom + ", prenom=" + prenom + ", numBillet= " + numBillet + ", baggage= "
			+ baggage + ", seat= "  + seat + ", checked= " + checked ;
}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumBillet() {
		return numBillet;
	}
	public void setNumBillet(String numBillet) {
		this.numBillet = numBillet;
	}
	
	
	
	

}

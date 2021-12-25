package checkInOop;

public class Passager {
	
	private String nom;
	private String prenom;
	private String billet;
	private String seat;
	private String status;
	private String baggage;
	
	
	
	public Passager(){
		
	}
	
	
    public	Passager(String newNom, String newPrenom, String newBillet, String newSeat, String newStatus, String newBaggage){
		
		 this.setNom(newNom);
		 this.setPrenom(newPrenom);
		 this.setBillet(newBillet);
		 this.setSeat(newSeat);
		 this.setStatus(newStatus);
		 this.setBaggage(newBaggage);
	}
   
   public String toString() {
	   
	   return "Nom : " + nom + " Prenom : " + prenom + " N° de billet : " + billet + "  Seat : "  +  seat +
			   " Status : "  + status + " Baggage : " + baggage;
   }
 
 
 
    public String getNom() {
    	
    	return this.nom;
    }
	
    public void setNom(String newNom) {
    	
    	this.nom=newNom;
    	
    }

  public String getPrenom() {
    	
    	return this.prenom;
    }
	
    public void setPrenom(String newPrenom) {
    	
    	this.prenom=newPrenom ; 
    	
    }
    
  public String getBillet() {
    	
    	return this.billet;
    }
	
    public void setBillet(String newBillet) {
    	
    	 this.billet=newBillet;
    	
    }
    public String getSeat() {
      	
      	return this.seat;
      }
  	
      public void setSeat(String newSeat) {
      	
    	  this.seat=	newSeat ;
      	
      }
      public String getBaggage() {
        	
        	return this.baggage;
        }
        public void setBaggage(String newBaggage) {
        	
        	  this.baggage=	newBaggage;
        	
        }
       public String getStatus() {
        	
        	return this.status;
        }
    	
        public void setStatus(String newStatus) {
        	
        	 this.status=	newStatus;
        	
        }
    	
    	

	

}

package checkInOop;

import java.sql.Date;
import java.sql.Time;

public class Flight {
	
	private String number;
	private String destination;
	private String date;
	private String deppart;
	private String arriver;
	
	
	public Flight() {
		
		
	}


	public Flight(String newNumber, String newDestination, String newDate, String newDeppart, String newArriver) {
		
		this.setNumber(newNumber);
		this.setDestination(newDestination);
		this.setDate(newDate);
		this.setDeppart(newDeppart);
		this.setArriver(newArriver);
		
		
	}
	

	public String getNumber() {
		return this.number;
		
	}
	
	public void setNumber(String newNumber) {
		this.number = newNumber;
		
	}
	
	
	public String getDestination() {
		return this.destination;
		
	}
	
	public void setDestination(String newNumber) {
		this.destination = newNumber;
		
	}
	
	
	
	
	public String getDate() {
		return this.date;
		
	}
	
	public void setDate(String newDate) {
		this.date = newDate;
		
	}
	
	

	public String getDeppart() {
		return this.deppart;
		
	}
	
	public void setDeppart(String newDeppart) {
		this.deppart = newDeppart;
		
	}
	
	public String getArriver() {
		return this.arriver;
		
	}
	
	public void setArriver(String newArriver) {
		this.arriver = newArriver;
		
	}


	public String toString() {
		return "Flight [number=" + number + ", destination=" + destination + ", date=" + date + ", deppart=" + deppart
				+ ", arriver=" + arriver + "]";
	}
	
	
}

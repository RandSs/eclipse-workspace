package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entites.Database;
import entites.Flight;

public class FlightDAO {

	public void save(Flight obj) {
		
		try {
			if(obj.getId() !=0) {
				
				PreparedStatement ps = Database.connexion.prepareStatement("UPDATE flight set numero=?,destination=?");
			
			    ps.setString(1, obj.getNumero());
			    
			    ps.setString(1, obj.getDestination());
			    ps.executeUpdate();
			    
			}else {
				
				PreparedStatement ps = Database.connexion.prepareStatement("INSERT INTO flight(numero,destination )VALUES (?,?)");
				ps.setString(1, obj.getNumero());
				ps.setString(2, obj.getDestination());
				
			    ps.executeUpdate();
				
			}
			
			System.out.println("SAVED OK");
			
			
		}catch(Exception ex) {
			
			
			ex.printStackTrace();
			
			System.out.print("problèm de sauvegarde!!");
		}

		
	}
	
	
	public Flight getById(int id) {
		try {
			   PreparedStatement ps = Database.connexion.prepareStatement("SELECT * FROM flight where id =?");
			   ps.setInt(1,id);
			   
			   
			   ResultSet resultat = ps.executeQuery();
			   
			   resultat.next();
			   
			  
			   
			   Flight flight = new Flight();
			   
			   flight.setId(resultat.getInt(id));
			   flight.setNumero(resultat.getString("numero"));
			   flight.setDestination(resultat.getString("destination"));
			   
			return flight;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
			
		}
		
		
	}
	public ArrayList<Flight> getAll() {
		ArrayList<Flight> col = new ArrayList<Flight>();
		
		try {
			PreparedStatement ps = Database.connexion.prepareStatement("SELECT * FROM flight"); 
			ResultSet resultat = ps.executeQuery();
			
			while(resultat.next()) {
				
				Flight flight = new Flight();
				flight.setId(resultat.getInt("id"));
				flight.setNumero(resultat.getString("numero"));
				flight.setDestination(resultat.getString("destination"));
				
				col.add(flight);
			}
			
			return col;
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
			
			System.out.print("problèm de .....");
			return null;
		}
	
		
	}
	
	
	public void deleteById(int id) {
		try {
			
			PreparedStatement ps = Database.connexion.prepareStatement("DELETE FROM flight WHERE id =? ");
			ps.setInt(1, id);
			ps.executeUpdate();
			
			System.out.println("votre flight est supprimer !!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
			System.out.println("votre enregistrement n'est pas supprimer !!");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

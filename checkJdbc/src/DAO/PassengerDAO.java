package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entites.Database;
import entites.Passenger;

public class PassengerDAO {

	public void save(Passenger obj) {
		
		try {
			if(obj.getId() !=0) {
				
				PreparedStatement ps = Database.connexion.prepareStatement(
						"UPDATE passengers set nom=?,prenom=?,"
					   +" baggage=?, seat =?, checked=? WHERE numBillet=?");
			
			    ps.setString(1, obj.getNom());
			    ps.setString(2, obj.getPrenom());
			    
			    ps.setInt(3, obj.getBaggage());
			    ps.setString(4, obj.getSeat());
			    ps.setBoolean(5, obj.getChecked());
			    
			    ps.setString(6, obj.getNumBillet());
			    
			    
			    ps.executeUpdate();
			    
			}else {
				
				PreparedStatement ps = Database.connexion.prepareStatement("INSERT INTO passengers(nom,prenom,numBillet,baggage, seat,checked )VALUES (?,?,?,?,?,?)");
				ps.setString(1, obj.getNom());
				ps.setString(2, obj.getPrenom());
				ps.setString(3, obj.getNumBillet());

			    ps.setInt(4, obj.getBaggage());
			    ps.setString(5, obj.getSeat());
			    ps.setBoolean(6, obj.getChecked());
				
			    ps.executeUpdate();
				
			}
			
			System.out.println("SAVED OK");
			
			
		}catch(Exception ex) {
			
			
			ex.printStackTrace();
			
			System.out.print("problèm de sauvegarde!!");
		}

		
	}
	
	
	public Passenger getById(String nb) {
		try {
			   PreparedStatement ps = Database.connexion.prepareStatement("SELECT * FROM passengers where numBillet =?");
			   ps.setString(1,nb);
			   
			   
			   ResultSet resultat = ps.executeQuery();
			   
			   resultat.next();
			   
			  
			   
			Passenger pax = new Passenger();
			   
			pax.setId(resultat.getInt("id"));
			pax.setNom(resultat.getString("nom"));
			pax.setPrenom(resultat.getString("prenom"));
			pax.setNumBillet(resultat.getString("numBillet"));
		    pax.setBaggage( resultat.getInt("baggage"));
		    pax.setSeat(resultat.getString("seat"));
		    pax.setChecked( resultat.getBoolean("checked"));
			   
			return pax;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
			
		}
		
		
	}
	
	
	public ArrayList<Passenger> getAll() {
		ArrayList<Passenger> col = new ArrayList<Passenger>();
		
		try {
			PreparedStatement ps = Database.connexion.prepareStatement("SELECT * FROM passengers"); 
			ResultSet resultat = ps.executeQuery();
			
			while(resultat.next()) {
				
				Passenger pax = new Passenger();
				pax.setId(resultat.getInt("id"));
				pax.setNom(resultat.getString("nom"));
				pax.setPrenom(resultat.getString("prenom"));
				pax.setNumBillet(resultat.getString("numBillet"));
		    	pax.setBaggage( resultat.getInt("baggage"));
			    pax.setSeat(resultat.getString("seat"));
			    pax.setChecked( resultat.getBoolean("checked"));
				
				
				
				
				col.add(pax);
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
			
			PreparedStatement ps = Database.connexion.prepareStatement("DELETE FROM passengers WHERE id =? ");
			ps.setInt(1, id);
			ps.executeUpdate();
			
			System.out.println("votre flight est supprimer !!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
			System.out.println("votre enregistrement n'est pas supprimer !!");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

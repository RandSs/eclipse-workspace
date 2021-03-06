package jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/trad";
		String user = "root";
		String mdp = "";
		Connection connexion = null;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("---------menu---------");
		System.out.println("1-------afficher---------");
		System.out.println("2-------ajouter---------");
		System.out.println("3-------supprimer---------");
		
		System.out.println("Merci de choisir :");
	
		int menu = clavier.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connexion = (Connection) DriverManager.getConnection(url,user,mdp);
			
			switch(menu) {
			case 1:
			java.sql.Statement statement = connexion.createStatement();
			
			ResultSet resultat = statement.executeQuery("SELECT * FROM client");
			System.out.println("bonjour, voila la liste des clients : ");
			while(resultat.next()) {
				
				int id = resultat.getInt("id_client");
				
				String nom = resultat.getString("nom_client");
				String adresse = resultat.getString("adresse");
			
				System.out.println("\tid  :" + id+ "\t nom : " +nom +"\t adresse : " + adresse );
				
			    }	
				
				break;
				
				case 2 :
				
					
					System.out.println("Donner le nom :");
					System.out.println();
					String nom = clavier.nextLine();
					System.out.println("Donner le prenom :");
					String prenomm= clavier.nextLine();
					System.out.println("Donner le prenom :");
					String prenom = clavier.nextLine();
					System.out.println("Donner le adresse :");
					String adresse  = clavier.nextLine();
					System.out.println("Donner le code postal :");
					String code  = clavier.nextLine();
					System.out.println("Donner le email : ");
					String email = clavier.nextLine();
					System.out.println("Donner le tel : ");
					String tel = clavier.nextLine();
					System.out.println("Donner le mdp :");
					String mdpasse = clavier.nextLine();
					System.out.println("Donner l'id :");
					System.out.println();
					int id = clavier.nextInt();
			
					
					
					
					PreparedStatement preparedStatement  = (PreparedStatement) connexion.prepareStatement("INSERT INTO client"
						 	+ "   (nom_client,prenom_client,adresse,code_postal, client_email,tel, mdp_client,id_role)"
							+ "   VALUES(?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			
					preparedStatement.setString(1, nom);
					preparedStatement.setString(2, prenom);
					preparedStatement.setString(3, adresse);
					preparedStatement.setString(4, code);
					preparedStatement.setString(5, email);
					preparedStatement.setString(6, tel);
					preparedStatement.setString(7, mdpasse);
					preparedStatement.setInt(8, id);
					
					
					preparedStatement.executeUpdate();
					
					   ResultSet resu = preparedStatement.getGeneratedKeys();
					   resu.next();
					
					System.out.println("votre insertion est terminer  votre id est : " + resu.getInt(1));
					
			     break;
			     
				case 3:

					System.out.println("Donner l'id :");
					System.out.println();
					 id = clavier.nextInt();
					 
					
					 preparedStatement  = (PreparedStatement) connexion.prepareStatement("DELETE FROM  client WHERE id_client =?");
					 
					 preparedStatement.setInt(1, id);
					 preparedStatement.executeUpdate();
					 
					 System.out.println("Supprimer ");
					
					
			    break;
					
					
				
				
			
			}
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
		
		
		
		
		
	}

}

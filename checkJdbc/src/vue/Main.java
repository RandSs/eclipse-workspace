package vue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

import DAO.FlightDAO;
import entites.Database;
import entites.Flight;


public class Main {
	
	

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		   Database.connect();
		  // FlightDAO flightDao = new FlightDAO();
		   
		   Functions.starts(clavier);
		   
		   Functions.menu(clavier); 
		   
		   
		   
		   
	}

}

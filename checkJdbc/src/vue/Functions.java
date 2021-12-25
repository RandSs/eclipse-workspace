package vue;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import DAO.FlightDAO;
import DAO.PassengerDAO;
import entites.Database;
import entites.Flight;
import entites.Passenger;

public class Functions {
	
	
	public static void starts(Scanner clavier) {
		
		int codeList[] = {111, 222, 333, 444, 555};	
		String nameList[] = {"faicel","thierry","mohammed", "yacine","robin"}; 
		int start=0;
		
		
		while(start !=1  ) {
		System.out.println("pour commancer une session d'enregistrement tapper 1: ");
	       start = clavier.nextInt(); 
		}	

		int code=0;
		 int codeOk=0;
		String name="";
		String message="";
		do{
			System.out.println("Merci d'entrer Votre code: " );
			
			 code = clavier.nextInt();		
			
			 for(int i =0; i< codeList.length; i++) {
				 if(code == codeList[i]) {
				   name= nameList[i];
				   codeOk = code;
				 }
		         }
				 } while (code != codeOk);
		
		System.out.println("Binvenue " + name);
		System.out.println();
		}

	
	public static void menu(Scanner clavier) {
		
		System.out.println();
		System.out.println("------------Menu------------------");
		System.out.println();
		System.out.println();
		System.out.println("1----------pour-----flight"); 
		System.out.println("2----------pour-----enregitrement"); 
		System.out.println("3----------pour-----Baggage"); 
		System.out.println("4----------pour-----Seats");
		System.out.println("5----------pour-----Class");
		System.out.println("6----------pour-----Boarding"); 
		
		int menu =0;
		System.out.println();
		System.out.println();
		System.out.println();
		while(menu <1 || menu > 6)	{
		
		System.out.println("choisisser un chiffre de 1 à 6 pour y accèder :");
		System.out.println();
		System.out.println("tapper 0 pour sortir : ");

	    menu = clavier.nextInt();
		}
	
		switch(menu) {
	
		case 1:
			System.out.println("------------Our flight list-------------");
			
			System.out.println();
			Database.connect();
			FlightDAO flightDao = new FlightDAO();
			
			   ArrayList<Flight> fly = flightDao.getAll(); 
			   
			   for(Flight val:fly) {
				   
				   System.out.println(val);
			   }
			int retourner =0;
			while(retourner <1 || retourner > 2)	{
			
			System.out.println();
			System.out.println("Pour choisir un autre vole tapper 1 ");
			System.out.println();
			System.out.println("Pour retourner au menu principale tapper 2");
			System.out.println();
		      retourner = clavier.nextInt();

			if(retourner == 1) {
				   for(Flight val:fly) {
					   
					   System.out.println(val);
				   }
			   
			
			}else if(retourner == 2) { 
				menu(clavier);
				
			}
			}
			break;
	
		    case 2:    
		    	enregitrement( clavier);
			

			break;
			
		}
	
	}
	
          public static void enregitrement(Scanner clavier) {
        	  
        	 // FlightDAO flightDao = new FlightDAO();
	          Flight fly = new Flight();
	          
		PassengerDAO passDao= new PassengerDAO(); 
		Passenger ps = new Passenger();
	System.out.println("chercher un passager par son N° de billet");
	System.out.println();
	 String nbBillet= "";
	 int flightNb=0;
	while(nbBillet == "") {
	System.out.println("Merci de tapper le N° de billet : ");
	System.out.println();
	
	nbBillet = clavier.nextLine(); 
	
	}  
	
	
     ps= passDao.getById(nbBillet); 
    System.out.println( passDao.getById(nbBillet)); 

	 if(ps.getNumBillet().equals(nbBillet)) {
		 
	System.out.println();
	System.out.println();
    System.out.println("Voulez vous enregistrer le passager ? : " );
	System.out.println();
	System.out.println("tapper 1 pour oui : ");
	System.out.println();
	System.out.println("tapper 0 pour Non : ");
		
	int check = clavier.nextInt(); 
	
	if(check == 1){
		
		System.out.println("Vous ete sure de vouloir enregistrer le passager :  " + ps.getNom());
		System.out.println("tapper 1 pour oui : ");
		System.out.println("tapper 0 pour Non : ");
			int enregistrer = clavier.nextInt();
			String checked ="";
			String seat ="";
			if(enregistrer == 1 ) {

			do{
					
					System.out.println("merci de lui attribuer un siège : ");
					seat =  clavier.nextLine();
				}	while (seat.equals("") ) ;
				
			    ps.setNom(ps.getNom());
			    ps.setPrenom(ps.getPrenom());
			    ps.setNumBillet(ps.getNumBillet());
				ps.setBaggage(4);
			    ps.setSeat(seat);
			    ps.setChecked(true);
			    ps.setId(ps.getId());
			    
				passDao.save( ps);
								
			    checked = "enregistrer !";
				System.out.println();
				System.out.println("Votre passager est :  " + checked);
				System.out.println();
				System.out.println("tapper les dernier chiffre du vol pour imprimer le boarding pass: ");
				System.out.println();
				
			    flightNb  = clavier.nextInt();
			    
					printBoardingPass(clavier,ps.getNom() , ps.getPrenom(), ps.getSeat(), fly.getDestination(), flightNb);
				
			}else {
				
				System.out.println("passenger inconnu ?!"); 
			  }
        	 }	
	
	
	
	    if(flightNb != 0) {
		
		System.out.println();
		System.out.println("Vous avais un baggage à enregistrer pour N° :  " + nbBillet);
		System.out.println("tapper 1 pour Oui : ");
		System.out.println("tapper 0 pour Non : ");
		
		int  addBag = clavier.nextInt();

		if(addBag !=0 ){
			System.out.println("entrer le poids du baggage : ");
			int poids = clavier.nextInt();
			
			addBaggage(clavier, ps.getNom() , ps.getPrenom(), ps.getBaggage(),poids,flightNb);

		}else {
			System.out.print("Pas de baggage à enregtstrer");
			System.out.println();
			System.out.println();
			
		}
		
		System.out.print("tapper 1 pour retourner au menu principal :");
		System.out.println();
		System.out.println();
		System.out.print("tapper 2 pour enregitrer un autre passager :");
		
		int retour = clavier.nextInt();
		
		if(retour ==1) {
			menu( clavier);
		}else {
			enregitrement(clavier);
			
		    }

		    }
	
	        }

	  }
  

public static void printBoardingPass(Scanner clavier, String nom, String prenom, String seat,String destination,int flightNb) {
	 
	    Database.connect();
	    FlightDAO flightDao = new FlightDAO();
	
	   ArrayList<Flight> fly = flightDao.getAll(); 
	
	    switch(flightNb){	    	
	    	case 290:
	    		String flightnb = "afpa290";
	    		   for(int i =0; i < fly.size(); i++) {
	    			   if (flightnb.equals(fly.get(i).getNumero())) {
	    			   
	    	          String flight  = fly.get(i).getNumero();
	    			
	    			destination = fly.get(i).getDestination();
	    			
	    		   }

	    		   }
	    	
	    		   
	    		boardingPass( nom,  prenom, seat, destination, flightNb);
	    		break;
	
	        	case 300:
	    	   flightnb = "afpa300";
	    		   for(int i =0; i < fly.size(); i++) {
	    			   if (flightnb.equals(fly.get(i).getNumero())) {
	    			   
	    	          String flight  = fly.get(i).getNumero();
	    			
	    			destination = fly.get(i).getDestination();
	    			
	    		   }

	    		   }
	    	
	    		   
	    		boardingPass( nom,  prenom, seat, destination, flightNb);
	    		break;
	      	case 400:

	    	 flightnb = "afpa400";

	    		   for(int i =0; i < fly.size(); i++) {
	    			   if (flightnb.equals(fly.get(i).getNumero())) {
	    			   
	    	          String flight  = fly.get(i).getNumero();
	    			
	    			destination = fly.get(i).getDestination();
	    			
	    		   }

	    		   }
	    		boardingPass( nom,  prenom, seat, destination, flightNb);
	    		break;
	    		
	      	case 500:
	    		flightnb = "afpa500";

	    		   for(int i =0; i < fly.size(); i++) {
	    			   if (flightnb.equals(fly.get(i).getNumero())) {
	    			   
	    	          String flight  = fly.get(i).getNumero();
	    			
	    			destination = fly.get(i).getDestination();
	    			
	    		   }

	    		   }
	    		   
	    		boardingPass( nom,  prenom, seat, destination, flightNb);
	    		break;
	    	
	    }
	    }

public static void boardingPass(String nom, String prenom, String seat,  String destination,int flightNb) {
	
	System.out.println("<<<<<<<<<<<<<<<<<<<BOARDING PASS>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println();
	System.out.print("flight N°:=======================afap"+flightNb+"=====================");
	System.out.println();
	System.out.println();
	System.out.println("Nom et Prenom :===================="+nom.toUpperCase()+" " +prenom.toUpperCase()+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Destination :======================="+destination+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Siège :======================="+seat+"=====================");

	
}

public static void addBaggage(Scanner clavier, String nom, String prenom, int bag,int poids,int flightNb) {

	   
	         Database.connect();
	    FlightDAO flightDao = new FlightDAO();
      ArrayList<Flight> fly = flightDao.getAll(); 
	
	    String date = "";
	    String destination ="";
	    String depart="";
	    String arriver ="";

	    
	    Random bagN = new Random();
	    int random = bagN.nextInt(100000000);
	    
	    switch(flightNb){
    	
    	case 290:
    		String flightnb = "afpa290";
    		   
 		   for(int i =0; i < fly.size(); i++) {
 			   if (flightnb.equals(fly.get(i).getNumero())) {
 			   
 	          String flight  = fly.get(i).getNumero();
 			
 			  destination = fly.get(i).getDestination();
 			
 		   }

 		   }

    		printBag(nom, prenom, random, destination,poids, flightNb);
    		break;
    		
    	case 300:
    		
    		
    		flightnb = "afpa300";
 		   
  		   for(int i =0; i < fly.size(); i++) {
  			   if (flightnb.equals(fly.get(i).getNumero())) {
  			   
  	          String flight  = fly.get(i).getNumero();
  			
  			  destination = fly.get(i).getDestination();
  			
  		   }

  		   }
    
    		printBag(nom, prenom, random, destination,poids, flightNb);
    		break;
    		
    		
         	case 400:
         		
         		flightnb = "afpa400";
     		   
      		   for(int i =0; i < fly.size(); i++) {
      			   if (flightnb.equals(fly.get(i).getNumero())) {
      			   
      	          String flight  = fly.get(i).getNumero();
      			
      			  destination = fly.get(i).getDestination();
      			
      		   }

      		   }
    	
    		printBag(nom, prenom, random, destination,poids, flightNb);
    		break;
  
    	   case 500:
    		   
    		   flightnb = "afpa500";
    		   
     		   for(int i =0; i < fly.size(); i++) {
     			   if (flightnb.equals(fly.get(i).getNumero())) {
     			   
     	          String flight  = fly.get(i).getNumero();
     			
     			  destination = fly.get(i).getDestination();
     			
     		   }

     		   }
    	
    		printBag(nom, prenom, random, destination,poids, flightNb);
    		break;   		
    		
    }

}

public static void printBag(String nom, String prenom,int random, String destination,int poids,int flightNb) {
	System.out.println("<<<<<<<<<<<<<<<<<<<<<Baggage>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println();
	System.out.print("bag N° :======================="+random+"=====================");
	System.out.println();
	System.out.println();
	System.out.println("Nom et prenom :===================="+nom.toUpperCase()+" " +prenom.toUpperCase()+"=====================");
	System.out.println();
	System.out.print("Flight N° :========================afap"+flightNb+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Destination :======================="+destination+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Poids:======================="+poids+" K=====================");
	System.out.println();
	System.out.println();
	
	
	
}






	
}

	
	



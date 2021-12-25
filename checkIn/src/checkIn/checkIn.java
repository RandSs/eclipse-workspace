package checkIn;


import java.nio.charset.Charset;

import java.util.*;  
import java.util.Random;

public class checkIn {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		
		
		starts(clavier);
		
		menu(clavier);
	
		
		
		clavier.close();

	}
	
	
	
	
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
		
	//*Display the menu 
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
			
			afficherFlight(clavier);
		
			int retourner =0;
			while(retourner <1 || retourner > 2)	{
			
			System.out.println();
			System.out.println("Pour choisir un autre vole tapper 1 ");
			System.out.println();
			System.out.println("Pour retourner au menu principale tapper 2");
			System.out.println();
			
		      retourner = clavier.nextInt();

			if(retourner == 1) {
				afficherFlight(clavier);
				afficherFlight(clavier);
			}else if(retourner == 2) { 
				menu(clavier);
				
			}
			}
		
			break;
		case 2:
			enregitrement(clavier);
			break;
		case 3:
			System.out.println("baggage");
			break;
		case 4:
			System.out.println("Seats");
			break;
		case 5:
			System.out.println("Class");
			break;
		case 6:
			System.out.println("Boarding");
			break;
			
		case 0:
			System.out.println("Bye Bye ");
			System.out.println("Pour recommencer merci de raffrichir la page svp : ");
		    break;
		}	
}	

	
	
	
	//afficher les vols 
	public static void afficherFlight(Scanner clavier) {
		
  ArrayList<String> flight = new ArrayList<>();
  ArrayList<String> details290 = new ArrayList<>();
  ArrayList<String> details300 = new ArrayList<>();
  ArrayList<String> details400 = new ArrayList<>();
  ArrayList<String> details32 = new ArrayList<>();
  ArrayList<String> details10 = new ArrayList<>();
  
    flight.add("afpa290");		
    flight.add("afpa300");	
    flight.add("afap400");	
    flight.add("afpa32");	
    flight.add("afpa10");
    
    
    details290.add("2021-12-15");		
    details290.add("Rome");	
    details290.add("07:05");	
    details290.add("08:30");	
    
    details300.add("2021-12-15");		
    details300.add("Madrid");	
    details300.add("09:00");	
    details300.add("10:05");
    
    
    details400.add("2021-12-15");		
    details400.add("New york");	
    details400.add("10:00");	
    details400.add("16:55");	
    
    details32.add("2021-12-15");		
    details32.add("Nice");	
    details32.add("13:00");	
    details32.add("13:35");	
    
    
    
    details10.add("2021-12-15");		
    details10.add("Alger");	
    details10.add("16:00");	
    details10.add("18:35");	
    
    
	
	System.out.println("              ()    " );
	System.out.println("             (()) " );
	System.out.println("            ((())) " );
	System.out.println("           ((()))))  " );
	System.out.println("          (((())))))  " );
	System.out.println("          (((())))))  " );
	System.out.println("          (((())))))  " );
	System.out.println("          (((())))))  " );
	System.out.println("           ((()))))  " );
	System.out.println("           ((()))))  " );
	System.out.println("           ((()))))  " );
	System.out.println("           ((()))))  " );
	System.out.println("  (((((((((((())))))))))))))  " );
	System.out.println("(((((((((((((())))))))))))))))  " );
	System.out.println("  (((((((((((())))))))))))))  " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("            (()))) " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("            (())))  " );
	System.out.println("        (((((())))))) " );
	System.out.println("       ((((((()))))))) " );
	System.out.println("    (((((((((()))))))))))) " );
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();

    
    
    for (String val:flight) {
 
    	System.out.println((flight.indexOf(val)+1)+"------------"+val+"-----------");

    }
    
    
    int flightNbr=0;
	System.out.println();
	System.out.println();
	
	do {
	System.out.println("choisisser un vole : ");
	 flightNbr= clavier.nextInt();
	}while(flightNbr < 1 || flightNbr >5 );
	
	String date ="", destination="", depart="", arriver="";
	
	

	switch(flightNbr) {
	case 1:
		
		for(int i=0; i< details290.size() ; i++) {
     date= details290.get(0);
    destination = details290.get(1);
    depart= details290.get(2);
   arriver = details290.get(3);
			
		}
	System.out.println("Date : " + date);
	System.out.println("Destination : " + destination);
	System.out.println("Depart : " + depart);	
	System.out.println("arriver: " + arriver);
		break;
		
	case 2:
		
		for(int i=0; i< details300.size() ; i++) {
     date= details300.get(0);
    destination = details300.get(1);
    depart= details300.get(2);
   arriver = details300.get(3);
			
		}
	System.out.println("Date : " + date);
	System.out.println("Destination : " + destination);
	System.out.println("Depart : " + depart);	
	System.out.println("arriver: " + arriver);
		break;
		
	case 3:
		
		for(int i=0; i< details400.size() ; i++) {
     date= details400.get(0);
    destination = details400.get(1);
    depart= details400.get(2);
   arriver = details400.get(3);
			
		}
	System.out.println("Date : " + date);
	System.out.println("Destination : " + destination);
	System.out.println("Depart : " + depart);	
	System.out.println("arriver: " + arriver);
		break;
		
	case 4:
		
		for(int i=0; i< details32.size() ; i++) {
     date= details32.get(0);
    destination = details32.get(1);
    depart= details32.get(2);
   arriver = details32.get(3);
			
		}
	System.out.println("Date : " + date);
	System.out.println("Destination : " + destination);
	System.out.println("Depart : " + depart);	
	System.out.println("arriver: " + arriver);
		break;
     case 5:
		
		for(int i=0; i< details10.size() ; i++) {
     date= details10.get(0);
    destination = details10.get(1);
    depart= details10.get(2);
   arriver = details10.get(3);
			
		}
	System.out.println("Date : " + date);
	System.out.println("Destination : " + destination);
	System.out.println("Depart : " + depart);	
	System.out.println("arriver: " + arriver);
		break;
	}
	}

	
	
	
	

public static void enregitrement(Scanner clavier) {
	
	String paxListafpa290[][] = {{"0011a","niddle","tom","1A", "0", "unchecked"},{"0022a","spencer","mark","1B","1","unchecked"},
			{"0033a","fodel","tim","5c","1", "unchecked"}};
	
   int paxBags[][] = {{0011, 0},{0022,2},
			{0033, 1}};

   String nbBillet= "";
	System.out.println("chercher un passager par son N° de billet");
	System.out.println();
	while(nbBillet == "") {
	System.out.println("Merci de tapper le N° de billet : ");
	System.out.println();
	
	nbBillet = clavier.nextLine(); 

	}
	
	System.out.println();
	
	System.out.println("N° billet      Nom       Prenom         Seat         Baggage       Statut" );
	System.out.println();
	for(int i = 0 ; i<paxListafpa290.length; i++){
			if(nbBillet.toLowerCase().equals(paxListafpa290[i][0]) ) {
				for(String val :paxListafpa290[i]) {
					System.out.print(val+ "         ");
				}
			
		}
		
	}
	
	System.out.println();
	System.out.println();
System.out.println("Voulez vous enregistrer le passager ? : ");
System.out.println();
System.out.println("tapper O pour oui : ");
System.out.println();
System.out.println("tapper N pour Non : ");
	
	String check = clavier.next(); 

	
	if(check.equals("o")){
		
		System.out.println("Vous ete sure de vouloir enregistrer le passager N° :  " + nbBillet);
		System.out.println("tapper O pour oui : ");
		System.out.println("tapper N pour Non : ");
			
			String enregitrer = clavier.next();
			String checked ="";
			
			
			if(enregitrer.equals("o")) {
				for(int i = 0 ; i<paxListafpa290.length; i++){
						if(nbBillet.toLowerCase().equals(paxListafpa290[i][0]) ) {
							if(paxListafpa290[i][5].equals("unchecked")) {
								paxListafpa290[i][5]= "checked";
								checked =paxListafpa290[i][5];
								
						
						}
					}
				}
				System.out.println();
				System.out.println("Votre passager est :  " + checked);
				System.out.println();
				System.out.println("tapper les dernier chiffre du vol pour imprimer le boarding pass: ");
				System.out.println();
				
			int flightNb = clavier.nextInt();
			String nom="";
			String prenom= "";
			String seat="";
			String bag="";
				if(flightNb != 0) {
				for(int i = 0; i< paxListafpa290.length; i++) {
				for(String val:paxListafpa290[i]) {
					if(nbBillet.toLowerCase().equals(paxListafpa290[i][0]) ) {
				}	
				}
				nom = paxListafpa290[i][1];
				prenom = paxListafpa290[i][2];
				seat=paxListafpa290[i][3];
				bag=paxListafpa290[i][4];
				}
				printBoardingPass(clavier,nom,prenom ,seat,  flightNb);
				System.out.println();
				System.out.println("Vous avais un baggage à enregistrer pour N° :  " + nbBillet);
				System.out.println("tapper O pour Oui : ");
				System.out.println("tapper N pour Non : ");
				
				String addBag = clavier.next();
		
				
				
				if(addBag.equals("o") ){
					System.out.println("entrer le poids du baggage : ");
					int poids = clavier.nextInt();
					
					addBaggage(clavier, nom,  prenom, bag,poids,flightNb);

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

		
	}else if(check.equals("n")){
		System.out.print("Non");
	}else {
		System.out.print("Merci de prendre un autre passager .");
	}
}
	
	


public static void printBoardingPass(Scanner clavier, String nom, String prenom, String seat,int flightNb) {
	  ArrayList<String>   flight = new ArrayList<>();
	  ArrayList<String> details290 = new ArrayList<>();
	  ArrayList<String> details300 = new ArrayList<>();
	  ArrayList<String> details400 = new ArrayList<>();
	  ArrayList<String> details32 = new ArrayList<>();
	  ArrayList<String> details10 = new ArrayList<>();
	  
	    flight.add("afpa290");		
	    flight.add("afpa300");	
	    flight.add("afap400");	
	    flight.add("afpa32");	
	    flight.add("afpa10");
	    
	    
	    details290.add("2021-12-15");		
	    details290.add("Rome");	
	    details290.add("07:05");	
	    details290.add("08:30");	
	    
	    details300.add("2021-12-15");		
	    details300.add("Madrid");	
	    details300.add("09:00");	
	    details300.add("10:05");
	    
	    
	    details400.add("2021-12-15");		
	    details400.add("New york");	
	    details400.add("10:00");	
	    details400.add("16:55");	
	    
	    details32.add("2021-12-15");		
	    details32.add("Nice");	
	    details32.add("13:00");	
	    details32.add("13:35");	
	    
	    
	    
	    details10.add("2021-12-15");		
	    details10.add("Alger");	
	    details10.add("16:00");	
	    details10.add("18:35");	
	    
	    
	    String date = "";
	    String destination ="";
	    String depart="";
	    String arriver ="";
	     
	    switch(flightNb){
	    	
	    	case 290:
	    		for(int i=0; i<  details290.size();i++) {
	    			date= details290.get(0);
	    			destination =details290.get(1);
	    			depart=details290.get(2);
	    			arriver = details290.get(3);
	    		}
	    	
	    		boardingPass( nom,  prenom, date, seat,depart , arriver, destination, flightNb);
	    		break;
	    	case 300:
	    		for(int i=0; i<  details300.size();i++) {
	    			date= details300.get(0);
	    			destination =details300.get(1);
	    			depart=details300.get(2);
	    			arriver = details300.get(3);
	    		}
	    	
	    		boardingPass( nom,  prenom, date, seat,depart , arriver, destination, flightNb);
	    		break;
	      	case 400:
	    		for(int i=0; i<  details400.size();i++) {
	    			date= details400.get(0);
	    			destination =details400.get(1);
	    			depart=details400.get(2);
	    			arriver = details400.get(3);
	    		}
	    	
	    		boardingPass( nom,  prenom, date, seat,depart , arriver, destination, flightNb);
	    		break;
	    		
	      	case 32:
	    		for(int i=0; i<  details32.size();i++) {
	    			date= details32.get(0);
	    			destination =details32.get(1);
	    			depart=details32.get(2);
	    			arriver = details32.get(3);
	    		}
	    	
	    		boardingPass( nom,  prenom, date, seat,depart , arriver, destination, flightNb);
	    		break;
	    		
	    	case 10:
	    		for(int i=0; i<  details10.size();i++) {
	    			date= details10.get(0);
	    			destination =details10.get(1);
	    			depart=details10.get(2);
	    			arriver = details10.get(3);
	    		}
	    	
	    		boardingPass( nom,  prenom, date, seat,depart , arriver, destination, flightNb);
	    		break;
	    		
	    	
	    			
	    			
	    }
	    
	    
	
	
}
	
public static void addBaggage(Scanner clavier, String nom, String prenom, String bag,int poids,int flightNb) {
	
	  ArrayList<String>   flight = new ArrayList<>();
	  ArrayList<String> details290 = new ArrayList<>();
	  ArrayList<String> details300 = new ArrayList<>();
	  ArrayList<String> details400 = new ArrayList<>();
	  ArrayList<String> details32 = new ArrayList<>();
	  ArrayList<String> details10 = new ArrayList<>();
	  
	    flight.add("afpa290");		
	    flight.add("afpa300");	
	    flight.add("afap400");	
	    flight.add("afpa32");	
	    flight.add("afpa10");
	    
	    
	    details290.add("2021-12-15");		
	    details290.add("Rome");	
	    details290.add("07:05");	
	    details290.add("08:30");	
	    
	    details300.add("2021-12-15");		
	    details300.add("Madrid");	
	    details300.add("09:00");	
	    details300.add("10:05");
	    
	    
	    details400.add("2021-12-15");		
	    details400.add("New york");	
	    details400.add("10:00");	
	    details400.add("16:55");	
	    
	    details32.add("2021-12-15");		
	    details32.add("Nice");	
	    details32.add("13:00");	
	    details32.add("13:35");	
	    
	    
	    
	    details10.add("2021-12-15");		
	    details10.add("Alger");	
	    details10.add("16:00");	
	    details10.add("18:35");	
	    
	    
	    String date = "";
	    String destination ="";
	    String depart="";
	    String arriver ="";
	  
	    
	    int addBag = Integer.parseInt(bag);
	    
	    Random bagN = new Random();
	    int random = bagN.nextInt(100000000);
	   
	    
	
	    
	   
	    
	    switch(flightNb){
    	
    	case 290:
    		for(int i=0; i<  details290.size();i++) {
    			date= details290.get(0);
    			destination =details290.get(1);
    			
    		}
    
    		printBag(nom, prenom, date, random, destination,poids, flightNb);
    		break;
    		
    	case 300:
    		for(int i=0; i<  details300.size();i++) {
    			date= details300.get(0);
    			destination =details300.get(1);
    			
    		}
    
    		printBag(nom, prenom, date, random, destination,poids, flightNb);
    		break;
    		
    		
    	case 400:
    		for(int i=0; i<  details400.size();i++) {
    			date= details400.get(0);
    			destination =details400.get(1);
    			
    		}
    
    		printBag(nom, prenom, date, random, destination,poids, flightNb);
    		break;
    		
    		
    	case 32:
    		for(int i=0; i<  details32.size();i++) {
    			date= details32.get(0);
    			destination =details32.get(1);
    			
    		}
    
    		printBag(nom, prenom, date, random, destination,poids, flightNb);
    		break;
    		
    		
    	case 10:
    		for(int i=0; i<  details10.size();i++) {
    			date= details10.get(0);
    			destination =details10.get(1);
    			
    		}
    
    		printBag(nom, prenom, date, random, destination,poids, flightNb);
    		break;
    		
    		
    		
    		
    }
    
	    
	    

	
}











public static void boardingPass(String nom, String prenom,String date, String seat,String depart , String arriver, String destination,int flightNb) {
	
	System.out.println("<<<<<<<<<<<<<<<<<<<BOARDING PASS>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println();
	System.out.print("flight N°:=======================afap"+flightNb+"=====================");
	System.out.println();
	System.out.println();
	System.out.println("Nom et Prenom :===================="+nom.toUpperCase()+" " +prenom.toUpperCase()+"=====================");
	System.out.println();
	System.out.print("Date :========================"+date+"===================");
	System.out.println();
	System.out.println();
	System.out.print("Destination :======================="+destination+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Siège :======================="+seat+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Heur de dép :======================="+depart+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Heur d'arriver :======================="+arriver+"=====================");
	System.out.println();
	System.out.println();
	
}




public static void printBag(String nom, String prenom,String date,int random, String destination,int poids,int flightNb) {
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
	System.out.print("Date :========================"+date+"===================");
	System.out.println();
	System.out.println();
	System.out.print("Destination :======================="+destination.substring(0,3).toUpperCase()+"=====================");
	System.out.println();
	System.out.println();
	System.out.print("Poids:======================="+poids+" K=====================");
	System.out.println();
	System.out.println();
	
	
	
}



public static void checkPax() {
	  
	  
	  
	  
	ArrayList<PaxList> paxList= new ArrayList<PaxList>();
	
	PaxList pax1 = new PaxList("0011a","niddle","tom","1A",0, "no"); 
	PaxList pax2 = new PaxList("0022a","spencer","mark","1B",0,"yes"); 
	PaxList pax3 = new PaxList("0033a","zidan","zizou","1C",0,"no"); 
	PaxList pax4 = new PaxList("0044a","mahrez","riadh","2a",0,"uu");
	
	
	
	paxList.add(pax1);
	paxList.add(pax2);
	paxList.add(pax3);
	paxList.add(pax4);
	  
	  
  Iterator<PaxList> itr = paxList.iterator();
	
	
		
		PaxList i = itr.next();
		
		if(((PaxList) i).getChecked() != "yes") {
			
			while(itr.hasNext()) {
			
			PaxList pax = (PaxList)itr.next();
			
			itr.remove();
		 
		System.out.println(pax.billet +" " + pax.name +" "+ pax.firstName+ " "+ pax.seat+ " "+ pax.bag+" "+pax.getChecked());
		
	}
		
		
	}
  }
  
 



  
  
}






class PaxList{
	String billet;
	String name;
	String firstName;
	String seat;
	int bag;
	String checkedIn;

	PaxList(String billet,String name,String firstName,String seat,int bag,String checkedIn ){
		
		this.billet=billet;
		this.name=name;
		this.firstName= firstName;
		this.seat=seat;
		this.bag=bag;
		this.checkedIn=checkedIn;
	}
	
	
	public void remove() {
		// TODO Auto-generated method stub
		
	}


	public String getChecked() {
		
		return checkedIn;
	}
	
public String getBillet() {
		
		return billet;
	}
	
}

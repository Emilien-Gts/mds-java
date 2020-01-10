package fr.mds.travelagencyproject.laucher;

import java.util.Scanner;

import fr.mds.travelagencyproject.model.JdbcPlaceDao;
import fr.mds.travelagencyproject.model.JdbcTripDao;
import fr.mds.travelagencyproject.model.Place;
import fr.mds.travelagencyproject.model.Trip;

public class Launcher {
	public static boolean flag = true;
	public static void main(String[] args) {
		while(flag) {
			System.out.println("What do you want to do ?");
			System.out.println("1 - Add place");
			System.out.println("2 - Find a place");
			System.out.println("3 - Edit a place");
			System.out.println("4 - Remove a trip");
			System.out.println("5 - Add a trip");
			System.out.println("6 - Find a trip");
			System.out.println("7 - Remove a trip");
			System.out.println("8 - Quit");
			
			System.out.print("Choix: ");
			Scanner sc = new Scanner (System.in);
			int choix = sc.nextInt();
			
			JdbcPlaceDao jpd = new JdbcPlaceDao();
			JdbcTripDao  jtd = new JdbcTripDao();
			
			switch (choix) {
			case 1:
				System.out.println("Choice 1 - Add a place");
				
				Scanner sc1 = new Scanner(System.in);
				System.out.print("Tell me the name of the place: ");
				String name = sc1.nextLine();
				
				long id1 = jpd.createPlace(new Place(name));
				
				System.out.println("WE HAD NEW TRIP WITH ID N°"+id1);
				
				break;
			case 2:
				System.out.println("Choice 2 - Find a place");
				
				Scanner sc2 = new Scanner(System.in);
				System.out.print("Tell me ID of Place: ");
				long id2 = sc2.nextInt();
				Place p = jpd.findPlaceById(id2);
				
				System.out.println(p.toString());
				
				break;
			case 3:
				System.out.println("Choice 3 - Edit a place");
				
				Scanner sc3 = new Scanner(System.in);
				System.out.print("Tell me ID of Place: ");
				long id3 = sc3.nextInt();
				
				Scanner sc31 = new Scanner(System.in);
				System.out.println("Tell me new name of this place");
				String name31 = sc31.nextLine();
				
				jpd.updatePlace(new Place(id3, name31));
				System.out.println("UPDATE DONE !");
				
				break;
			case 4:
				System.out.println("Choice 4 - Remove a trip");
				
				Scanner sc4 = new Scanner(System.in);
				System.out.print("Tell me ID of Place: ");
				long id4 = sc4.nextInt();
				
				jpd.removePlace(id4);
				System.out.println("UPDATE DONE !");
				
				break;
			case 5:
				System.out.println("Choice 5 - Add a trip");
				
				Scanner sc5 = new Scanner(System.in);
				System.out.print("Tell me the departure's id of the trip: ");
				long id5 = sc5.nextInt();
				
				Scanner sc51 = new Scanner(System.in);
				System.out.print("Tell me the destination's id of the trip: ");
				long id51 = sc51.nextInt();
				
				Scanner sc52 = new Scanner(System.in);
				System.out.print("Tell me the price of the trip: ");
				double price52 = sc52.nextDouble();
				
				long id52 = jtd.createTrip(new Trip(new Place(id5), new Place(id51), price52));
				
				System.out.println("WE HAD NEW TRIP WITH ID N°"+id52);
				
				break;
			case 6:
				System.out.println("Choice 5 - Find a trip");
				
				Scanner sc6 = new Scanner(System.in);
				System.out.print("Tell me ID of Place: ");
				long id6 = sc6.nextInt();
				Trip t = jtd.findTripById(id6);
				
				System.out.println(t.toString());
				
				break;
			case 7:
				System.out.println("Choice 7 - Remove a trip");
				
				Scanner sc7 = new Scanner(System.in);
				System.out.print("Tell me ID of Place: ");
				long id7 = sc7.nextInt();
				
				jtd.removeTrip(id7);
				System.out.println("UPDATE DONE !");
				
				break;
			case 8:
				System.out.println("Choice 8 - Quit");
				
				flag = false;
				
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}
}

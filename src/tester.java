
import java.text.ParsePosition;
import java.util.Scanner;
import java.util.ArrayList;
import exceptions.BoatOutOfBoundsException;
import exceptions.BoatOverlappingException;
public class tester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		/*Position pos1 = new Position("A", 1);
		System.out.println(pos1.row());
		System.out.println(pos1.column());
		System.out.println(pos1);
		
		System.out.println("enter a letter followed by a number");
		Position pos2 = new Position(scan.nextLine(), scan.nextInt());
		
		System.out.println(pos2.row());
		System.out.println(pos2.column());
		System.out.println(pos2);
		*/
		
		//System.out.println(Character.compare('b', 'a'));
		
		

		


		//MUY IMPORTANTE REENABLE LATER PLEASE
		
		System.out.println("what class would you like to test?\nBoat, Position, Ocean");		input = scan.nextLine();
		//Boat testing
		if(input.equals("Boat")){
			System.out.println("enter boat info:");
			//input type
		System.out.println("input type: Aircraft Carrier, Battleship, Cruiser, Submarine, Destroyer");
		String type = scan.nextLine();
		//input position of boat (starting from top left)
		System.out.println("input a position in letter-number form");
		Position pos = PositionChecker.checkPosition(scan.nextLine());
		//input orientation of boat
		System.out.println("input an orientation: Vertical, Horizontal");
		String orientation = scan.nextLine();
		Boat boat = new Boat(type, pos, orientation);
		
		System.out.println("name: " + boat.name() + "\nabbreviation: " + boat.abbreviation() + "\ndirection:  " + boat.direction() + "\nposition: " + boat.position());



		System.out.println("test onboat by entering pos, enter \"done\" to move on");
		input = scan.nextLine();
		while(!input.equals("done")){
			System.out.println(boat.onBoat(PositionChecker.checkPosition(input)));
			input = scan.nextLine();
		}
		
		System.out.println("test hit by entering pos, enter \"done\" to move on");
		input = scan.nextLine();
		while(!input.equals("done")){
			boat.hit(PositionChecker.checkPosition(input));
			input = scan.nextLine();
		}
		System.out.println("boat health: ");
		System.out.print(boat);
		System.out.println("test isHit by entering pos, enter \"done\" to move on");
		input = scan.nextLine();
		while(!input.equals("done")){
			System.out.println(boat.isHit(PositionChecker.checkPosition(input)));
			input = scan.nextLine();
		}



		} 
		//position testing
		else if(input.equals("Position")){

			System.out.println("input a positinon");
			input = scan.nextLine();
			while(input != "done") {
			System.out.println(PositionChecker.checkPosition(input));
			input = scan.nextLine();
			}
		} 
		//ocean testiing
		else if(input.equals("Ocean")){
			Ocean ocean1 = new Ocean();
			try{
				ocean1.placeBoat("Aircraft Carrier", "Vertical", PositionChecker.checkPosition("a-1"));
			} catch(BoatOutOfBoundsException e){
				System.out.println("Boat out of bounds");
			} catch (BoatOverlappingException e){
				System.out.println("Boat overlapping other boat");
			}
			try{
				ocean1.placeBoat("Aircraft Carrier", "Horizontal", PositionChecker.checkPosition("a-1"));
			} catch(BoatOutOfBoundsException e){
				System.out.println("Boat out of bounds");
			} catch (BoatOverlappingException e){
				System.out.println("Boat overlapping other boat");
			}
			try{
				ocean1.placeBoat("Battleship", "Vertical", PositionChecker.checkPosition("a-9"));
				} catch(BoatOutOfBoundsException e){
				System.out.println("Boat out of bounds");
			} catch (BoatOverlappingException e){
				System.out.println("Boat overlapping other boat");
			}

			
			System.out.println("\n boats on board: \n" + ocean1);
		}
		 
		/*
		System.out.println("done to exit");
		//input type
		System.out.println("input type: Aircraft Carrier, Battleship, Cruiser, Submarine, Destroyer");
		String type = scan.nextLine();
		//input position of boat (starting from top left)
		System.out.println("input a position in letter-number form");
		Position pos = PositionChecker.checkPosition(scan.nextLine());
		//input orientation of boat
		System.out.println("input an orientation: Vertical, Horizontal");
		String orientation = scan.nextLine();
		Boat boat = new Boat(type, pos, orientation);

		System.out.println("now input a position in letter number form to test methods with");
		Position guess = PositionChecker.checkPosition(scan.nextLine());
		System.out.println("onboat: ");
		System.out.println(boat.onBoat(guess));
		System.out.println("test hit");

		//todo test hit methods after fixing positionchecker
		System.out.println(boat);
		 */
		
	}
}

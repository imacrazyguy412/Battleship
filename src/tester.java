
import java.util.Scanner;
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
		/*
		System.out.println("what class would you like to test?");
		String input = scan.nextLine();
		//Boat testing
		if(input.equals("Boat")){
			System.out.println("enter boat info:");
			

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
		 */
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

		
		
	}
}

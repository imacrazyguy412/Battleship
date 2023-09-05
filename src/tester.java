
import java.util.Scanner;
public class tester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
		
		

		System.out.println("what class would you like to test?");
		String input = scan.nextLine();
		if(input.equals("Boat")){
			System.out.println("enter boat info");
		} else if(input.equals("Position")){
			System.out.println("input a positinon");
			while(input != "done") {
			System.out.println(PositionChecker.checkPosition(input));
			input = scan.nextLine();
			}
		}
		
		
		
	}
}

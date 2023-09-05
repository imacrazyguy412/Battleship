import java.util.Arrays;

public class Boat {
	private Position pos;
	private String type;
	private String orientation;
	private int size;
	private boolean[] pieceHealth;
	
	
	public Boat(String type, Position pos, String orientation) {
		this.pos = pos;
		this.type = type;
		this.orientation = orientation;
		
		//set sizes
		if(type.equals("Aircraft Carrier")) {
			size = 5;
		} else if(type.equals("Battleship")) {
			size = 4;
		} else if(type.equals("Cruiser") || type.equals("Submarine")) {
			size = 3;
		} else if(type.equals("Destroyer")) {
			size = 2;
		}
		
		pieceHealth = new boolean[size];
		Arrays.fill(pieceHealth, true);
		
	}
	
	
	public String name() {
		return type;
	}
	
	public String abbreviation() {
		return type.substring(0,1);
	}
	
	public Position position() {
		return pos;
	}
	
	public String direction() {
		return orientation;
	}
	
	public boolean onBoat(Position guess) {
		if(orientation.equals("vertical")) {
			if(guess.rowIndex() == pos.rowIndex() && guess.colIndex() >= pos.colIndex() && guess.colIndex() < pos.colIndex() + size) {
				return true;
			}
		} else if(orientation.equals("horizontal")) {
			if(guess.colIndex() == pos.colIndex() && guess.rowIndex() >= pos.rowIndex() && guess.rowIndex() < pos.rowIndex() + size) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isHit(Position guess) {
		//temp
		if(onBoat(guess)) {
			if(orientation.equals("vertical")) {
				return pieceHealth[guess.rowIndex()-pos.rowIndex()];
			}
			if(orientation.equals("horizontal")) {
				return pieceHealth[guess.colIndex()-pos.colIndex()];
			}
		}
		System.out.println("pos not on boat");
		return false;
	}
	
	public void hit(Position guess) {
		if(onBoat(guess)) {
			if(orientation.equals("vertical")) {
				pieceHealth[guess.rowIndex()-pos.rowIndex()] = false;
			}
			if(orientation.equals("horizontal")) {
				pieceHealth[guess.colIndex()-pos.colIndex()] = false;
			}
		}
	}
	
	public boolean sunk() {
		for(boolean b : pieceHealth) {
			if(b) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
}

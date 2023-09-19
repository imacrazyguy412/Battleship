import java.util.Scanner;
public class Position {
	Scanner scan = new Scanner(System.in);
	
	private int row;
	private char col;
	
	private int rowIndex;
	private int colIndex;
	
	public Position() {
		PositionChecker.checkPosition(scan.nextLine());
	}
	
	public Position(char col, int row) {
		this.row = row;
		this.col = Character.toUpperCase(col);
		
		rowIndex = Character.compare(col, 'a');
		colIndex = col-1;
	}
	
	public Position(int row, int col) {
		this.row = row;
		this.col = Character.toUpperCase((char)(col + 64));
		rowIndex = row-1;
		colIndex = col-1;
	}
	
	public int rowIndex() {
		return rowIndex;
	}
	
	public int colIndex() {
		return colIndex;
	}
	
	public int row() {
		return row;
	}
	
	public char column() {
		return col;
	}
	
	public String toString() {
		if(row == '@') {
			return "Invalid position" + "\nIndexes: " + rowIndex + ", " + colIndex; 
		}
		
		return row + "-" + col + "\nIndexes: " + rowIndex + ", " + colIndex;
	}
}

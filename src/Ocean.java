import exceptions.BoatOutOfBoundsException;
import exceptions.BoatOverlappingException;
import java.util.ArrayList;

public class Ocean {
    private ArrayList<Boat> boats;


    public Ocean(){
        boats = new ArrayList<Boat>();
    }


    public void placeBoat(String boatName, String direction, Position pos) throws BoatOutOfBoundsException, BoatOverlappingException {
        Boat testBoat = new Boat(boatName, pos, direction);

        //check for overlapping boats
        for(Boat b : boats){
            //vertical check
            if(direction.equals("Vertical")){
                for(int i = 0; i<testBoat.size(); i++){
                    if(b.onBoat(new Position(pos.colIndex()+1, pos.rowIndex() + i + 1))){
                    throw(new BoatOverlappingException());
                    }
                }
            }
            if(direction.equals("Horizontal")){
                for(int i = 0; i<testBoat.size(); i++){
                    if(b.onBoat(new Position(pos.rowIndex()+1, pos.colIndex() + i + 1))){
                        throw(new BoatOverlappingException());
                    }
                }
            }
        }
        
        System.out.println("RUN THE EXCEPTION BRO");
        //check for boats out of bounds
        if(direction.equals("Vertical")){
            System.out.println("test 1 true");
            System.out.println(pos.colIndex());
            System.out.println(pos.rowIndex());
   
        }
        if(direction.equals("Vertical") && pos.colIndex() + testBoat.size() >= 10){
            System.out.println("uh hello please eception me");
            throw(new BoatOutOfBoundsException());
        }
        else if(direction.equals("Horizontal") && pos.rowIndex() + testBoat.size() >= 10){
            throw(new BoatOutOfBoundsException());
        }
        boats.add(testBoat);
        //throw(new Exception());
    }

    //loop through boats and use onBoat with pos on each boat, return boat method if true 
    /* 
    public void shootAt(Position pos){

    }

    public boolean hit(Position pos){

    }

    public char boatInitial(Position pos){

    }

    public String boatName(Position pos){

    }

    public boolean sunk(Position pos){

    }

    public boolean allSunk(){

    }
    */

    public String toString(){
        String out = "";
        for(Boat b : boats){
            out += "name: " + b.name() + "\nabbreviation: " + b.abbreviation() + "\ndirection:  " + b.direction() + "\nposition: " + b.position();
            out += "\n\n";
        }
        return out;
    }
}

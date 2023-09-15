public class Ocean {
    private Boat[] boats;


    public Ocean(){
        
    }


    public void placeBoat(String boatName, String direction, Position pos) throws Exception {
        Boat testBoat = new Boat(boatName, pos, direction);

        //check for overlapping boats
        for(Boat b : boats){
            //vertical check
            if(direction.equals("Vertical")){
                for(int i = 0; i<testBoat.size(); i++){
                if(b.onBoat(new Position(pos.colIndex()+1, pos.rowIndex() + i + 1))){
                    System.out.println("overlapping boats");
                    throw(new Exception());
                }
                }
            }
            if(direction.equals("Horizontal")){
                for(int i = 0; i<testBoat.size(); i++){
                    if(b.onBoat(new Position(pos.rowIndex()+1, pos.colIndex() + i + 1))){
                        System.out.println("overlapping boats");
                        throw(new Exception());
                    }
                }
            }
        }
        boats[boats.length] = testBoat;
        //throw(new Exception());
    }


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
}

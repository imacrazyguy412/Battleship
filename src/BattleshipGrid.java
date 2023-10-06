public class BattleshipGrid {
    Ocean ocean;

    public BattleshipGrid(){
        ocean = new Ocean();
        boolean[][] boats = new boolean[10][10];
    }

    public void shotAt(Position pos,boolean hit,char initial){
        if(ocean.hit(pos)){
            boats[pos.rowIndex()][pos.colIndex()] = hit;
        }
    }

    public boolean hit(Position pos){

    }

    public boolean miss(Position pos){

    }

    public boolean empty(Position pos){

    }

    public char boatInitial(Position pos){

    }
}

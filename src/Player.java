public class Player {
    private String name;
    private BattleshipGrid grid;
    private Ocean ocean;

    public Player(){
        name = null;
    }

    public void startGame(){

    }

    public String playerName(){
        return "";
    }

    public Position shoot(){
        return new Position(0, 0);
    }

    public void updateGrid(Position pos, boolean hit, char initial){

    }

    public BattleshipGrid getGrid(){
        return new BattleshipGrid();
    }

    public void initializeGrid(){
        ocean = new Ocean();
        grid = new BattleshipGrid(ocean);
    }

    public void updatePlayer(Position pos, boolean hit, char initial, String boatName, boolean sunk, boolean gameOver, boolean tooManyTurns, int turns){

    }

}

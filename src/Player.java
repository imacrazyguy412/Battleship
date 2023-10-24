import java.util.Scanner;
public class Player {
    private String name;
    private BattleshipGrid grid;
    private Ocean ocean;
    private Scanner scan = new Scanner(System.in);

    public Player(){
        name = null;
    }

    public void startGame(){
        System.out.println("started game");
        ocean = new Ocean();
        grid = new BattleshipGrid(ocean);
        initializeGrid();
        if(name == null){
            System.out.println("input name");
            name = scan.nextLine();
        }
    }

    public String playerName(){
        return name;
    }

    public Position shoot(){
        System.out.println("enter pos to shoot");
        Position pos = PositionChecker.checkPosition(scan.nextLine());
        while(pos.colIndex()==-1){
            System.out.println("invalid, try again");
            pos = PositionChecker.checkPosition(scan.nextLine());
        }

        ocean.shootAt(pos);
        grid.shotAt(pos, ocean.hit(pos), ocean.boatInitial(pos));
        return pos;
    }

    public void updateGrid(Position pos, boolean hit, char initial){
        grid.shotAt(pos, hit, initial);
    }

    public BattleshipGrid getGrid(){
        return grid;
    }

    public void initializeGrid(){
        ocean = new Ocean();
        grid = new BattleshipGrid(ocean);
        ocean.placeAllBoats();
    }

    public void updatePlayer(Position pos, boolean hit, char initial, String boatName, boolean sunk, boolean gameOver, boolean tooManyTurns, int turns){
        System.out.println(grid);
        String isHit = (hit) ? ("hit") : ("miss");
        System.out.println("Turn #" + turns +": Your shot at " + pos +" was a " + isHit + ".");
        if(sunk){
            System.out.println("You sunk the " + boatName + "!");
        }
        if(gameOver){
            System.out.println("Game over, you took " + turns + " turns to win");
        }
    }

}

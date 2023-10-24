public class Game {
    
    private Player player;
    private int turns;

    public Game(Player player){
        turns = 0;
        this.player = player;
        this.player.startGame();
        
        play();
    }

    public int play(){
        System.out.println(this.player.getGrid().ocean);
        
        while(!player.getGrid().ocean.allSunk() && turns < 100){
            Position pos = player.shoot();
            System.out.println(this.player.getGrid().ocean);
            player.updateGrid(pos, player.getGrid().hit(pos), player.getGrid().ocean.boatInitial(pos));
            player.updatePlayer(pos, player.getGrid().hit(pos), player.getGrid().ocean.boatInitial(pos), player.getGrid().ocean.boatName(pos), player.getGrid().ocean.sunk(pos), player.getGrid().ocean.allSunk(), false, turns);
            turns++;
        }

        return turns;
    }
}

package GameLauncherPack;
import GuessGamePack.GuessGame;

public class GameLauncher {
    public static void main (String[] args) {
        //creates instance variable based on class GuessGame and runs it
        GuessGamePack.GuessGame game = new GuessGame();
        game.startGame();
    }
}
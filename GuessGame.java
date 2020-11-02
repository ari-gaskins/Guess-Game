package GuessGamePack;


public class GuessGame {
    
    //three instance variables for the three player objects
    Player p1;
    Player p2;
    Player p3;

  
    public void startGame() {
        //creates three Player objects and assigns them to the instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //delclare three variables to hold three guesses the players made
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //declare three variables to hold true or false based on player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //make target number that players have to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            //call each player's guess method
            p1.guess();
            p2.guess();
            p3.guess();

            //get each player's guess by accessing the number variable of each player
            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player 2 guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player 3 guessed " + guessp3);

            //check each player's guess to see if it matches the target number 
            //if a player is right set that player's variable to true
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
        
            //if one or two or three players are correct output winners
            //otherwise stay in loop and ask the players to guess again
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right?" + p1isRight);
                System.out.println("Player two got it right?" + p2isRight);
                System.out.println("Player three got it right?" + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}

package Player;

public class Player {
    //where the guess goes
    public int number = 0; 

    //takes random guess from itself
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
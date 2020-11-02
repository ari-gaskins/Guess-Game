package playerpack;

public class Player {
    //where the guess goes
    int number = 0; 

    //takes random guess from itself
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.print("I'm guessing " + number);
    }
}
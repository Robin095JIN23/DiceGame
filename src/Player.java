
import java.util.Random;

class Player { //player class
    //variables
    Random rand = new Random();
    static int playerScore = 0;
    int playerChoice = 0;
    //methods
    public void playerRoll() {
        playerChoice = rand.nextInt(6) + 1;
        playerScore = playerScore + playerChoice;
        System.out.println("You rolled a " + playerChoice);
        System.out.println("Your score is " + playerScore);
    }
}

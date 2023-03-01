import java.util.Random;


class Computer { //computer class
    //variables
    Random rand = new Random();
    static int computerScore = 0;
    int computerChoice = 0;
    //methods
    public void computerRoll() {
        computerChoice = rand.nextInt(6) + 1;
        computerScore = computerScore + computerChoice; //add computer choice to computer score
        System.out.println("The computer rolled a " + computerChoice);
        System.out.println("The computer's score is " + computerScore);
    }
}
//dice game vs computer
//how to play: roll dice and get to 21 first to win or get as close to 21 as possible
//if the player or computer gets to 21 or over, the game ends
//if the player and computer get the same score, it's a tie

import java.util.Scanner;
import java.util.Random;

//main class
public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    //variables
    final int[] playerChoice = {0};
    final int[] computerChoice = {0};


    class Game { //GameLoop
        public void game() {
            //game loop
            //game will continue until player or computer reaches 21 or a bit over
            while (Player.playerScore < 21 && Computer.computerScore < 21) {
                //player turn
                System.out.println("It is your turn");
                System.out.println("Press 1 to roll");
                playerChoice[0] = input.nextInt();
                if (playerChoice[0] == 1) { //if player presses 1, roll dice for player
                    Player player = new Player(); //create new player object
                    player.playerRoll(); //roll dice for player


                }
                //computer turn
                System.out.println("It is the computer's turn");
                System.out.println("Press 1 to roll");
                computerChoice[0] = input.nextInt();
                if (computerChoice[0] == 1) { //if player presses 1, roll dice for computer
                    Computer computer = new Computer(); //create new computer object
                    computer.computerRoll(); //roll dice for computer
                }
            }
            //check who won
            if (Player.playerScore > Computer.computerScore) {
                System.out.println("You won!");
            } else if (Player.playerScore < Computer.computerScore) {
                System.out.println("You lost!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
    //run game
    Game game = new Game();
    game.game();
}
}


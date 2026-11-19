import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        // Rock paper scissor game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // declare variables
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            // get choice from the user
            System.out.print("Enter your choice (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("invalid choice");
                continue;
            }
            // get random choice for the computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println(computerChoice);
            // check win conditions
            if(playerChoice.equals(computerChoice)){
                System.out.println("its a tie.");
            } else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("you win");
            } else {
                System.out.println("you lose");
            }

            // ask to play again?
            System.out.print("play again(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        // goodbye message
        System.out.println("good bye thank you for playing");

        scanner.close();
    }
}

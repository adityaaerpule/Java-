package system;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        rockPaperScissors();  // Call the method to play the game
    }

    // Method to play Rock, Paper, Scissors game
    public static void rockPaperScissors() {
        Scanner scanner = new Scanner(System.in);  // Scanner object to take user input
        java.util.Random random = new java.util.Random();  // Random object to generate computer's choice

        int computerScore = 0;  // Initialize computer's score
        int userScore = 0;  // Initialize user's score

        // Loop for 5 rounds of the game
        for (int round = 1; round <= 5; round++) {
            System.out.println("\nRound " + round);
            System.out.println("Choose: 1 - Rock, 2 - Paper, 3 - Scissors");
            int userChoice = scanner.nextInt();  // User input for choice

            int computerChoice = random.nextInt(3) + 1;  // Random computer choice

            System.out.println("Computer chose: " + getChoiceName(computerChoice));  // Print computer's choice
            System.out.println("You chose: " + getChoiceName(userChoice));  // Print user's choice

            int result = determineWinner(computerChoice, userChoice);  // Determine winner of the round

            // Display result of the round
            if (result == 1) {
                computerScore++;  // Computer wins
                System.out.println("Computer wins this round!");
            } else if (result == -1) {
                userScore++;  // User wins
                System.out.println("You win this round!");
            } else {
                System.out.println("It's a tie!");  // Tie
            }
        }

        // Game over, display final scores
        System.out.println("\n--- Game Over ---");
        System.out.println("Computer Score: " + computerScore);
        System.out.println("Your Score: " + userScore);

        // Determine overall winner of the game
        if (computerScore > userScore) {
            System.out.println("Computer Wins!");
        } else if (computerScore < userScore) {
            System.out.println("You WON!");
        } else {
            System.out.println("It's a tie overall!");
        }

        scanner.close();  // Close the scanner
    }

    // Method to get the name of the choice (1 - Rock, 2 - Paper, 3 - Scissors)
    private static String getChoiceName(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid Choice";  // Default for invalid choices
        };
    }

    // Method to determine the winner of a round
    private static int determineWinner(int computer, int user) {
        if (computer == user) {
            return 0; // Tie
        } else if ((computer == 1 && user == 3) || (computer == 2 && user == 1) || (computer == 3 && user == 2)) {
            return 1; // Computer wins
        } else {
            return -1; // User wins
        }
    }
}

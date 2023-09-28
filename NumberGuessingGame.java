import java.util.Random;
import java.util.*;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 0;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (true) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            
            System.out.println("\nRound " + (rounds + 1)+" starts: ");
            System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("!!!Congratulations!!! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guessed number is too low! Try again.");
                } else {
                    System.out.println("Your guessed number is too high! Try again.");
                }
                
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber +", better luck next time");
                }
            }
            
            rounds++;
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Your total score is: " + score);
                break;
            }
        }
        
        
    }
}

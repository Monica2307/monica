import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + min + " and " + max + ". Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < min || userGuess > max) {
                System.out.println("Please guess within the range of " + min + " and " + max + ".");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number (" + randomNumber + ") in " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }
        }
    }
}
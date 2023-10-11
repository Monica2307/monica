import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Please enter your name: ");

        // Read the user's input as a string
        String name = scanner.nextLine();

        // Display the user's input
        System.out.println("Hello, " + name + "!");

        
    }
}
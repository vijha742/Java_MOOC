import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MemorizationGame {
    public static void main(String[] args) {
        final int SEQUENCE_LENGTH = 5; // Number of numbers to memorize

        // Generate the sequence of random numbers
        int[] sequence = generateSequence(SEQUENCE_LENGTH);

        // Display the sequence to the user
        System.out.println("Memorize the sequence:");
        displaySequence(sequence);

        // Wait for a short moment before clearing the screen
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clear the screen
        clearScreen();

        // Ask the user to input the sequence in ascending order
        System.out.println("Enter the sequence in ascending order:");
        int[] userInput = getUserInput(SEQUENCE_LENGTH);

        // Check if the user input matches the sequence
        if (Arrays.equals(sequence, userInput)) {
            System.out.println("Congratulations! You memorized the sequence correctly.");
        } else {
            System.out.println("Oops! You made a mistake in the sequence.");
        }
    }

    // Method to generate a sequence of random numbers
    private static int[] generateSequence(int length) {
        Random rand = new Random();
        int[] sequence = new int[length];
        for (int i = 0; i < length; i++) {
            sequence[i] = rand.nextInt(100); // Generate random integers between 0 and 99
        }
        return sequence;
    }

    // Method to display the sequence to the user
    private static void displaySequence(int[] sequence) {
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to clear the console screen
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Method to get user input for the sequence
    private static int[] getUserInput(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userInput[i] = scanner.nextInt();
        }
        scanner.close();
        return userInput;
    }
}

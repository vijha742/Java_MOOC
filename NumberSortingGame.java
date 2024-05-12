import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberSortingGame {
    public static void main(String[] args) {
        // Number of integers to display
        final int NUM_INTEGERS = 3;

        // Create a Random object
        Random rand = new Random();

        // Generate random integers
        int[] numbers = new int[NUM_INTEGERS];
        for (int i = 0; i < NUM_INTEGERS; i++) {
            numbers[i] = rand.nextInt(100); // Generates random integers between 0 and 99
        }

        // Shuffle the array to display numbers in random order
        shuffleArray(numbers);

        // Display the random integers
        System.out.println("Arrange the numbers in ascending order:");
        for (int i = 0; i < NUM_INTEGERS; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers in ascending order separated by spaces:");

        // Read the user input
        String userInput = scanner.nextLine();
        String[] inputNumbers = userInput.split(" ");

        // Convert the user input to integers
        int[] userIntegers = new int[NUM_INTEGERS];
        for (int i = 0; i < NUM_INTEGERS; i++) {
            userIntegers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // Check if the user input is correct
        if (Arrays.equals(numbers, userIntegers)) {
            System.out.println("Congratulations! You arranged the numbers correctly.");
        } else {
            System.out.println("Oops! You arranged the numbers incorrectly.");
        }

        scanner.close();
    }

    // Method to shuffle an array
    private static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Swap elements
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}

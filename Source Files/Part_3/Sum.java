import java.util.ArrayList;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> value = new ArrayList<>();
		// ArrayList i a method is a reference type parameter ulike int, float, double.
		// Therfore it's value in main function can be changed from the function.
		// Write code here...
		while (true) {
			int input;
			input = Integer.valueOf(scan.nextLine());
			if (input == -1) {
				break;
			} else {
				value.add(input);
			}
		}
		System.out.println("The sum of the numbers is: " + sum(value));
	}
	public static int sum(ArrayList<Integer> numbers) {
		int sum = 0;
		for (int i : numbers ) {
			sum= sum + i;
		}
		return sum;
	}
}
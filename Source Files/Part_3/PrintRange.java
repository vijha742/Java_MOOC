import java.util.ArrayList;
import java.util.Scanner;
public class PrintRange {
	public static void printvalueInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
		for (int i : numbers) {
			if (i>= lowerLimit && i<= upperLimit ) {
				System.out.println(i); 
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> value = new ArrayList<>();
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
		System.out.println("Enter lower and upper Limit");
		int lower = Integer.valueOf(scan.nextLine());
		int upper = Integer.valueOf(scan.nextLine());
		System.out.println("the numbers in the range [" + lower + ", " + upper + "]");
		printvalueInRange(value, lower, upper);
	}
}
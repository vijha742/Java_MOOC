import java.util.ArrayList;
import java.util.Scanner;
public class OnList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		// The list method contains can be used to check the existence of a value in the list. The method receives the value to be searched as its parameter, and it returns a boolean type value 
		// list.add("First");
		// list.add("Second");
		// list.add("Third");

		// System.out.println("Is the first found? " + list.contains("First"));
		// Write code here...
		String input;
		while (true) {
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			} else {
				list.add(input);
			}
		}

		System.out.print("Search for?");
		boolean found = list.contains(scan.nextLine());
		if (found) {
			System.out.println(input + " was found!");
		} else {
			System.out.println(input + " was not found!");
		}
	}
}
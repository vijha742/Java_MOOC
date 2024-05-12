// Search for a better program for it ?? i.e vikas, prince, mooc solutions
import java.util.Scanner;
public class NameOldest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		String input;
		int largest = 0;
		String name = "none";
		while (true) {
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] pieces = input.split(",");
			if (largest < Integer.valueOf(pieces[1])) {
				largest = Integer.valueOf(pieces[1]);
				name = pieces[0];
			}
		}
		System.out.println("Name of the oldest:" + name);
	}
}
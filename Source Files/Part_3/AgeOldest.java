import java.util.Scanner;
public class AgeOldest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		String input;
		int largest = 0;
		while (true) {
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] pieces = input.split(",");
			if (largest < Integer.valueOf(pieces[1])) {
				largest = Integer.valueOf(pieces[1]);
			}
		}
		System.out.println("Age of the oldest:" + largest);
	}
}
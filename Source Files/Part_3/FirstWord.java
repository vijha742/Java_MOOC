import java.util.Scanner;
public class FirstWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		String input;
		while (true) {
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] pieces = input.split(" ");
			System.out.println(pieces[0]);
			System.out.println("");
		}
	}
}
import java.util.Scanner;
public class LastWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// In a word we can also get character at a certain index using string_name.charAt(i)
		// Write code here...
		String input;
		while (true) {
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] pieces = input.split(" ");
			System.out.println(pieces[pieces.length - 1]);
			System.out.println("");
		}
	}
}
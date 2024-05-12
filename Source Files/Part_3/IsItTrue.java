import java.util.Scanner;
public class IsItTrue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		System.out.print("Give a string:");
		String word = scan.nextLine();
		if (word.equals(true)) {
			System.out.print("You got it right!");
		} else {
			System.out.print("Try again!");
		}
	}
}
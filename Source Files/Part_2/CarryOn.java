// Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
import java.util.Scanner;
public class CarryOn{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Shall we carry on?");
			String answer = scan.nextLine();
			if (answer.equals("no")) {
				break;
			} 
		}

	}
}
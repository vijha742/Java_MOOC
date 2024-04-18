// Write a program, according to the preceding example, that asks the user to input values until they input the value 4.
import java.util.Scanner;
public class AreWeThere{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Give a number:");
			int value = Integer.valueOf(scan.nextLine());
			if (value == 4) {
				break;
			} 
		}

	}
}
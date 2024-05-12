import java.util.Scanner;
public class CheckAge{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = Integer.valueOf(scan.nextLine());
		// Logical operators
		if (age >= 0 && age <= 120) {
			System.out.println("OK");
		} else {
			System.out.println("Impossible!");
		}
	}
}
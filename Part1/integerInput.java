import java.util.Scanner;

public class integerInput{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = Integer.valueOf(scan.nextLine());
		System.out.println("You entered " + num);
	}
}

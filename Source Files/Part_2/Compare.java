import java.util.Scanner;
public class Compare{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.valueOf(scan.nextLine());
		int num2 = Integer.valueOf(scan.nextLine());
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2 + ".");
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2 + ".");
		} else {
			System.out.println(num1 + " is equal to " + num2 + ".");
		}
	}
}
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give a year:");
		int year = Integer.valueOf(scan.nextLine());
		if (year%400 == 0) {
			System.out.println("It is leap year.");
		} else if (year%4 == 0 && year%100 != 0) {
			System.out.println("It is leap year.");
		} else {
			System.out.println("It is not a leap year.");
		}
	}
}

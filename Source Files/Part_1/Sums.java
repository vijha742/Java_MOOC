import java.util.Scanner;
public class Sums{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int val1 = Integer.valueOf(scan.nextLine());
		System.out.println("Enter another number:");
		int val2 = Integer.valueOf(scan.nextLine());
		System.out.println("Enter another number:");
		int val3 = Integer.valueOf(scan.nextLine());
		System.out.println("The sum of three numbers is " + (val1 + val2 + val3));
	}
}
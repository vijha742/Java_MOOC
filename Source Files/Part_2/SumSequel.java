import java.util.Scanner;
public class SumSequel{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int sum = 0;
		System.out.print("First Number?");
		int start = Integer.valueOf(scan.nextLine());
		System.out.print("Last Number?");
		int last = Integer.valueOf(scan.nextLine());
		for (int i = start; i <= last; i++ ) {
			sum = sum + i;
		}
		System.out.println("the sum is " + sum);
	}
}
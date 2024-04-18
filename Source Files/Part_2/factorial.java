import java.util.Scanner;
public class factorial{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int fact = 1;
		System.out.print("Give a number:");
		int n = Integer.valueOf(scan.nextLine());
		for (int i = 1;i<= n;i++ ) {
			fact = fact*i;
		}
		System.out.println("Factorial:" + fact);
	}
}
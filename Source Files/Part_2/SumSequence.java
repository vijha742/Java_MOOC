import java.util.Scanner;
public class SumSequence{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int sum = 0;
		System.out.print("Last Number?");
		int num = Integer.valueOf(scan.nextLine());
		for (int i = 1;i<= num ; i++) {
			sum = sum + i;
		}
		System.out.println("the sum is " + sum);
	}
}
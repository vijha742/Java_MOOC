import java.util.Scanner;
public class CountingHundred{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int num = Integer.valueOf(scan.nextLine());
		for (int i = num;i<=100 ; i++) {
			System.out.println(i);
		}
	}
}
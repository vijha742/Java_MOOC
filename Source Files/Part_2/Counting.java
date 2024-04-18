import java.util.Scanner;
public class Counting{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int num = Integer.valueOf(scan.nextLine());
		for (int i = 0;i <= num ; i++ ) {
			System.out.println(i);
		}
	}
}
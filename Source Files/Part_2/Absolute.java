import java.util.Scanner;
public class Absolute{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = Integer.valueOf(scan.nextLine());
		if (value < 0) {
			System.out.println(-1*value);
		} else {
			System.out.println(value);
		}
	}
}
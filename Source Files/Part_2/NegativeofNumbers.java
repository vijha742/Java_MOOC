import java.util.Scanner;
public class NegativeofNumbers{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = 0;
		while (true){
			System.out.println("Give a number:");
			int num = Integer.valueOf(scan.nextLine());
			if ( num == 0) {
				break;
			}
			if (num < 0) {
				value = value + 1;

			}
		}
		System.out.println("Number of negative numbers:" + value);
	}
}
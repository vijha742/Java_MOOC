import java.util.Scanner;
public class Sum_Numbers{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int value = 0;
		while (true){
			System.out.println("Give a number:");
			int num = Integer.valueOf(scan.nextLine());
			if ( num == 0) {
				break;
			}
			sum = sum + num;
			value = value + 1;
		}
		System.out.println("Number of numbers:" + value);
		System.out.println("Sum of the numbers:" + sum);
	}
}
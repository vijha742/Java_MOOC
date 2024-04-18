import java.util.Scanner;
public class NumberofNumbers{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = 0;
		while (true){
			System.out.println("Give a number:");
			int num = Integer.valueOf(scan.nextLine());
			if ( num == 0) {
				break;
			}
			value = value + 1;
		}
		System.out.println("Number of numbers:" + value);
	}
}
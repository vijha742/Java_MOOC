import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int[] values = new int[5];
		values[0] = 1;
		values[1] = 3;
		values[2] = 5;
		values[3] = 7;
		values[4] = 9;
		System.out.println("Give two indices to swap:");
		int index1 = Integer.valueOf(scan.nextLine());
		int index2 = Integer.valueOf(scan.nextLine());
		int temp;
		temp = values[index1] ;
		values[index1] = values[index2];
		values[index2] = temp;

		for (int i=0;i < values.length ; i++) {
			System.out.println(values[i]);
		}
	}
}
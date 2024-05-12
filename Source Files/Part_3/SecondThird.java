 import java.util.Scanner;
import java.util.ArrayList;
public class SecondThird{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(); // SC for Sublime: ArrayList init
		int num = 0;
		do{
			System.out.println("Enter a integer:");
			num = Integer.valueOf(scan.nextLine());
			list.add(num);
		}while(num != 0);
		System.out.println(list.get(2));
		System.out.println(list.get(2) + list.get(1));
		// need another better implementation for loop;
	}
}
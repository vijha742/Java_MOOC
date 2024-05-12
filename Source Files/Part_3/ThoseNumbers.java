import java.util.ArrayList;
import java.util.Scanner;
public class ThoseNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> Items = new ArrayList<>();
		// Write code here...
		while (true){
			int Input = Integer.valueOf(scan.nextLine());
			if (Input == -1) {
				break;
			} else {
				Items.add(Input);;
			}
		}
		System.out.println("From where?");
		int Start = Integer.valueOf(scan.nextLine());
		System.out.println("To where?");
		int End = Integer.valueOf(scan.nextLine());

		for (int i = Start ;i <= End ; i++ ) {
			System.out.println(Items.get(i));
		}
	}
}
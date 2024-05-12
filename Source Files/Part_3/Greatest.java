import java.util.ArrayList;
import java.util.Scanner;
public class Greatest {
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
		int largest = 0;

		for (int i = 0 ;i < Items.size() ; i++ ) {
			if (largest < Items.get(i)) {
				largest = Items.get(i);
			}
		}
		System.out.println("The Greatest number: " + largest);
	}
}
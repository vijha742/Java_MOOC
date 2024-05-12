import java.util.ArrayList;
import java.util.Scanner;
public class IndexSmallest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> Items = new ArrayList<>();
		// Write code here...
		while (true){
			int Input = Integer.valueOf(scan.nextLine());
			if (Input == 9999) {
				break;
			} else {
				Items.add(Input); 
			}
		}
		// Multiple semi colon in same line doesn't count as error...
		int smallest = 2147483647;

		for (int i = 0;i < Items.size() ;i++ ) {
			if (Items.get(i) < smallest) {
				smallest = Items.get(i);
			}
		}

		System.out.println("Smallest number:" + smallest);

		for (int i = 0;i < Items.size() ;i++ ) {
			if (Items.get(i) == smallest) {
				System.out.println("Found at index:" + i);
			}
		}
	}
}
import java.util.ArrayList;
import java.util.Scanner;
public class IndexOf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> Items = new ArrayList<>();
		// Write code here...
		while (true){
			int Input = Integer.valueOf(scan.nextLine());
			if (Input == -1) {
				break;
			} else {
				Items.add(Input);
			}
		}
		System.out.print("Search for?");
		int find = Integer.valueOf(scan.nextLine());

		for (int i = 0;i < Items.size() ;i++ ) {
			if (Items.get(i) == find) {
				System.out.println(find + " is at index " + i);
			}
		}
		
	}
}
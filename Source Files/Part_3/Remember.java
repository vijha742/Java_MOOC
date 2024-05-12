import java.util.ArrayList;
import java.util.Scanner;
public class Remember{
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

		for (int i = 0 ;i < Items.size() ; i++ ) {
			System.out.println(Items.get(i));
		}
	}
}
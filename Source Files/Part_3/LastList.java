import java.util.ArrayList;
import java.util.Scanner;
public class LastList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		ArrayList<String> Names = new ArrayList<>();
		while (true){
			if (scan.nextLine().equals("")) {
				break;
			} else {
				Names.add(scan.nextLine());
			}
		}
		System.out.println(Names.get(Names.size() - 1));
	}
}
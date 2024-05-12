import java.util.ArrayList;
import java.util.Scanner;
public class FirstLast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> Names = new ArrayList<>();
		// Write code here...
		while (true){
			String input = scan.nextLine();
			if (input.equals("")) {
				break;
			} else {
				Names.add(input);
			}
		}
		System.out.println("First Element: " + Names.get(0));
		System.out.println("Last Element: " + Names.get(Names.size() -1));
	}
}
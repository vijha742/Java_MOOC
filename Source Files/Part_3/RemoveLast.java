import java.util.ArrayList;
import java.util.Scanner;
public class RemoveLast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		// Write code here...
		while (true) {
			String input;
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			} else {
				name.add(input);
			}
		}
		removeLast(name);
		System.out.println(name);
	}
	public static void removeLast(ArrayList<String> strings) {
		strings.remove(strings.size() - 1);
	}
}
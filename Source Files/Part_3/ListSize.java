import java.util.ArrayList;
import java.util.Scanner;
public class ListSize{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		ArrayList<String> list = new ArrayList<>();
		String input;
		while(true){
			System.out.println("Enter a string:");
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			} else {
				list.add(input); 
			}
			// to enter data in variable " input" to the ArrayList "list"
		};
		System.out.println(list.get(0));
		System.out.println("In Total:" + list.size());
	}
}
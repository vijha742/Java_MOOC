// Error in code
// need to rectify it

import java.util.Scanner;
import java.util.ArrayList;
public class ListSized {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		ArrayList<String> names = new ArrayList<>();
		Integer i = 0;
		while (true){
			 names.add(scan.nextLine());
			 System.out.println("In Total: " + names.size());
			 System.out.println(names.get(i));
			 if (scan.nextLine().equals("")) {
			 	break;
			 }
			i++;
		}
		System.out.println("In Total: " + names.size());
	}
}
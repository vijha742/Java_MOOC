import java.util.ArrayList;

import java.util.Scanner;
public class ThirdElement{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		ArrayList<String> list = new ArrayList<>(); // To create an array of name "list" with data type "String".
		String input;
		do{
			System.out.println("Enter a string:");
			input = scan.nextLine();
			list.add(input); // to enter data in variable "input" to the ArrayList "list"
		}while(!(input.equals("")));
		System.out.println(list.get(2));
	}
}
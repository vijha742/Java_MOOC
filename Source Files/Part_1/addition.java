import java.util.Scanner;
	public class addition{
		public static void main(String[] args){
			// Taking input from the user
			// making scan method to read user input
			Scanner scan = new Scanner(System.in);
			System.out.println("Give the first number:");
			// Storing integer value of string entered by user as the default value is supposed to be string
			int value1 = Integer.valueOf(scan.nextLine());
			System.out.println("Give the second number:");
			int value2 = Integer.valueOf(scan.nextLine());
			// Combining output text and parameter stored
			System.out.println(value1 + " + " + value2 + " = " + (value1+value2));
		}
	}
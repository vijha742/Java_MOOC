import java.util.Scanner;
public class Inputs{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a string: ");
		String text = scan.nextLine();
		System.out.println("Give an integer: ");
		int val1 = Integer.valueOf(scan.nextLine());
		// IF WE GIVE INCORRECT VALUE TO IT, IT GIVES THE ERROR AT THAT MOMENT ONLY AND PROGRAM DOESN'T MOVE FORWARD.
		System.out.println("Give a double: ");
		double val2 = Double.valueOf(scan.nextLine());
		System.out.println("Give a boolean: ");
		boolean bool = Boolean.valueOf(scan.nextLine());
		System.out.println("You gave the string " + text);
		System.out.println("You gave the integer " + val1);
		System.out.println("You gave the double " + val2);
		System.out.println("You gave the boolean " + bool);
	}
}
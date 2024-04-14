import java.util.Scanner;
public class MessageThreeTimes {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Write a message");
		  String message = scan.nextLine();
		  System.out.println(message);
		  System.out.println(message);
		  System.out.println(message);
	}
}
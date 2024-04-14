import java.util.Scanner;
public class Conversation{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Greetings! How are you doing?");
		String msg = scan.nextLine();
		System.out.println("Oh, how interesting. Tell me more!");
		String hi = scan.nextLine();
		System.out.println("Thanks for sharing");

	}
}
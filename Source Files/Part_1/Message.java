import java.util.Scanner;
public class Message{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a message");
		/* Enter data type followed by variable name = scanner name . nextLine()
		the nextLine() commanad stores the value enetered in the variable using scanner utility*/
		String message = scan.nextLine();
		System.out.println(message);
	}
} 
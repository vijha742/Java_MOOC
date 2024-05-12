import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		System.out.print("Enter username:");
		String user = scan.nextLine();
		System.out.print("enter password:");
		String pass = scan.nextLine();
		if (user.equals("alex") && pass.equals("sunshine")) {
			System.out.print("You have successfully logged in!");
		} else if(user.equals("emma") && pass.equals("haskell")) {
			System.out.print("You have successfully logged in!");
		} else {
			System.out.print("Incorrect username or password!");
		}
	}
}
import java.util.Scanner;
public class PrintThrice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		System.out.print("Give a word:");
		String word = scan.nextLine();
		System.out.println(word + word + word);
	}
}
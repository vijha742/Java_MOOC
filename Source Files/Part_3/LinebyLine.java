import java.util.Scanner;
public class LinebyLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		while (true) {
			String text = scan.nextLine();
			String[] pieces = text.split(" ");
			for (int i = 0; i< pieces.length;i++ ) {
				System.out.println(pieces[i]);
			}
			System.out.println("");
		}
	}
}
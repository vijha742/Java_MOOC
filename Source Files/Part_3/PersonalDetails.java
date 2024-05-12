import java.util.Scanner;
public class PersonalDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		String input;
		int sum = 0;
		int count = 0;
		int largest = 0;
		String name = "none";
		while (true) {
			input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] pieces = input.split(",");
			sum += Integer.valueOf(pieces[1]);
			if (largest < pieces[0].length()) {
				name = pieces[0];
			}
			count++;
		}
		System.out.println(count);
		System.out.println("Longest name:" + name);
		System.out.println("Average of the birth years:" + 1.0*sum/count);
	}
}
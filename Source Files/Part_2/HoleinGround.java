import java.util.Scanner;
public class HoleinGround{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		System.out.println("How many times?");
		int n = Integer.valueOf(scan.nextLine());
		for (int i=1;i<=n ;i++ ) {
			printText();
		}
	}
	public static void printText() {
		System.out.println("In a hole in the ground there lived a method");
		System.out.println();
	}

}
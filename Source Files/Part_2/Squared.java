// Write a program that reads an integer from the user and prints the square of the given integer, i.e. the integer multiplied by itself.
import java.util.Scanner;
public class Squared{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.valueOf(scan.nextLine());
		System.out.println(num*num);
	}
}
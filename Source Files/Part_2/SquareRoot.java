/* Write a program that reads two integers from the user and prints the square root of the sum of these integers. 
The program does not need to work with negative values.*/
import java.util.Scanner;
public class SquareRoot{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.valueOf(scan.nextLine());
		int num2 = Integer.valueOf(scan.nextLine());
		System.out.println(Math.sqrt(num1 + num2 ));
	}
}
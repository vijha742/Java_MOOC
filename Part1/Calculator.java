import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the first number:");
		int value1 = Integer.valueOf(scan.nextLine());
		System.out.println("Give the second number:");
		int value2 = Integer.valueOf(scan.nextLine());
		System.out.println(value1 + " + " + value2 + " = " + (value1+value2));
		System.out.println(value1 + " - " + value2 + " = " + (value1-value2));
		System.out.println(value1 + " * " + value2 + " = " + (value1*value2));
		System.out.println(value1 + " / " + value2 + " = " + (1.0*value1/value2));
	}
}
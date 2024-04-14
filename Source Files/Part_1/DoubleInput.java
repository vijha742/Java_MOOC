import java.util.Scanner;
public class DoubleInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a number: ");
		Double val = Double.valueOf(scan.nextLine());
		System.out.println("You gave the number " + val);
	}
}
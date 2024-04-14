import java.util.Scanner;
public class Seconds{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How many days would you like to convert into seconds?");
		int days = Integer.valueOf(scan.nextLine());
		System.out.println(days*24*3600);
	}
}
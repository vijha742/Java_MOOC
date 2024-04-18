import java.util.Scanner;
public class OnlyPositives {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Individual if statements are used to have a clear sense of clarity so that there is individual task assigned to each if block.
		while (true){
			System.out.println("Give a number:");
			int num = Integer.valueOf(scan.nextLine());
			if (num == 0) {
				break;
			} 
			if (num < 0) {
				System.out.println("Unsuitable Number");
				continue;
			} 
			System.out.println(num*num);
		}
	}
}
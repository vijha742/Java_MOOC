/* the program first prints "Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" 
Sum of numbers
Sum and the number of numbers
Average of numbers
Even and odd numbers */
import java.util.Scanner;
public class Loops{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int sum = 0, total = 0, even=0, odd=0;
		System.out.println("Give Numbers:");
		while (true){
			int num = Integer.valueOf(scan.nextLine());
			if (num == -1) {
				break;
			}
			sum += num;
			total++;
			if (num%2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Thx! Bye!");
		System.out.println("Sum:" + sum);
		System.out.println("Numbers:" + total);
		System.out.println("Average:" + (1.0*sum/total));
		System.out.println("Even:" + even);
		System.out.println("Odd:" + odd);
	}
}
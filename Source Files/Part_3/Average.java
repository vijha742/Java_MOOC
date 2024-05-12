import java.util.ArrayList;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		while (true){
			int Input = Integer.valueOf(scan.nextLine());
			if (Input == -1) {
				break;
			} else {
				num.add(Input);
			}
		}
		int sum = 0;
		Double average;
		for (int i : num) {
			sum+=i;
		}
		average = sum*1.0/num.size();
		System.out.println("Average:" + average);
	}
}
import java.util.Scanner;
public class IndexSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int[] values = new int[5];
		values[0] = 1;
		values[1] = 3;
		values[2] = 5;
		values[3] = 7;
		values[4] = 9;
		System.out.print("Search for?");
		int find = Integer.valueOf(scan.nextLine());
		for (int i=0;i < values.length ; i++) {
			if (find == values[i]) {
				System.out.println(find + " is at index " + i);  
			} else {
				System.out.println(find + " was not found.");
			}
		}
		
	}
}
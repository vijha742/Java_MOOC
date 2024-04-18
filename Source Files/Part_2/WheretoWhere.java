import java.util.Scanner;
public class WheretoWhere{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		System.out.print("Where to?");
		int to = Integer.valueOf(scan.nextLine());
		System.out.print("Where from?");
		int from = Integer.valueOf(scan.nextLine());
		if (to < from) {
			retur;n
		} 
		for (int i = from;i <= to ;i++ ) {
			System.out.println(i);
		}
	}
}
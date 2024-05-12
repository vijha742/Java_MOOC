import java.util.Scanner;
public class ArrayPrinter  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		int[] array = {5, 1, 3, 4, 2};
		printNeatly(array);
	}
	public static void printNeatly(int[] array) {
		for (int i = 0;i < array.length ;i++ ) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
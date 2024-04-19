import java.util.Scanner;
public class Starsign{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		
		printRectangle(17, 3);
		printSquare(4);
		printStars(9);
		printTriangle(4);

	}
	public static void printStars(int number) {
		int i=0;
		while (i < number) {
			System.out.print("*");
			i++;
		}
		System.out.println("");
	}
	public static void printSquare(int size) {
		for (int j = 0;j < size ; j++) {
			printStars(size);
		}
	}
	public static void printRectangle(int width, int height) {
		for (int j=0;j<height ; j++) {
			printStars(width);
		}
	}
	// i < 4

	public static void printTriangle(int size) {
		for (int i=1;i <=size ;i++ ) { 
			printStars(i);
		}
	}
}
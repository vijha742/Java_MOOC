import java.util.Scanner;
public class Astrology{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
		printTriangle(4);
		christmasTree(2);
		christmasTree(4);
		christmasTree(10);
	}
	public static void printSpaces(int number) {
		for (int i= 0;i< number ;i++) {
			System.out.print(" ");
		}
	}
	public static void printTriangle(int size) {
		for (int i = 1;i<=size ;i++ ) {
			printSpaces(size-i);
			Starsign.printStars(i); // Method calling from another class i.e. Java file. 
		}
	}public static void christmasTree(int height) {
		for (int i = 1;i<=height ;i++ ) {
			printSpaces(height-i);
			Starsign.printStars(2*i-1); // Method calling from another class i.e. Java file. 
		}
		// 4 > 2
		// 5 > 3
		// 6 > 4
		printSpaces(height-2);
		Starsign.printStars(3);
		printSpaces(height-2);
		Starsign.printStars(3);
	}
}
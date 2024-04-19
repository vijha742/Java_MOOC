import java.util.Scanner;
public class methods{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write code here...
	}
	public static void oToP(int num) {
		for (int i = 1;i<=num ;i++ ) {
			System.out.println(i);
		}
	}
	public static void pToO(int num) {
		for (int i = num;i>=1 ;i-- ) {
			System.out.println(i);
		}
	}
	public static void division(int num, int denom) {
		System.out.println(1.0*num/denom);
	}
	public static void divisibleByThreeInRange(int beginning, int end) {
		for (int i = beginning; i<= end ;i++ ) {
			if (i%3 == 0) {
				System.out.println(i);
			}
		}
	}
	public static int numberUno() {
		return 1;
	}
	public static String word() {
		return "vikas";
	}
	public static int summation(int num1, int num2, int num3, int num4) {
		return num1+num2+num3+num4;
	}
	public static int smallest(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static int greatest(int num1, int num2, int num3) {
		if (num1 <= num2) {
			if (num2 <= num3) {
				return num3;
			} else{
				return num2;
			}
		} else {
			if (num1 <= num3) {
				return num3;
			} else {
				return num1;
			}
		}
	}
	public static double average(int num1, int num2, int num3, int num4) {
		return summation(num1, num2, num3, num4)/4.0;
	}
}
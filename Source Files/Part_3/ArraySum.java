 import java.util.Scanner;
 public class ArraySum {
 	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		// Write code here...
 		// Array is an object, so when you change the array inside the method, the changes persist after the execution of the method.
 		int[] numbers = {5, 1, 3, 4, 2};
 		System.out.println("Sum of number in array is: " + sumOfNumbersInArray(numbers));
 	}
 	public static int sumOfNumbersInArray(int[] array) {
 		int sum = 0;
 		for (int i = 0;i < array.length ;i++ ) {
			sum += array[i];
			// what does =+ mean
 		}
 		return sum;
 	}
}
import java.util.ArrayList;
import java.util.Scanner;
public class SumList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		// Instead of for loop we can also use for each loop
		// Syntax is for (data_type variable_name : List_name)

		// ArrayList<String> teachers = new ArrayList<>();
		// 	teachers.add("Simon");
		// 	for (String teacher: teachers) {
		// 	    System.out.println(teacher);
		// 	}
		// Instead of 

		// ArrayList<String> teachers = new ArrayList<>();
		// 	teachers.add("Simon");
		// 	for (int i = 0; i < teachers.size(); i++) {
		// 	    String teacher = teachers.get(i);
		// 	    System.out.println(teacher);
		// 	}
		
		// Write code here...
		while (true){
			int Input = Integer.valueOf(scan.nextLine());
			if (Input == -1) {
				break;
			} else {
				num.add(Input);
			}
		}
		int sum = 0;

		for (int i = 0;i < num.size() ;i++ ) {
			sum+=num.get(i);
		}
		System.out.println("Sum:" + sum);
	}
}
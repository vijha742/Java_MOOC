import java.util.Scanner;
public class SpeedingTicket{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Give speed:");
		int speed = Integer.valueOf(scan.nextLine());
		if(speed > 120){
			System.out.println("Speeding Ticket!");
		}
	}
}
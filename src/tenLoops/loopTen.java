package tenLoops;
import java.util.Scanner;
public class loopTen {
	public static void main (String []args) {
		System.out.print("Enter day of week");
		Scanner weekDay = new Scanner(System.in);
		int number = weekDay.nextInt();
		if (number <= 5 && number >0) {
			System.out.print("weekday");
		}else {
			System.out.print("weekend");
		}
		weekDay.close();
	}	
}
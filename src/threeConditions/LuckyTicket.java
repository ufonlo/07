package threeConditions;

import java.util.Scanner;

public class LuckyTicket {
	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Ticket 000000-999999 ");
		int ticket = scan.nextInt();

		// create output values

		int sumLeft = ((ticket%1000000)+(ticket%100000)+(ticket%10000));
		int sumRight = ((ticket%1000)+(ticket%100)+(ticket%10));
		boolean lackyTicket = true;
		boolean bedTicket = false;
		String erorImput = "Eror";

		if (ticket < 0 || ticket > 999999) {
			System.out.print(erorImput);
		}else if (ticket==000000||ticket == 999999) {
			System.out.print(lackyTicket);
		}else if(sumLeft==sumRight) {
			System.out.print(lackyTicket);
		}else {
			System.out.print(bedTicket);
		}

		// create BL

		scan.close();

	}
}

package oneConditions;

import java.util.Scanner;

public class ConditionsOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter cartA: ");
		int cartA = scanner.nextInt();
		System.out.print("Enter cart B");
		int cartB = scanner.nextInt();
		
		
        if (cartA <= 0 || cartB <= 0) {
        	System.out.print("Error");
        }
		else if (cartA > 21 && cartB > 21) {
			System.out.println("0");
		} else if  (cartA > 21 || cartB > 21) {
			if (cartA <= 21) {
				System.out.print(cartA);
			} else {
				System.out.print(cartB);
			}
		} else if (cartA <= 21 && cartB <= 21) {
			if (cartA > cartB) {
				System.out.print(cartA);
			} else {
				System.out.print(cartB);
			}
			
		} else if (cartA < 0 ) {
			System.out.print("Error");
		}scanner.close();
	}
}
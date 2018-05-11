package fiveConditions;

import java.util.Scanner;

public class BmiInfo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight");
		double weight  = scan.nextDouble();
		
		System.out.println("Enter your height");
		double height = scan.nextDouble();
		
		String errorMesage = "Error";
		double bmi = ((weight / height)*(weight / height));
		String mesageUnderweight = "Underweight";
		String mesageNormal = "Normal";
		String mesageOverweight = "Overweight";
		// create output values

		
		if (weight<=0|height<=0) {
			System.out.print(errorMesage);
			
		} else if (bmi <= 18.5) {
			System.out.print(mesageUnderweight);
		} else if (18.5 <= bmi||bmi <= 25.0) {
			System.out.print(mesageNormal);
		} else {
			System.out.print(mesageOverweight);
		}

		// create BL

		scan.close();

	}

}

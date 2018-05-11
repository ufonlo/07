package fiveConditions;

import java.util.Scanner;

public class BmiInfo {
	public static void main(String[] args) {
		double weight,height,bmi;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight");
		weight  = scan.nextDouble();
		System.out.println(weight);
		System.out.println("Enter your height");
		height = scan.nextDouble();
		System.out.println(height);
		
		
		String errorMesage = "Error";
		bmi = (weight / (height*height));
		
		
		String mesageUnderweight = "Underweight";
		String mesageNormal = "Normal";
		String mesageOverweight = "Overweight";

	
		if (weight<=0||height<=0) {
			System.out.print(errorMesage);
			
		} else if (bmi <= 18.5) {
			System.out.print(mesageUnderweight + "  BMI = " + bmi);
		} else if (18.5 <= bmi||bmi <= 25.0) {
			System.out.print(mesageNormal + "  BMI = " + bmi);
		} else {
			System.out.print(mesageOverweight + "  BMI = " + bmi);
		}

		// create BL

		scan.close();

	}

}

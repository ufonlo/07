package twoConditions;

import java.util.Scanner;

public class BiggerRectangle {
	public static void main(String[] args) {
		// create first rectangle
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first rectangle widht");
		int widht1 = scan.nextInt();
		System.out.println("Enter the first rectangle height");
		int height1 = scan.nextInt();
		// create second rectangle
		System.out.println("Enter the second rectangle widht");
		int widht2 = scan.nextInt();
		System.out.println("Enter the second rectangle height");
		int height2 = scan.nextInt();

		// create output values
		String rectangle1 = "1";
		String rectangle2 = "2";
		String erorImput = "Eror";

		// create BL
		if (widht1 < 0 || height1 < 0 || widht2 < 0 || height2 < 0) {
			System.out.print(erorImput);
		} else if ((widht1 + height1) < (widht2 + height2)) {
			System.out.print(rectangle2);
		} else {
			System.out.print(rectangle1);

			scan.close();
		}
	}
}

package three;

import java.util.Scanner;
public class homeThree {
	public static void main (String []args) {
		System.out.println("Enter a");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		System.out.println("Enter c");
		int c = scan.nextInt();
		
		if(a < b && a < c) {
		System.out.print("Minimal number is a = " + a);
		}else if (b < a && b < c ){
			System.out.print("Minimal number is b = " + b);
		}else if (c<a&&c<b){
			System.out.print("Minimal number is c = " + c);
		}
		scan.close();
	}

}

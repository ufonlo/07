package five;

import java.util.Scanner;
public class homeFive {
			public static void main (String []args) {
				System.out.println("Enter n");
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();

				
				if(n > 99 && n < 201) {
				System.out.print(n);
				}else{
					System.out.print("No diapazon");
					
				}
				scan.close();
			}

		}
package foure;
import java.util.Scanner;
public class homeFoure {
		public static void main (String []args) {
			System.out.println("Enter a");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			System.out.println("Enter b");
			int b = scan.nextInt();

			
			if(a < b) {
			System.out.print("-1");
			}else if (a==b){
				System.out.print("0");
			}else{
				System.out.print("+1");
			}
			scan.close();
		}

	}


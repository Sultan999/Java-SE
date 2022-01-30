package factorial;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number");
		n = scan.nextInt();

		int fact = 1;

		for(int i = 1; i <= n; i++) {

			fact *= i;
		}
		System.out.println("The factorial of " + n + " number is " + fact);


	}

}

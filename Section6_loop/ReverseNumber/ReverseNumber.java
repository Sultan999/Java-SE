package reversenumber;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {

		// Reverse a Number

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number: ");
		n = scan.nextInt();

		int r;
		int j = 10;
		int rev = 0;

		do{

			r = n % 10;
			rev = rev * j + r;
			n /= 10;


		}while(n > 0);

		System.out.println(rev);

	}

}

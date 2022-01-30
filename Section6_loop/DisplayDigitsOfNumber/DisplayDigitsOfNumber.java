package displaydigitsofnumber;
import java.util.*;

public class DisplayDigitsOfNumber {

	public static void main(String[] args) {

		// Display Digits



		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number");
		n = scan.nextInt();

		int r;

		while(n > 0) {

			r = n % 10;
			n /= 10;

			System.out.println(r);
		}
		System.out.println(n);

	}

}

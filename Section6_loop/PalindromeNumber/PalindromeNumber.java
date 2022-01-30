package palindromenumber;
import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {

		// Check a number is palindrome

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number: ");
		n = scan.nextInt();

		int m = n;
		int r;
		int rev = 0;


		while(n > 0) {

			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		System.out.println(rev);
		if(rev == m) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}

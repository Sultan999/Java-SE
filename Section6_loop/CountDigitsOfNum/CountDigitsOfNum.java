package countdigitsofnum;
import java.util.*;

public class CountDigitsOfNum {

	public static void main(String[] args) {

		// Count digits of a number 

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number");
		n = scan.nextInt();

		int r;
		int sum = 0;
		int count = 0;

		while(n > 0) {

			r = n % 10;
			sum += r;
			n /=10;
			count++;

			System.out.println(count);

		}
		System.out.println(sum);
		System.out.println(count);

	}

}

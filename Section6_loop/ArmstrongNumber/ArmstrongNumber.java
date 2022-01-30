package armstrongnumber;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// Finding a number is Armstrong or not

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number: ");
		n = scan.nextInt();

		int m = n;
		int sum = 0;
		int r;

		while(n > 0) {

			r = n % 10;
			n /=10;

			sum += r * r * r;


		}
		if(m == sum) {
			System.out.println("Its an Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}

	}

}

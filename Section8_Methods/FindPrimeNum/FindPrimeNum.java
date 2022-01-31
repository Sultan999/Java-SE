package findprimenum;
import java.util.*;

public class FindPrimeNum {


	static boolean isPrime(int n) {

		for(int i = 2; i < n/2; i++) {

			if(n % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		// Find a Number is Prime

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Please Enter a number to check if it is a prime or not: ");
		num = scan.nextInt();

		if(isPrime(num) == true) {
			System.out.println("The number " + num + " is prime");
		}
		else {
			System.out.println("The number " + num + " is not prime");
		}



		scan.close();

	}

}

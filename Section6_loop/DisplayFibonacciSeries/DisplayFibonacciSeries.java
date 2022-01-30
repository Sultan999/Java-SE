package displayfibonacciseries;
import java.util.*;

public class DisplayFibonacciSeries {

	public static void main(String[] args) {


		// Display fibonacci series

		Scanner reader = new Scanner(System.in);

		int n;

		System.out.println("This program is for Fibonacci Series.");
		System.out.println("Please enter a term: ");
		n = reader.nextInt();


		int a = 0;
		int b = 1;
		int c;

		System.out.print(a + ", " + b + ", ");

		for(int i= 0; i < n-2; i++) {


			c = a + b;
			a = b;
			b = c;
			System.out.print(c + ", ");

		}

	}

}

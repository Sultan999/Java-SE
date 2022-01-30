package sumnumbers;
import java.util.*;

public class SumNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		System.out.println("Please enter a number");
		n = scan.nextInt();

		int sum = 0;

		for(int i = 1; i <= n; i++) {

			sum += i;

		}
		System.out.println("The sum of " + n + " is " + sum);


	}

}

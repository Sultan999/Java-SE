package evenorodd;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("Please enter a number ");

		int n;

		Scanner sc = new Scanner(System.in);

		n = (int) sc.nextFloat();

		if(n%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}


	}

}

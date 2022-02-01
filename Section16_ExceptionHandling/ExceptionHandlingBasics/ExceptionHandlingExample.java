package exceptionhandlingexample;

import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		

		try {
			int a;
			int b;
			int c;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter a Number: ");
			a = scan.nextInt();
			System.out.println("Enter a Number: ");
			b = scan.nextInt();
			
			c = a/b;
			System.out.println(c);
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("This input is wrong " + e);
		}
		System.out.println("Bye");

	}

}

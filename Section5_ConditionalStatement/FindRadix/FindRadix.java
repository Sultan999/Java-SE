package findradix;

import java.util.Scanner;

public class FindRadix {

	public static void main(String[] args) {

		// Find radix of a number given in a string

		Scanner scan = new Scanner(System.in);
		String num;

		System.out.println("Please enter a value");


		num = scan.nextLine();

		if(num.matches("[01]+")) {
			System.out.println("Binary Radix = 2");
		}
		else if(num.matches("[0-7]+")) {
			System.out.println("octal Radix = 8");
		}
		else if(num.matches("[0-9]+")) {
			System.out.println("Decimal Radix = 10");
		}
		else if(num.matches("[0-9A-F]+")) {
			System.out.println("Hex-Decimal Radix = 16");
		}
		else {
			System.out.println("Not a number");
		}



	}

}

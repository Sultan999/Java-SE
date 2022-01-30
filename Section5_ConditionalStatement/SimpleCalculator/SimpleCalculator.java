package simplecalculator;
import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2;
		String option;

		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.nextLine();

		System.out.println("Please enter one of these option (ADD, SUB, MUL, DIV)");
		option = scan.nextLine();
		option = option.toUpperCase();

		switch(option) {

			case "ADD": System.out.println("The result of adding " + num1 + " and " + num2 + " is " + (num1 + num2));
						break;

			case "SUB": System.out.println("The result of subtracting " + num1 + " and " + num2 + " is " + (num1 - num2));
						break;

			case "MUL": System.out.println("The result of multiplying " + num1 + " and " + num2 + " is " + (num1 * num2));
						break;

			case "DIV": System.out.println("The result of dividing " + num1 + " and " + num2 + " is " + (num1 / num2));
						break;

			default: System.out.println("The input is not valid");
					break;
		}



	}

}

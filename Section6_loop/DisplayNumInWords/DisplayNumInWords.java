package displaynuminwords;
import java.util.*;

public class DisplayNumInWords {

	public static void main(String[] args) {

		// Display a number in words even with tailing 0

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number: ");
		n = scan.nextInt();

		int r;
		String str = "";


		while(n > 0) {

			r = n % 10;
			str += r;
			n /= 10;

		}
		System.out.println(str);

		char c;

		for(int i = str.length()-1; i >= 0;i--) {

			c = str.charAt(i);

			switch(c) {
			case '0': System.out.print("Zero ");
					break;

			case '1': System.out.print("One ");
					break;

			case '2': System.out.print("Two ");
					break;

			case '3': System.out.print("Three ");
					break;

			case '4': System.out.print("Four ");
					break;

			case '5': System.out.print("Five ");
					break;

			case '6': System.out.print("six ");
					break;

			case '7': System.out.print("Seven ");
					break;

			case '8': System.out.print("Eight ");
					break;

			case '9': System.out.print("Nine ");
					break;

			default: System.out.println("Invalid input");
			}

		}



	}

}

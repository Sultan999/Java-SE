package displayapseries;
import java.util.*;

public class DisplayAPSeries {

	public static void main(String[] args) {

		// Display AP. Series

		Scanner scan = new Scanner(System.in);

		// Start point
		int s;
		// Common different
		int d;
		// Number of repeating
		int n;

		System.out.println("Please enter start point: ");
		s = scan.nextInt();

		System.out.println("Please enter common different: ");
		d = scan.nextInt();

		System.out.println("Please enter number of  repeating: ");
		n = scan.nextInt();

		int term = s;

		for(int i = 0; i <= n; i++) {



			System.out.println(term);
			term = term + d;

		}



	}

}

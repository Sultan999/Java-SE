package displaygpseries;
import java.util.*;

public class DisplayGPSeries {

	public static void main(String[] args) {

		// Display GP series

		Scanner reader = new Scanner(System.in);

		// Start point
		int s;
		// Common different
		int d;
		// Number of repeating
		int n;

		System.out.println("Please enter start point: ");
		s = reader.nextInt();

		System.out.println("Please enter common different: ");
		d = reader.nextInt();

		System.out.println("Please enter number of repeating: ");
		n = reader.nextInt();


		int term = s;

		for(int i = 0; i < n; i++) {

			System.out.print(term + ", ");
			term *= d;
		}
	}

}

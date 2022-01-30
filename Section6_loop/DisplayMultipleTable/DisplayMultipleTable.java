package displaymultipletable;
import java.util.*;

public class DisplayMultipleTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;

		System.out.println("Please enter a number");
		n = scan.nextInt();



		for(int i = 1; i <= 10; i++) {


			System.out.println(n + " X " + i + " = " + (n*i));

		}

	}

}

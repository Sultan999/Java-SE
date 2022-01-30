package searchingkey;
import java.util.*;
public class SearchingKey {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Sereach for an element of an array: ");
		int key = scan.nextInt();


		int A[] = {1, 9, 2, 8, 3, 7, 4};

		for(int i = 0; i < A.length; i++) {

			if(A[i] == key) {
				System.out.println("Element found at: " + i);
				System.exit(0);
			}
		}
		System.out.println("Number cannot found");

	}

}

package insertingelements;
import java.util.*;

public class InsertingElements {

	public static void main(String[] args) {

		// Inserting an element to an array

		Scanner scan = new Scanner(System.in);

		int sizeOfArray;

		System.out.println("Enter the size of an array between 1 to 10: ");
		sizeOfArray = scan.nextInt();

		int Array[] = new int[20];


		// it didn't work
		while(sizeOfArray > 10 && sizeOfArray < 1) {
			System.out.println("The size of array that you entered is invalid please enter a size of an array between 1 to 10: ");
			sizeOfArray = scan.nextInt();
		}

		System.out.println("Enter the elements of an array: ");

		for(int i = 0; i < sizeOfArray; i++) {

			Array[i] = scan.nextInt();
		}

		for(int i = 0; i < sizeOfArray; i++) {
			System.out.print(Array[i]);

			if(sizeOfArray <= i+1) {
				System.out.print(" ");
			}
			else {
				System.out.print(", ");
			}
		}




		int index;

		System.out.println("Select index number: ");
		index = scan.nextInt();

		System.out.println("Insert a number to the index: ");
		int x = scan.nextInt();

		for(int i = Array.length-1; i > index; i--) {

			Array[i] = Array[i-1];
		}

		Array[index] = x;

		for(int i = 0; i < Array.length; i++) {
//			if(Array[i] == 0) {
//				System.exit(0);
//			}
//			else {
//				System.out.print(Array[i]);
//			}


			if(Array.length <= i+1 || Array[i] == 0) {
				System.exit(0);
				System.out.print(Array[i]);
				System.out.print(" ");
			}
			else {
				System.out.print(Array[i]);
				System.out.print(", ");
			}
		}

	}

}

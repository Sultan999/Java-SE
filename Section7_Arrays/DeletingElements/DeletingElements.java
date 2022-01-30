package deletingelements;
import java.util.*;
public class DeletingElements {

	public static void main(String[] args) {

		// Deleting an element form an array

		Scanner scan = new Scanner(System.in);

		int sizeOfArray;

		System.out.println("Enter the size of an array: ");
		sizeOfArray = scan.nextInt();

		int Array[] = new int[sizeOfArray];



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




		int deleteIndex;

		System.out.println("Select index number: ");
		deleteIndex = scan.nextInt();



		for(int i = deleteIndex; i < sizeOfArray-1; i++) {


			Array[i] = Array[i+1];
		}



		for(int i = 0; i < Array.length-1; i++) {
//			if(Array[i] == 0) {
//				System.exit(0);
//			}
//			else {
//				System.out.print(Array[i]);
//			}


			if(Array.length <= i+1|| Array[i] == 0) {
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

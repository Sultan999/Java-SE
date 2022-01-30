package sumofelements;
import java.util.*;

public class SumOfElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sizeOfArray;

		System.out.println("Please enter the size of array: ");
		sizeOfArray = scan.nextInt();

		int array[] = new int[sizeOfArray];




		System.out.println("Enter the elements of the array: ");

		for(int i = 0; i < array.length; i++) {

			array[i]=scan.nextInt();


		}



		for(int i = 0; i < array.length; i++) {

			System.out.print(array[i]);

			if(array.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}



		int sum = 0;

		for(int x: array) {
			sum += x;
		}
//		for(int i = 0; i < array.length; i++) {
//
//			sum += array[i];
//		}
		System.out.println("");

		System.out.println("Sum of array elements is: " + sum);



	}

}

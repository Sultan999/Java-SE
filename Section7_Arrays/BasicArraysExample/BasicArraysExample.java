package basicarraysexample;

public class BasicArraysExample {

	public static void main(String[] args) {

		int A[] = new int[10];

		int B[] = {2, 3, 6, 7, 8};

		int C[];
		C = new int[5];

		//int []D = new int [7];

		B[2] = 12;

		// If I want to increase the array
//		for(int i = 0; i < B.length; i++) {
//
//			System.out.print(B[i]++ + ", ");
//		}
		

		// For each loop
		for(int x: B) {

			System.out.print(x + ", ");
		}

	}

}

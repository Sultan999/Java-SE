package basictwodimarray;

public class BasicTwoDimArray {

	public static void main(String[] args) {


		// Initialize an Array
		//int Array[][] = new int[3][4];

		// Another way of initializing an Array
		//int Array1[][];
		//Array1 = new int[3][4];

		// A is one Dimensional and B is two Dimensional
		int[] A, B[];
		A = new int[5];
		B = new int[3][];

		// Initialize an Array
		int Array[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};


		// Array.length is for number of row
		for(int i = 0; i < Array.length; i++) {

			// Array[i] or Array[0] is a number of columns
			for(int j = 0; j < Array[i].length; j++) {

				System.out.print(Array[i][j]);

				if(Array[i].length <= j+1) {
					System.out.print("");
				}
				else {
					System.out.print(", ");
				}
			}
			System.out.println("");


		}

		System.out.println("\n\n");

		int Array2[][] = {{4,3,2,1}, {8,7,6,5}, {12,11,10,9}};

		// Using foreach loop
		for(int x[]: Array2) {

			for(int y: x) {
				System.out.print(y + " ");
			}
			System.out.println("");
		}


		// How to create Jagged Array which means that array with different sizes
		int Array3[][];
		// This create 3 rows
		Array3 = new int[3][];

		// This create columns of different sizes
		Array3[0] = new int[4];
		Array3[1] = new int[3];
		Array3[2] = new int[6];






	}

}

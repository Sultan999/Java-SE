package multiplytwodimarray;

public class MultiplyTwoDimArray {

	public static void main(String[] args) {

		// Multiply two of 2 Dimensional arrays as matrix

		// First things you have to know is that it must the first 2-D array columns equal to second 2-D array row
		// 3*3 first 3 is row and second 3 is column

		int Array1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int Array2[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
		int Array3[][] = new int[3][3];

		for(int i = 0; i < Array1.length; i++) {

			for(int j = 0; j < Array1[i].length; j++) {

				Array3[i][j] = 0;

				for(int k = 0; k < Array1[0].length; k++) {

					Array3[i][j] = Array3[i][j] + Array1[i][k] * Array2[k][j];
				}
			}
		}

		for(int i = 0; i < Array3.length; i++) {

			for(int j = 0; j < Array3[i].length; j++) {

				System.out.print(Array3[i][j]);

				if(Array3[i].length <= j+1) {
					System.out.print("");
				}
				else {
					System.out.print(", ");
				}
			}
			System.out.println("");
		}

	}

}

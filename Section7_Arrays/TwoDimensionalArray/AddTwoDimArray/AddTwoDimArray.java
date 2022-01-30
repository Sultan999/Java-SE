package addtwodimarray;

public class AddTwoDimArray {

	public static void main(String[] args) {

		// Add tow of 2 dimensional arrays

		int Array1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int Array2[][] = {{3,2,1}, {6,5,4}, {9,8,7}};
		int Array3[][] = new int[3][3];

		for(int i = 0; i < Array1.length; i++) {

			for(int j = 0; j < Array1[i].length; j++) {

				Array3[i][j] = Array1[i][j] + Array2[i][j];

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

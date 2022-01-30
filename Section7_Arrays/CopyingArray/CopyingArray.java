package copyingarray;

public class CopyingArray {

	public static void main(String[] args) {

		// Copying an Array

		int Array1[] = {2, 4, 6, 8, 10};
		int Array2[] = new int[5];

		for(int i = 0; i < Array1.length; i++) {

			Array2[i] = Array1[i];

		}

		for(int i = 0; i < Array2.length; i++) {

			System.out.print(Array2[i]);

			if(Array2.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}

	}

}

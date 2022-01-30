package reversecopyingarray;

public class ReverseCopyingArray {

	public static void main(String[] args) {


		// Reverse Copying an Array

		int Array1[] = {2, 4, 6, 8, 10, 12, 14, 16};

		int Array2[] = new int[8];

		//int index = 0;
		for(int i = Array1.length-1, j = 0; i >= 0; i--, j++) {

			Array2[j] = Array1[i];
			//count++;
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

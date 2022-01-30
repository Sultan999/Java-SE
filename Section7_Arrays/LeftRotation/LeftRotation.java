package leftrotation;

public class LeftRotation {

	public static void main(String[] args) {

		// Left rotation an Array

		int Array[] = {9, 4, 6, 12, 7, 34, 23, 8};


		for(int i = 0; i < Array.length; i++) {

			System.out.print(Array[i]);

			if(Array.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}

		int temp = Array[0];

		for(int i = 1; i < Array.length; i++) {

			Array[i - 1] = Array[i];




		}

		Array[Array.length-1] = temp;

		for(int i = 0; i < Array.length; i++) {

			System.out.print(Array[i]);

			if(Array.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}



	}

}

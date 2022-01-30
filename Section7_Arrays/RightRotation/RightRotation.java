package rightrotation;

public class RightRotation {

	public static void main(String[] args) {

		// Right rotation an Array

		int Array[] = {2, 4, 19, 12, 3, 6, 11};

		int temp = Array[Array.length-1];


		for(int i = Array.length-1; i > 0; i--) {

			Array[i] = Array[i-1];
		}

		Array[0] = temp;

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

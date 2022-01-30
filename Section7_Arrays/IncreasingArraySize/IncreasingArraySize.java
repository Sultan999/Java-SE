package increasingarraysize;

public class IncreasingArraySize {

	public static void main(String[] args) {

		// Increasing an Array size

		int Array1[] = {2, 4, 6, 8, 10};

		int Array2[] = new int[2 * Array1.length];

		for(int i = 0; i < Array1.length; i++) {

			Array2[i] = Array1[i];

		}

		Array1 = Array2;

		Array2 = null;

		for(int i = 0; i < Array1.length; i++) {

			System.out.print(Array1[i]);

			if(Array1.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}
		System.out.println("");

		System.out.println(Array1.length);



	}

}

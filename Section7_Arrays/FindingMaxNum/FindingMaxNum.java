package findingmaxnum;

public class FindingMaxNum {

	public static void main(String[] args) {


		int Array[] = {4, 5, 12, 20, 40, 5, 2};

		int max = Array[0];

		for(int i = 0; i < Array.length; i++) {


			if(Array[i] > max) {

				max = Array[i];
			}

		}

		System.out.println("The max number is: " + max);

	}

}

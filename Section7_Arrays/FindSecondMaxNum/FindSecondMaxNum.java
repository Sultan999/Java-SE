package findsecondmaxnum;

public class FindSecondMaxNum {

	public static void main(String[] args) {


		int Array[] = {14, 3, 12, 16, 4, 67, 33, 6, 44, 23};


		int max = Array[0];
		int secondMax = Array[0];
		for(int i = 0; i < Array.length; i++) {

			if(max < Array[i]) {

				secondMax = max;
				max = Array[i];
			}
			else if(Array[i] > secondMax) {

				secondMax = Array[i];
			}


		}

		System.out.println("The maximum element is: " + max + " The second largest element is: " + secondMax);

	}

}

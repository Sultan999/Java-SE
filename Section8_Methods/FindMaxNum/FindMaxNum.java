package findmaxnum;
import java.util.*;

public class FindMaxNum {


	int max(int Array[]) {

		int result = Array[0];

		for(int i = 0; i < Array.length; i++) {

			if(result < Array[i]) {
				result = Array[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {

		MethodsPractice3 mp = new MethodsPractice3();

		Scanner reader = new Scanner(System.in);

		int A[] = new int[5];

		System.out.println("Enter 5 elements of an array: ");

		for(int i = 0; i < A.length; i++) {

			A[i] = reader.nextInt();
		}

		int result;

		result = mp.max(A);

		System.out.println("The maximum number of the array is: " + result);



		reader.close();

	}

}

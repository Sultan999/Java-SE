package reversenumberandarray;
import java.util.*;

public class ReverseNumberAndArray {

//	void reverse(int Array[]) {
//
//
//
//	int Array1[] = new int[5];
//	for(int i = Array.length-1, j = 0; i >= 0; i--, j++) {
//
//		Array1[j] = Array[i];
//
//	}
//
//	for(int i = 0; i < Array1.length; i++) {
//
//		if(Array1[i] == 0)
//			System.exit(0);
//		else
//			System.out.print(Array1[i]);
//
//
//		if(Array1.length <= i+1) {
//			System.out.print("");
//		}
//		else {
//			System.out.print(", ");
//		}
//	}
//
//}


	int reverse(int num) {

		int r;
		int j = 10;
		int rev = 0;

		while(num != 0) {

			r = num % j;
			rev = rev * j + r;
			num /= j;

		}

		return rev;
	}



	int[] reverse(int Array[]) {



		int Array1[] = new int[Array.length];
		for(int i = Array.length-1, j = 0; i >= 0; i--, j++) {

			Array1[j] = Array[i];

		}


		return Array1;


	}

	public static void main(String[] args) {

		MethodsPractice2 mp = new MethodsPractice2();

		Scanner scan = new Scanner(System.in);

		int A[] = new int[5];
		int B[] = new int [5];

		String option;
		int n, rev;

		System.out.println("1. Reverse a Number");
		System.out.println("2. Reverse an Array");
		System.out.println("Enter one of the option above: ");
		option = scan.nextLine();

		if(option.equals("1")) {

			System.out.println("Enter a number: ");
			n = scan.nextInt();

			rev = mp.reverse(n);

			System.out.println("The number that enterd is: " + n + "\nThe reverse of the number is: " + rev);

		}
		else if(option.equals("2")) {



			System.out.println("Enter elements for an array of size 5: ");

			for(int i = 0; i < A.length; i++) {
				A[i] = scan.nextInt();
			}

			B = mp.reverse(A);

			for(int i = 0; i < B.length; i++) {

				System.out.print(B[i]);

				if(B.length <= i+1) {
					System.out.print("");
				}
				else {
					System.out.print(", ");
				}

			}


		}


		scan.close();
	}

}

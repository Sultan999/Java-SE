package NestedTryCatch;

public class NestedTryCatch {

	public static void main(String[] args) {

		try {

			int A[] = {2,5,0,4,2,9};

			try {

				int r = A[0]/A[2];

				System.out.println(r);

			}catch (ArithmeticException e) {

				System.out.println(e);
			}

			System.out.println(A[10]);

		}catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}



		// int A[]={30,20,10,40,0};
		//
    //     try
    //     {
    //         int c=A[0]/A[4];
    //         System.out.println("Division is "+c);
		//
    //         try
    //         {
    //             System.out.println(A[5]);
    //         }
    //         catch(ArrayIndexOutOfBoundsException e)
    //         {
    //             System.out.println("Index is Invalid");
    //         }
		//
    //     }
    //     catch(ArithmeticException e)
    //     {
    //         System.out.println("Denominator should not be 0");
    //     }
		//
    //     System.out.println("Bye");

    	}

	}

}

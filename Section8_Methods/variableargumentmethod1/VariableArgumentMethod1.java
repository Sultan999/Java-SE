package variableargumentmethod1;
import java.util.*;

public class VariableArgumentMethod1 {
	
	static int max(int ...Array) {
		
		int m = Array[0];
		
		if(Array.length == 0) {
			return Integer.MIN_VALUE;
		}
		else {
			for(int i = 0; i < Array.length; i++) {
				
				if(m < Array[i]) {
					m = Array[i];
				}
			}
		}
		
		return m;
	}

	public static void main(String[] args) {
		
		
		max();
		max(10, 12, 2, 20, 4, 5, 30);
		Scanner scan = new Scanner(System.in);
		
		int A[] = new int[5];
		
		int result;
		
		System.out.println("Enter 5 elements of an Array: ");
		
		for(int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		
		result = max(A);
		
		System.out.println("The maximum element of an array is: " + result);
		
		
		scan.close();
	}

}

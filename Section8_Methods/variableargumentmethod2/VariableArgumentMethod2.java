package variableargumentmethod2;
import java.util.*;

public class VariableArgumentMethod2 {
	
	static int sum(int ...Array) {
		
		int s = 0;
		for(int i = 0; i < Array.length; i++) {
			
			s += Array[i];
		}
		return s;
	}

	public static void main(String[] args) {
		
		
		sum();
		sum(10, 10, 10);
		
		Scanner reader = new Scanner(System.in);
		
		int num[] = new int[5];
		int result;
		
		System.out.println("Enter 5 element numbers of an array: ");
		
		for(int i = 0; i < num.length; i++) {
			num[i] = reader.nextInt();
		}
		
		result = sum(num);
		
		System.out.println("The sum of all elements of an array is: " + result);
		
		
		reader.close();
	}
	
	

}

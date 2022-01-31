package variableargumentmethod3;
import java.util.*;

public class VariableArgumentMethod3 {
	
	static double discount(double ...Price) {
		
		int p = 0;
		for(int i = 0; i < Price.length; i++) {
			
			p += Price[i];
		}
		
		return p;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of items: ");
		int numOfItem = scan.nextInt();
		
		double P[] = new double[numOfItem];
		
		double totalPrice;
		
		System.out.println("Enter the price of each items: ");
		
		for(int i = 0; i < P.length; i++) {
			P[i] = scan.nextDouble();
		}
		
		totalPrice = discount(P);
		
		double dis;
		double result;
		if(totalPrice <= 500) {
			dis = 0.10 * totalPrice;
			result = totalPrice - dis;
			System.out.println("Your total price is: " + totalPrice + " and after 10% discount is: " + result);
		}
		else if(totalPrice > 500 && totalPrice <= 1000) {
			dis = 0.15 * totalPrice;
			result = totalPrice - dis;
			System.out.println("Your total price is: " + totalPrice + " and after 15% discount is: " + result);
		}
		else if(totalPrice > 1000) {
			dis = 0.20 * totalPrice;
			result = totalPrice - dis;
			System.out.println("Your total price is: " + totalPrice + " and after 20% discount is: " + result);
		}
		
		scan.close();

	}

}

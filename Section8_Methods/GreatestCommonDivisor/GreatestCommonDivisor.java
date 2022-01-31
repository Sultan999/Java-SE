package greatestcommondivisor;
import java.util.*;

public class GreatestCommonDivisor {

	// The greatest common divisor (GCD), also called the greatest common factor,
	// of two numbers is the largest number that divides them both. For instance,
	// the greatest common factor of 20 and 15 is 5, since 5 divides both 20 and 15
	// and no larger number has this property. The concept is easily extended to sets
	// of more than two numbers: the GCD of a set of numbers is the largest number dividing each of them.

	int gcd(int num1, int num2) {

		while(num1 != num2 && num1 < 1 && num2 < 1) {
			if(num1 > num2) {
				num1 = num1 - num2;
			}
			else if(num2 > num1) {
				num2 = num2 - num1;
			}
		}
		int result;
		if(num1 == num2) {
			result = num1;
		}
		else {
			result = 0;
		}

		return result;
	}

	public static void main(String[] args) {

		int n1, n2, result;

		MethodsPractice2 mp = new MethodsPractice2();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		n1 = scan.nextInt();

		System.out.println("Enter scond number: ");
		n2 = scan.nextInt();

		result = mp.gcd(n1, n2);

		if(result >= 1) {
			System.out.println("The greatest common divisor is " + result);
		}
		else {
			System.out.println("invalid");
		}

		scan.close();



	}

}

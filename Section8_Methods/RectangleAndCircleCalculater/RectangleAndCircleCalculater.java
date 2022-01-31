package rectangleandcirclecalculater;
import java.util.*;

public class RectangleAndCircleCalculater {

	// Calculate Rectangle Area
	double area(double length, double width) {

		// formula of calculating rectangle area is: area = Length * width
		double a;
		a = length * width;

		return a;
	}

	// Calculate circle area
	double area(double radius) {

		// Formula of calculating circle area is: area = pi * radius^2
		double a;
		a = Math.PI * radius * radius;

		return a;
	}

	public static void main(String[] args) {

		MethodsPractice1 mp = new MethodsPractice1();
		Scanner scan = new Scanner(System.in);

		String option;

		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("Enter the name of a shap to calculate its area: ");
		option = scan.nextLine();
		option = option.toLowerCase();

		double l, d, a, r, a1;

		if(option.equals("rectangle")) {

			System.out.println("Enter a Length of a Rectangle: ");
			l = scan.nextDouble();

			System.out.println("Enter the width of a Rectangle: ");
			d = scan.nextDouble();


			a = mp.area(l, d);

			System.out.println("The area of the Rectangle is: " + a);

		}
		else if(option.equals("circle")) {

			System.out.println("Enter a radius of a Circle: ");
			r = scan.nextDouble();

			a1 = mp.area(r);

			System.out.println("The area of the Circle is: " + a1);
		}
		else {
			System.out.println("Invalid input");
		}


		scan.close();


	}

}

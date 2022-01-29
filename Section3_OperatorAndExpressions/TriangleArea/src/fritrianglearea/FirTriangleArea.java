package fritrianglearea;

import java.util.Scanner;

public class FirTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter three sides of a triangle");
		
		int a, b, c;
		float s;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		s = (a + b + c)/2f; // I also can write it as (float)(a + b + c)/2;
		
		area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
		
		System.out.println("Area is " + area);
		
		

	}

}

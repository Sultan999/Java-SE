package trianglearea;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please Enter the base and hight of the a triangle ");
		
		float b, h, a;
		
		Scanner sc = new Scanner(System.in);
		
		b = sc.nextFloat();
		h = sc.nextFloat();
		
		a = (b*h)/2;
		
		System.out.println("Area of the triangle is " + a);
		
	

	}

}

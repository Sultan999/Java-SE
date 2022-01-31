package circle1;


class Circle{
	
	public double ridous;
	
	public double area() {
		
		double a;
		
		a = Math.PI * ridous * ridous;
		
		return a;
	}
	
	public double perimeter() {
		
		double p;
		
		p = 2 * Math.PI * ridous;
		
		return p;
	}
	
	public double circumference() {
		
		return perimeter();
	}
}

public class Circle1 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.ridous = 7;
		
		double a, p, p1;
		
		a = c1.area();
		
		p = c1.perimeter();
		
		p1 = c1.circumference();
		
		System.out.println("The area of the Circle is: " + a);
		System.out.println("The perimeter of the Circle is: " + p);
		System.out.println("The circumference of the Circle is: " + p1);
		
		
		

	}

}

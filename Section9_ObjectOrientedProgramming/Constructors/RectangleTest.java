package rectangletest;

class Rectangle{
	
	private double length;
	private double breadth;
	
	
	public Rectangle() {
		
		length = 1;
		breadth = 1;
	}
	
	public Rectangle(double l, double b) {
		
//		length = l;
//		breadth = b;
		
		setLength(l);
		setBreadth(b);
	}
	
	public Rectangle(double s) {
		
		length = breadth = s;
	}
	
	public double getLength() {
		
		return length;
	}
	
	public double getBreadth() {
		
		return breadth;
	}
	
	public void setLength(double l) {
		
		length = l;
	}
	
	public void setBreadth(double b) {
		
		breadth = b;
	}
	
	public double area() {
		
		double a;
		//a = length * breadth;
		a = getLength() * getBreadth();
		return a;
	}
	
	public double perimeter() {
		
		double p;
		p = 2 * (length + breadth);
		return p;
	}
	
	public boolean isSquare() {
		
		return length == breadth? true: false;
	}
	
	
}

public class RectangleTest {

	public static void main(String[] args) {
		
		// if I want to set values directly 
//		Rectangle r = new Rectangle(10, 5);
//		Rectangle r1 = new Rectangle(10);
		
		
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(5);
		
		r.setLength(15);
		r.setBreadth(20);
		
		System.out.println("The area of a rectangle is " + r.area());
		System.out.println("The perimeter of a rectangle is: " + r.perimeter());
		
		if(r.isSquare() == true) {
			System.out.println("The values of breadth and length are equal");
		}
		else {
			System.out.println("The valuse of breadth and length are not equals");
		}
		
		System.out.println("The value of length: " + r.getLength());
		System.out.println("The value of breadth: " + r.getBreadth());
		r1.getBreadth();
		
		System.out.println("");
		System.out.println(r1.area());
		System.out.println(r2.area());
		

		if(r2.isSquare() == true) {
			System.out.println("The values of breadth and length are equal");
		}
		else {
			System.out.println("The valuse of breadth and length are not equals");
		}
		
		

	}

}








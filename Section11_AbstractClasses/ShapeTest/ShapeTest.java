package shapetest;

abstract class Shape{
	
	abstract public double perimeter();
	abstract public double area();
}

class Circle extends Shape{
	
	public double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double radius) {
		if(this.radius < 0)
			System.out.println("This is invalid input");
		else
			this.radius = radius;
	}
	
	@Override
	public double area() {
		
		double a;
		a = Math.PI * radius * radius;
		return a;
	}
	@Override
	public double perimeter() {
		double p;
		p = 2 * Math.PI * radius;
		return p;
	}
}

class Rectangle extends Shape{
	public double length;
	public double breadth;
	
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	
	public void setLength(double l) {
		this.length = l;
	}
	public void setBreadth(double b) {
		this.breadth = b;
	}
	
	public Rectangle() {
		length = 1;
		breadth = 1;
	}
	
	public Rectangle(double l, double b) {
		if(this.length < 0 || this.breadth < 0) {
			System.out.println("Your input is invalid");
		}
		else
			this.length = l; this.breadth = b;
	}
	
	@Override
	public double area() {
		double a;
		a = length * breadth;
		return a;
	}
	@Override
	public double perimeter() {
		double p;
		p = 2 * (length * breadth);
		return p;
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(5);
		c.area();
		System.out.println("The area of a Circle is: " + c.area());
		System.out.println("The parimeter of a Circle is: " + c.perimeter() + "\n");
	
//		Shape s1 = new Circle();
//		//s1.radius = 5;
//		s1.area();
//		System.out.println("area" + s1.area());
		
//		Shape s;
//		System.out.println(s.area());
		
		Rectangle r = new Rectangle();
		r.length = 4;
		r.breadth = 5;
		System.out.println("The area of a Rectangle is: " + r.area());
		System.out.println("The perimeter of a Rectangle is: " + r.perimeter());
		

	}

}

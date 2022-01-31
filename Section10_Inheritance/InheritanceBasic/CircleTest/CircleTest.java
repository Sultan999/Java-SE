package circletest;

class Circle{
	
	public double radius;
	
	public double area() {
		double a;
		
		a = Math.PI * radius * radius;
		return a;
	}
	
	public double perimeter() {
		double p;
		p = 2 * Math.PI * radius;
		return p;
	}
	
	public double circumference(){
        return perimeter();
    }
	
	
}

class Cylinder extends Circle{
	
	public double height;
	
	public double volume() {
		double v;
		v = area() * height;
		return v;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		

		Cylinder c = new Cylinder();
		
		c.radius = 10;
		c.height = 5;
		
		System.out.println("Volume: " + c.volume());
		System.out.println("Area: " + c.area());

	}

}

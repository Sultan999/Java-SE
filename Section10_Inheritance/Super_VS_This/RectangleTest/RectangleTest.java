package rectangletest;

class Rectangle{
	
	private float length;
	private float breadth;
	
	public Rectangle() {
		length = 1;
		breadth = 1;
	}
	public Rectangle(float l, float b) {
		
		this.length = l;
		this.breadth = b;
	}
	
	public float getLength() {
		return length;
	}
	public float getBreadth() {
		return breadth;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public float area() {
		float a;
		a = length * breadth;
		return a;
	}
	public float perimeter() {
		float p;
		p = 2 * (length * breadth);
		return p;
	}
}

class Cuboid extends Rectangle{
	
	private float height;
	
	public Cuboid() {
		height = 1;
	}
	
	public Cuboid(float h) {
		this.height = h;
	}
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float h) {
		this.height = h;
	}
	
	
	public float area() {
		float a;
		a = getLength() * getBreadth() * height;
		return a;
	}
	
	
	
	
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Cuboid c = new Cuboid();
		c.setLength(5);
		c.setBreadth(5);
		c.setHeight(5);
		c.area();
		System.out.println(c.area());

	}

}

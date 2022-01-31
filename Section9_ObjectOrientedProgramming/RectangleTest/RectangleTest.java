package rectangletest;

class Rectangle{
	
	private int length;
	private int breadth;
	
	public int getLength() {
		
		return length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setLength(int l) {
		
		if(l >= 0) {
			length = l;
		}
		else {
			length = 0;
		}
		
	}
	
	public void setBreadth(int b) {
		
		if(b >= 0) {
			breadth = b;
		}
		else {
			breadth = 0;
		}
		
	}
	
	public int area() {
		
		int a;
		a = length * breadth;
		return a;
	}
	
	public int perimeter() {
		int p;
		
		p = 2 * (length + breadth);
		return p;
	}
	
	public boolean isSquare() {
		
		if(length == breadth) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setLength(5);
		r.setBreadth(5);
		
		System.out.println("The Area of a Rectangle is: " + r.area());
		System.out.println("The Perimeter of a Rectangle is: " + r.perimeter());
		
		if(r.isSquare() == true) {
			System.out.println("The length and breadth are having the same number");
		}
		else {
			System.out.println("The length don't have the same number as breadth");
		}
		
		
		

	}

}

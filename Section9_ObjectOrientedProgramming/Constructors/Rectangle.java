package rectangle;

class Rectangle1{
	
	public int length;
	public int breadth;
	
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

public class Rectangle {

	public static void main(String[] args) {
		
		Rectangle1 r1 = new Rectangle1();
		
		r1.length = 5;
		r1.breadth = 5;
		
		int a, b;
		
		a = r1.area();
		b = r1.perimeter();
		
		
		
		System.out.println("The area of the Rectangle is: " + a);
		System.out.println("The perimeter of the Rectangle is: " + b);
		
		if(r1.isSquare() == true) {
			
			System.out.println("The length and breadth are having the same number");
		}
		else {
			System.out.println("The length don't have the same number as breadth");
		}
		
		

	}

}

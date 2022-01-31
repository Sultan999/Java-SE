package rectangletest1;

class Rectangle{
	
	int length;
	int breadth;
	int x = 10;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
}

class Cuboid extends Rectangle{
	
	int height;
	int x = 20;
	Cuboid(int l, int b, int h){
		super(l,b);
		height = h;
	}
	
	int volume()
    {
        return length*breadth*height;
    }
	
	void display() {
		System.out.println("The Rectangle class: " + super.x);
		System.out.println("The Cuboid class " + x);
	}
}

public class RectangeTest1 {

	public static void main(String[] args) {
		
		Cuboid c = new Cuboid(5,5,5);
		
		c.volume();
		System.out.println(c.volume());
		c.display();
		

	}

}

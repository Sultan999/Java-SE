package staticpractice;

class Test{
	
	static int x = 10;
	int y = 15;
	
	public void show() {
		System.out.println("X is: " + x + " and Y is: " + y);
	}
	static public void display() {
		System.out.println("X is: " + x);
	}
}

public class StaticPractice {

	public static void main(String[] args) {
		

		Test t1 = new Test();
		t1.show();
		t1.display();
		t1.x = 30;
		t1.y = 50;
		
		System.out.println("");
		t1.show();
		Test.display();
		System.out.println("");
		
		Test t2 = new Test();
		t2.show();
		Test.display();

	}

}

package overriding;

class Super{
	
	public void display() {
		System.out.println("This is Super class");
	}
}

class Sub extends Super{
	@Override
	public void display() {
		System.out.println("This is sub class");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Super sup = new Super();
		sup.display();
		
		Sub s = new Sub();
		s.display();
		
		Super sup1 = new Sub();
		sup1.display();
	}
	
	

}

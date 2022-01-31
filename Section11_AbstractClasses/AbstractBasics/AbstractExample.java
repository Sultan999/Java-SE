package abstractexample;

abstract class Super{
	
	public Super() {
		System.out.println("This is Super Class");
	}
	
	public void math1() {
		System.out.println("This is math1 in Super class");
	}
	
	abstract public void math2();
}

class Sub extends Super{
	
	public Sub() {
		System.out.println("Hello");
	}
	
	public void math2() {
		System.out.println("This is math2 in Sub class");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		
		Super s = new Sub();
		
		s.math2();
		s.math1();
		
		System.out.println("");
		Sub s1 = new Sub();
		
		s1.math1();
		s1.math2();
		

	}

}

package interfaceexample1;

interface Test{
	
	int X1 = 12;
	final static int X = 10;
	
	public void math1();
	void math2();
	public abstract void math3();
	
	public static void math4() {
		System.out.println("Math4 Test");
	}
	
	default void math5() {
		System.out.println("Math5 Test");
	}
	
	private void math7() {
		System.out.println("This is Math7 test");
	}
	default void math7Test() {
		math7();
	}
}

interface Test1 extends Test{
	
	public void math6();
}

class My implements Test1{
	public void math1() {}
	public void math2() {}
	public void math3() {}
	public void math6() {}
}



public class InterfaceExample1 {

	public static void main(String[] args) {
		
		System.out.println(Test.X);
		System.out.println(Test.X1);
		Test.math4();
		
		My m = new My();
		m.math5();
		m.math7Test();

	}

}

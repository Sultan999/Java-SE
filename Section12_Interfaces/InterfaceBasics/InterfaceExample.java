package interfaceexample;

interface Test1{
	
	void math1();
	void math2();
	
}

class Test2 implements Test1{
	
	@Override
	public void math1() {
		System.out.println("This is math1 for Test2");
	}
	@Override
	public void math2() {
		System.out.println("This is math2 for Test2");
	}
	public void math3() {
		System.out.println("This is math3 for Test3");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Test1 t = new Test2();
		t.math1();
		t.math2();
		
		System.out.println("");
		
		Test2 t1 = new Test2();
		t1.math1();
		t1.math2();
		t1.math3();

	}

}

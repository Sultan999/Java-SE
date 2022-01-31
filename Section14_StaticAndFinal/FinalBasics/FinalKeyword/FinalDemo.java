package finaldemo;

class Test{
	
	public final void show() {
		System.out.println("Hello");
	}
}

class Test1 extends Test{
	
	// Can't override the method of final
//	public void show() {
//		
//	}
}


public class FinalDemo {
	
	static final int MAX = 5;
	final float PI;
	
	public FinalDemo() {
		PI = 3.1425f;
	}

	public static void main(String[] args) {
		
		final double PI;
		PI = 3.1425d;
		
		System.out.println(PI + " " + MAX);

	}

}

package staticpractice2;

class Test{
	
	static {
		System.out.println("This is static block 1");
	}
	
	static {
		System.out.println("This is static block 2");
	}
}

public class StaticPractice2 {
	
	static {
		System.out.println("This is static block 1 in the main class");
	}

	public static void main(String[] args) {
		
		System.out.println("main");

		Test t = new Test();
		
		

	}
	
	static {
		System.out.println("This is static block 2 in the main class");
	}

}

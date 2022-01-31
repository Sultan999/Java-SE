package basicmethodsexample;

public class BasicMethodsExample {

//	static int max(int x, int y) {
//		if(x > y) {
//			return x;
//		}
//		else {
//			return y;
//		}
//	}

	static void inc(int x) {
		x++;
		System.out.println(x);
	}

	public static void main(String[] args) {

		int a = 10, b = 15, c;

		// another way of calling a methods
		//MethodsPractice mp = new MethodsPractice();

		//c = mp.max(a,b);

		//c = max(a,b);

		inc(a);

		System.out.println(a);

	}

}

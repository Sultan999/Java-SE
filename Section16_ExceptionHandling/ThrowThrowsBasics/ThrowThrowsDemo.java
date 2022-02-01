package throwthrowsdemo;

class NegativeDimensionException extends Exception{

	public String toString() {
		return "Dimension of a Rectange cannot be negative";
	}
}

public class ThrowThrowsDemo {
	
	static int area(int l, int b)throws NegativeDimensionException{
		
		if(l < 0 || b < 0) {
			throw new NegativeDimensionException();
		}
		return l*b;
	}
	
	static void math() throws NegativeDimensionException{
		
		System.out.println("Area is: " + area(5,-10));
	}

	public static void main(String[] args) {
		try {
			math();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Bye");

	}

}

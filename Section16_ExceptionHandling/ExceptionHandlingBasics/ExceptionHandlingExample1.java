package exceptionhandlingexample1;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		
		try {
			
		
		int Array[] = {10,1,3,4,7};
		
		int r;
		
		r = Array[0]/Array[1];
		
		System.out.println(r);
		
		System.out.println(Array[10]);
		
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Bye");
		
	}

}

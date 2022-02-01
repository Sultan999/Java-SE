package genericmethod;

interface A{
	
}
class B implements A{
	
}
class C implements A{
	
}

class MyArray<T>{
	
	@SuppressWarnings("unchecked")
	T Array[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T v) {
		Array[length++] = v;
	}
	
	public void display() {
		for(int i = 0; i < length; i++) {
			System.out.println(Array[i]);
		}
	}
}

public class GenericMethod {
	
	static <E> void show(E[] list) {
		for(E x: list) {
			System.out.println(x);
		}
	}
	
	@SafeVarargs
	static <E1> void display(E1... list) {
		for(E1 x: list) {
			System.out.println(x);
		}
	}
	
	@SafeVarargs
	static <E2 extends Number> void display1(E2... list) {
		for(E2 x: list) {
			System.out.println(x);
		}
	}
	
	@SafeVarargs
	static <E3 extends String> void display2(E3... list) {
		for(E3 x: list) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
		show(new String[] {"Hi", "Go", "bye"});
		show(new Integer[] {10, 12, 15});
		
		
		display(new Float[] {12.3f, 5.34f, 21.78f});
		display("Hello", "Welcome");
		display(10, 4, 56);
		
		display1(12.4, 12, 123);
		
		display2("Sultan", "Hasen");
		
		

	}

}

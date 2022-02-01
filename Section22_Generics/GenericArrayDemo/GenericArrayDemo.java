package genericarraydemo;


//@SuppressWarnings("unchecked")
class MyArray<T>{
	
	@SuppressWarnings("unchecked")
	T A[] = (T[]) new Object[10]; 
	int length = 0;
	
	public void append(T v) {
		A[length++] = v;
	}
	
	public void display() {
		for(int i = 0; i < length; i++) {
			System.out.println(A[i]);
		}
	}
}

public class GenericArrayDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		MyArray<Integer> m = new MyArray<>();
		MyArray<String> m1 = new MyArray<>();
		
		m.append(10);
		m.append(new Integer(20));
		m.append(15);
		
		m1.append("Hi");
		m1.append(new String("Welcome"));
		m1.append("bye");
		
		m.display();
		m1.display();

	}

}

package genericnoparameters;

class MyArray<T>{
	
	@SuppressWarnings("unchecked")
	T Array[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T value) {
		Array[length++] = value;
	}
	
	public void show() {
		for(int i = 0; i < length; i++) {
			System.out.println(Array[i]);
		}
	}
}

public class GenericNoParameters {

	public static void main(String[] args) {
		
		// If parameters not given it will become an Object
		MyArray m = new MyArray();
		
		m.append(10);
		m.append(new Integer(5));
		
		m.append("Hi");
		m.append(new String("bye"));
		
		m.show();

	}

}

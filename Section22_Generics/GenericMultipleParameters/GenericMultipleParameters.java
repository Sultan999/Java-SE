package genericmultipleparameters;

class MyArray<T,K>{
	
	@SuppressWarnings("unchecked")
	T Array[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T value) {
		Array[length++] = value;
	}
	
	public void display() {
		for(int i = 0; i < length; i++) {
			System.out.println(Array[i]);
		}
	}
}

public class GenericMultipleParameters {

	public static void main(String[] args) {
		
		MyArray<String, Integer> ma = new MyArray<>();
		
		ma.append("Hi");
		ma.append("bye");
		//ma1.append(new Integer(10));
		
		ma.display();

	}

}

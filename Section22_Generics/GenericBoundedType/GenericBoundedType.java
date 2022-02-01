package genericboundedtype;

// To specify the type value as you can see I just want types of number which means that I can't use String in this class 
class MyArray<T extends Number>{
	
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

public class GenericBoundedType {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		MyArray<Float> ma = new MyArray<>();
		
		ma.append(new Float(12.5f));
		ma.append(23.4f);
		

	}

}

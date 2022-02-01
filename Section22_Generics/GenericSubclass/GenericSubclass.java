package genericsubclass;

class MyArray<T>{
	
	@SuppressWarnings("unchecked")
	T Data[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T value) {
		Data[length++] = value; 
	}
	
	public void display() {
		for(int i = 0; i < length; i++) {
			System.out.println(Data[i]);
		}
	}
}

class MyArray2 extends MyArray<String>{
	
}

class MyArray3<T> extends MyArray<T>{
	
}

@SuppressWarnings("rawtypes")
// This class will be treated as an object
class MyArray4 extends MyArray{
	
}


public class GenericSubclass {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		
		MyArray<Integer> ma = new MyArray<>();
		MyArray2 ma1 = new MyArray2();
		MyArray3<Float> ma2 = new MyArray3<>();
		MyArray4 ma3 = new MyArray4();
		
		
		ma.append(10);
		ma.append(new Integer(3));
		
		ma1.append("Hi");
		ma1.append(new String("bye"));
		
		ma2.append(1.5f);
		
		ma3.append(10);
		ma3.append("hi");
		
		ma.display();
		ma1.display();
		ma2.display();
		ma3.display();

	}

}

package genericmethodwildcard;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
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


public class GenericMethodWildCard {
	
	static void fun(MyArray obj) {
		obj.display();
	}
	
	// This is called "Unbounded WildCard" 
	static void fun1(MyArray<?> obj) {
		obj.display();
	}
	
	// This is called "Upper Bound"
	static void fun2(MyArray<? extends Number> obj) {
		obj.display();
	}
	
	// This is called "Lower Bound"
	static void fun3(MyArray<? super A> obj) {
		obj.display();
	}

	public static void main(String[] args) {
		
		MyArray<String> ma = new MyArray<>();
		ma.append("Hi");
		ma.append("bye");
		
		MyArray<Integer> ma1 = new MyArray<>();
		ma1.append(10);
		ma1.append(20);
		
		MyArray<A> ma2 = new MyArray<>();
		
		fun(ma);
		fun(ma1);
		System.out.println(" ");
		fun1(ma);
		fun1(ma1);
		
		fun2(ma1);
		
		fun3(ma2);

	}

}

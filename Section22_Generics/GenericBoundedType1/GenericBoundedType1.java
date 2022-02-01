package genericboundedtype1;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}


interface D{
	
}
class E implements D{
	
}
class F implements D{
	
}

class MyArray<T extends A>{
	
	@SuppressWarnings("unchecked")
	T Array[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T v) {
		Array[length++] = v;
	}
	
	public void show() {
		for(int i = 0; i < length; i++) {
			System.out.println(Array[i]);
		}
	}
	
}

class MyArray1<T extends D>{
	
	@SuppressWarnings("unchecked")
	T Array[] = (T[]) new Object[10];
	int length = 0;
	
	public void append(T v) {
		Array[length++] = v;
	}
	
	public void show() {
		for(int i = 0; i < length; i++) {
			System.out.println(Array[i]);
		}
	}
	
}


public class GenericBoundedType1 {

	public static void main(String[] args) {
		
		MyArray<A> ma = new MyArray<>();
		MyArray<B> ma_1 = new MyArray<>();
		MyArray<C> ma_2 = new MyArray<>();
		
		MyArray1<D> ma1 = new MyArray1<>();
		MyArray1<E> ma1_1 = new MyArray1<>();
		MyArray1<F> ma1_2 = new MyArray1<>();
		
		
		

	}

}

package genericdemo;

class Data<T>{
	
	private T obj;
	
	public T getData() {
		return obj;
	}
	public void setData(T v) {
		this.obj = v;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
		//Data<Integer> d = new Data<Integer>();
		Data<Integer> d = new Data<>();
		
		//Data<String> d1 = new Data<>();
		Data<String> d1 = new Data<String>();
		
		
		//d.setData(10);
		d.setData(new Integer(10));
		
		//d1.setData("Hi");
		d1.setData(new String("Hi"));
		
		System.out.println(d.getData());
		System.out.println(d1.getData());
		
		
	}

}

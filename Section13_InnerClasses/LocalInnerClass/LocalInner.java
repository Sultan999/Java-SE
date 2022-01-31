package localinner;

class Outer{
	
	public void display() {
		class Inner{
			public void show() {
				System.out.println("This is local Inner");
			}
			
		}
//		Inner i = new Inner();
//		i.show();
		
		new Inner().show();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.display();

	}

}

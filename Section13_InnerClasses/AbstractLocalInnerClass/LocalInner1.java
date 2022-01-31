package localinner1;

abstract class My{
	
	abstract public void show();
}

interface My1{
	public void IShow();
}

class Outer{
	
	public void display() {
//		My m = new My() {
//			public void show() {
//				System.out.println("This is abstract Local inner");
//			}
//		};
//		m.show();
		
		new My() {
			public void show() {
				System.out.println("This is abstact local inner");
			}
		}.show();
	}
	
	public void display1() {
		My1 m1 = new My1() {
			public void IShow() {
				System.out.println("This is interface local inner");
			}
		};
		m1.IShow();
	}
	
	
}

public class LocalInner1 {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.display();
		o.display1();

	}

}

package nestedinner;

class Outer{
	
	int x = 10;
	
	class Inner{
		int y = 19;
		
		public void innerDisplay() {
			System.out.println("x = " + x + " y = " + y);
		}
	}
	
	public void outerDisplay() {
		Inner i = new Inner();
		
		i.innerDisplay();
	}
}

public class NestedInner {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.outerDisplay();
		
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();
		oi.y = 10;
		System.out.println(oi.y);
		

	}

}

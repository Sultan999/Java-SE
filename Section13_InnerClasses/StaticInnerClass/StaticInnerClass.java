package staticinnerclass;

class Outer{

	int x = 10;
	static int y = 15;
	
	static class My{

		public void show() {
			System.out.println(y);
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {

		Outer.My om = new Outer.My();
		om.show();

	}

}

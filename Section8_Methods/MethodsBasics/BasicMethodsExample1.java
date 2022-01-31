package basicmethodsexample1;

public class BasicMethodsExample1 {

	String userName(String email) {

		int a = email.indexOf("@");

		String name = email.substring(0, a);
		return name;
	}


	static void change(int Array[], int index, int value) {

		Array[index] = value;
	}

	static void change2(int x, int value) {

		x = value;
	}

	public static void main(String[] args) {

		// Find user form an email
		String name;
		String email = "s.h.alzahrani@hotmail.com";
		MethodsPractice1 mp = new MethodsPractice1();
		name = mp.userName(email);
		System.out.println(name);



		System.out.println("\n\n");


		// the value can be changed using methods
		int Array1[] = {1,2,3,4,5,6,7,8};

		change(Array1, 2, 20);

		for(int i = 0; i < Array1.length; i++) {

			System.out.print(Array1[i]);

			if(Array1.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}

		System.out.println("\n\n");



		// the value can't change using methods
		int x = 10;
		change2(x,20);

		System.out.println("Value of Primitive " + x);



	}

}

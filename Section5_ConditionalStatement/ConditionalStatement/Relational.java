package relational;

public class Relational {

	public static void main(String[] args) {

		int a =5, b=6, c=4;


		if(a > b && a > c) {
			System.out.println(a + " Greater than " + b + " and " + c);
		}
		else {
			if(b > c) {
				System.out.println(b + " Greater than " + a + " and " + c);
			}
			else {
				System.out.println(c + " Greater than " + a + " and " + b);
			}
		}

//		if(a > b && a > c) {
//
//			System.out.println(a + " Greater than " + b + " and " + c);
//		}
//		else if(b > a && b > c) {
//
//			System.out.println(b + " Greater than " + a + " and " + c);
//
//		}
//		else {
//
//			System.out.println(c + " Greater than " + a + " and " + b);
//		}


	}

}

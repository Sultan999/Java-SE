package bitwise;

public class Bitwise {

	public static void main(String[] args) {
		
		// This is swamping values between two variables 
		int a = 9, b = 12;
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("a is " + a + " b is " + b);
		
		/////////////////////////////////////////////////////////////
		
		byte z = 15, d = 10;
		
		byte c;
		
		c = (byte)(z<<4);
		c = (byte)(c|d);
		
		System.out.println("This show what is the value that is being hold in the left four bits of c " + ((c&0b11110000)>>4));
		System.out.println("This show what is the value that is being hold in the right four bits of c " + (c&0b00001111));

	}

}

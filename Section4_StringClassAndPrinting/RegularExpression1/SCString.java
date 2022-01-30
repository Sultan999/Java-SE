package scstring;

public class SCString {

	public static void main(String[] args) {

		// 1) Find if a Number is binary or not
		// 2) Find if a Number is Hex-Decimal or not
		// 3) Find if the data is in Date format (DD/MM/YYYY)


		// 1)

		// First we create a variable to store binary
		int b = 10011001;

		// Convert it to String
		//String str = b + "";
		// Or
		String str = String.valueOf(b);

		// Check if the values that stored in the variable str is binary or not
		System.out.println(str.matches("[01]*"));
		// Or at least one digit is their
		System.out.println(str.matches("[01]+"));


		// 2)

		// First create a variable to store Hex-Decimal
		String str1 = "1110897ACF";

		// Check if the variable a is Hex-Decimal or not
		System.out.println(str1.matches("[0-9A-F]*"));


		// 3)

		// First create a variable to store date
		String str2 = "38/09/2000";

		// Check if the data is in Date format (DD/MM/YYYY)
		System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));






	}

}

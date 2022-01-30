package scstring;

public class Scstring {

	public static void main(String[] args) {

		// Find if the email id is on gmail
		// Find username and domain name from email

		String str = "programmer@gmail.com";

		// First find the index of symbol "@" and store it in variable i
		int i = str.indexOf("@");

		System.out.println(i);

		// Second store the username in the variable userName which start from index 0 until index i
		String userName = str.substring(0, i);

		// Third we store the domain name in the variable domainName which start from index ++i
		String domainName = str.substring(++i);

		// Print userName and domainName
		System.out.println("Username: " + userName);
		System.out.println("Domain name: " + domainName);

		// Finally, check if the domain name is == gmail or not
		System.out.println(domainName.startsWith("gmail"));



		// Other way
		/******************************************************

		// Fifth, find the index of '.' and store it in variable a
		int a = str2.indexOf('.');

		System.out.println(a);

		// Sixth, Store the domain name in variable str3
		String str3 = str2.substring(0, a);

		System.out.println(str3);

		// Finally, compare to see if the domain name == gmail or not
		// First method
		System.out.println(str3.compareTo("gmail"));
		// Second method
		System.out.println(str3.equals("gmail"));

		*////////////////////////////////////////////////////////////



	}

}

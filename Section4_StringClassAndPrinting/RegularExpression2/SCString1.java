package scstring1;

public class SCString1 {

	public static void main(String[] args) {

		// 1) Remove Special characters from a string
		// 2) Remove extra spaces from a string
		// 3) Find number of words in a string

		// 1)

		// First create string with special characters
		String str = "a!B@c#1$2%3";

		// Remove special characters from a string
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));


		// 2)

		// First create a string with extra spaces
		String str1 = "    Welcome     to     this    course    of    java     ";

		// Remove the extra spaces from a string
		System.out.println(str1.replaceAll("\\s+", " ").trim());


		// 3)

		// First create a string
		String str2 = "    Welcome     to     this    course    of    java     ";

		str2 = str2.replaceAll("\\s+", " ").trim();

		String words[] = str2.split("\\s");

		System.out.println(words.length);









	}

}

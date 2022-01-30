package sortingstringinarray;

public class SortingStringInArray {

	public static void main(String[] args) {

		// Sorting string in an array

		String str[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};

		java.util.Arrays.sort(str);

		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if(str.length <= i+1) {
				System.out.print("");
			}
			else {
				System.out.print(", ");
			}
		}

	}

}

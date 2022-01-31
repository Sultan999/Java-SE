package variableargumentmethod;

public class VariableArgumentMethod {
	
	static void show(int ...A) {
		
		for(int x: A) {
			System.out.print(x + ", ");
		}
		System.out.println("");
	}
	
	
	static void showList(int start, String ...S) {
		
		for(int i = 0; i < S.length; i++) {
			
			System.out.println(start + ". " + S[i]);
			start++;
		}
	}

	public static void main(String[] args) {
		
		// First method
		show();
		show(10, 20, 30);
		show(new int[] {1,2,3,4,5,6});
		
		System.out.println("");
		
		// Second method
		showList(1, "Sultan", "Nayif", "Yousf", "Hasen");
		

	}

}

package validatemethod;
import java.util.Scanner;

public class ValidateMethod {
	
	boolean validate(String name) {
		
		if(name.matches("[a-zA-Z\\s]+")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	boolean validate(int age) {
		
		if(age >= 3 && age <= 10) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		ValidateMethod vm = new ValidateMethod();
		
		Scanner scan = new Scanner(System.in);
		
		String option;
		
		System.out.println("1. Validate Name.");
		System.out.println("2. Validate Age");
		System.out.println("Enter one of the options number above to Validate: ");
		option = scan.nextLine();
		
		String name;
		int age;
		
		
		if(option.equals("1")) {
			
			System.out.println("Please enter your name: ");
			name = scan.nextLine();
			
			if(vm.validate(name) == true) {
				System.out.println("Your name is valid");
			}
			else {
				System.out.println("Your name invalid");
			}
			
		}
		else if(option.equals("2")) {
			
			System.out.println("Please enter your age: ");
			age = scan.nextInt();
			
			if(vm.validate(age) == true) {
				System.out.println("Your age is valid");
			}
			else {
				System.out.println("Your age invalid");
			}
		}
		else {
			System.out.println("Your input invalid");
		}
		
		scan.close();
	}

}

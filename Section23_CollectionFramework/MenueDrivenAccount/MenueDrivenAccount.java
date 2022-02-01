package menuedrivenaccount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable{
	
	String accountNo;
	String name;
	double balance;
	
	
	public Account() {
		
	}
	
	public Account(String accNo, String name, double b) {
		accountNo = accNo;
		this.name = name;
		balance = b;
	}
	
	public String toString() {
		return "Account Number: " + accountNo + "\nName: " + name + "\nBalance: " + balance;
	}
	
}

public class MenueDrivenAccount {

	public static void main(String[] args) throws Exception {
		
		
		Scanner scan = new Scanner(System.in);
		
		Account acc = null;
		
		HashMap<String, Account> hm = new HashMap<>();
		
		
		
		
		try {
			FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/Accounts.txt");
			ObjectInputStream ois = new ObjectInputStream(readFromFile);
			
			int count = ois.readInt();
			
			for(int i = 0; i < count; i++) {
				
				acc = (Account) ois.readObject();
				System.out.println(acc);
				hm.put(acc.accountNo, acc);
			}
			
			readFromFile.close();
			ois.close();
			
		} catch (Exception e) {
			
		}
		
		FileOutputStream writeToFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/Accounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(writeToFile);
		
		System.out.println("Menue");
		
		int choice = 0;
		String name, accNo;
		double balance;
		
		do {
			
			System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");            
            System.out.println("Enter your choice ");
            
            choice = scan.nextInt();
            
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch(choice) {
            
            	case 1: System.out.println("Enter details Account Number, Name, Balance ");
            			accNo = scan.nextLine();
            			name = scan.nextLine();
            			balance = scan.nextDouble();
            			acc = new Account(accNo, name, balance);
            			hm.put(accNo, acc);
            			System.out.println("Account created for: " + name);
            			System.out.println("");
            			break;
            			
            	case 2: System.out.println("Enter account number");
            			
            			accNo = scan.nextLine();
            			hm.remove(accNo);
            			System.out.println("");
            			break;
            			
            	case 3: System.out.println("Enter Account number");
            	
            			accNo = scan.nextLine();
            			acc = hm.get(accNo);
            			System.out.println(acc);
            			System.out.println("");
            			break;
            			
            	case 4:  
            			for(Account x: hm.values()) {
            				System.out.println(x);
            			}
            			System.out.println("");
            			break;
            			
            	case 5:
            	case 6: oos.writeInt(hm.size());
            			
            			for(Account a: hm.values()) {
            				oos.writeObject(a);
            			}
            }
            
		}while(choice != 6);
		
		oos.flush();
		oos.close();
		writeToFile.close();
		
	}

}

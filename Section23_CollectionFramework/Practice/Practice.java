package practice;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

class Account implements Serializable{
	
	String accountNumber;
	String name;
	double balance;
	int count = 100;
	
	Account(){
		accountNumber ="A-";
		
	}
	
	public void genrateID(int n) {
		String id;
		for(int i = 0; i < n; i++) {
			id = accountNumber + count;
			System.out.println(id);
			count++;
		}
			
			
		
		
	}
	
	
}

public class Practice {

	public static void main(String[] args) {
		
		String A = "A-";
		
		int b = 100;
		
		String c;
		
		
//		for(int i = 0; i < 6; i++) {
//			c = A + b;
//			
//			System.out.println(c);
//			b++;
//			
//		}
		
		Account acc = new Account();
		
		
		acc.genrateID(6);
		
		

	}

}






package sc_customer;
import java.io.*;
import java.util.*;

class Customer implements Serializable {
	
	String custID;
	String name;
	String phone;
	
	// For giving new ID number automatically
	static int count = 1;
	
	public Customer() {
		
	}
	public Customer(String n, String ph) {
		// This how you generate new CustomerID automatically when you create new customer 
		custID = "C" + count;
		count++;
		this.name = n;
		this.phone = ph;
	}
	
	public String toString() {
		return "Customer ID: " + custID +
				"\nCustomer Name: " + name +
				"\nCustomer phone: " + phone + "\n";
	}
	
}

public class SC_Customer {

	/*
	public static void main(String[] args) throws Exception {
		
		///////////////////////////////// Write in the Customer file ////////////////////////////////////////////////////
		
		Customer list[] = {new Customer("Hasen", "045569996555"), new Customer("Sultan", "0560599933"), new Customer("Nayif", "05609994433")};
		
		FileOutputStream writeInFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(writeInFile);
		
		// I must first know the length of the list 
		oos.writeInt(list.length);
		for(Customer c: list) {
			oos.writeObject(c);
		}
		writeInFile.close();
		oos.close();
		
	}
	
}*/
	
		
	
	public static void main(String[] args) throws Exception{
		
		//////////////////////////////////// Read from Customer file /////////////////////////////////////////////////////
		
		
		Scanner scan = new Scanner(System.in);
		
		FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Customer.txt");
		ObjectInputStream ois = new ObjectInputStream(readFromFile);
		
		int length = ois.readInt();
		
		Customer list[] = new Customer[length];
		
		for(int i = 0; i<length; i++) {
			
			list[i] = (Customer)ois.readObject();
		}
		
		System.out.println("Enter Name of Customer");
		String name = scan.nextLine();
		
		for(int i = 0; i < length; i++) {
			
			if(name.equalsIgnoreCase(list[i].name)) {
				System.out.println(list[i]);
			}
		}
		
		scan.close();
		readFromFile.close();
		ois.close();
		
		

	}

}

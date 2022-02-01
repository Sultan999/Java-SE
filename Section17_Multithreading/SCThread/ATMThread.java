package atmthread;

class ATM{
	
	synchronized public void checkBalance(String name) {
		
		System.out.print(name + " Checking ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" Balance ");
	}
	
	synchronized public void withdraw(String name, int amount) {
		System.out.print(name + " Withdraw ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(amount);
	}
	
	
}

class Customer extends Thread{
	
	ATM a;
	String name;
	int amount;
	
	public Customer(String n, ATM atm, int amt) {
		this.name = n;
		this.a = atm;
		this.amount = amt;
	}
	
	public void useATM() {
		a.checkBalance(name);
		a.withdraw(name, amount);
	}
	
	public void run() {
		useATM();
	}
	
}

public class ATMThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Customer c1 = new Customer("Hasen", atm, 50000);
		Customer c2 = new Customer("Sultan", atm, 1000);
		c1.start();
		c2.start();
		
		

	}

}

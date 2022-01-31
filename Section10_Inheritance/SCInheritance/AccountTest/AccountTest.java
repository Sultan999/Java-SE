package accounttest;

class Account{
	
	private String accNo;
	private String name;
	private String address;
	private String phoneNo;
	private String dob;
	protected long balance;
	
	public Account(String accNo, String name, String address, String phoneNo, String dob) {
		
		this.accNo = accNo;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
		balance = 0;
		
	}
	
	public String getAccountNumber() {
		return accNo;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNo;
	}
	public String getDateOfBirth() {
		return dob;
	}
	public long getBalance() {
		return balance;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}

class SavingAccount extends Account{
	
	public SavingAccount(String accNo, String name, String address, String phoneNo, String dob) {
		super(accNo, name, address, phoneNo, dob);
		// TODO Auto-generated constructor stub
	}
	public void deposit(long amt) {
		balance += amt;
	}
	public void withdraw(long amt) {
		balance -= amt;
	}
	
}

class LoanAccount extends Account{
	
	public LoanAccount(String accNo, String name, String address, String phoneNo, String dob) {
		super(accNo, name, address, phoneNo, dob);
		// TODO Auto-generated constructor stub
	}
	public void payEMI(long amt) {
		balance -= amt;
	}
	public void repey(long amt) {
		if(balance == amt)
			balance = 0;
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount("A-123", "Bank Sultan", "Al-Samer", "0560599933", "12/07/2020");
		
		System.out.println(sa.getAccountNumber());
	}

}

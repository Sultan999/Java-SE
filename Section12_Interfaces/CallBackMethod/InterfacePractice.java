package interfacepractice;

interface Member{
	public void callBack();
}

class Store{
	
	Member mem[] = new Member[10];
	int count = 0;
	
	public void register(Member m) {
		mem[count++] = m;
	}
	
	public void invitSale() {
		for(int i = 0; i < count; i++) {
			mem[i].callBack();
		}
	}
	
}

class Customer implements Member{
	
	String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void callBack() {
		System.out.println("OK, I will vist " + name);
	}
}

public class InterfacePractice {

	public static void main(String[] args) {
		
		Store s = new Store();
		Customer c1 = new Customer("Hasen");
		Customer c2 = new Customer("Sultan");
		
		s.register(c1);
		s.register(c2);
		
		s.invitSale();
	

	}

}

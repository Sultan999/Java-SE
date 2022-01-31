package singeltonclasspractice1;

class CoffeeMachine{
	
	private float coffeeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	static private CoffeeMachine my = null;
	
	private CoffeeMachine() {
		coffeeQty = 1;
		milkQty = 1;
		waterQty = 1;
		sugarQty = 1;
	}
	
	public void fillWater(float qry) {
		this.waterQty = qry;
	}
	public void fillSugar(float qry) {
		this.sugarQty = qry;
	}
	public float getCoffee() {
		return 0.15f;
	}
	
	static CoffeeMachine getInstance() {
		if(my == null) 
			my = new CoffeeMachine();
			return my;
		
	}
}
public class SingeltonClassPractice1 {

	public static void main(String[] args) {
		
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		if(m1==m2 && m1==m3) {
	        System.out.println("Same");
	     }
	     else {
	        System.out.println("It's different object");
	     }
	}

}

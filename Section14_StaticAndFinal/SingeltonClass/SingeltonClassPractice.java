package singeltonclasspractice;

class CoffeeMachine{
	
	private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    //static private CoffeeMachine my[]= new CoffeeMachine[4];
    
    
    private CoffeeMachine()
    {
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    
    static int index = 0;
    static CoffeeMachine getInstance()
    {
        if(index <= 5) {
        	index++;
        	return new CoffeeMachine();
        }
        else {
        	return null;
        }
        	
            //my[index]=new CoffeeMachine();
        	
        
        
    }
}

public class SingeltonClassPractice {

	public static void main(String[] args) {
		
		// This one for 4 Objects only
		
		 CoffeeMachine m1=CoffeeMachine.getInstance();
	     CoffeeMachine m2=CoffeeMachine.getInstance();
	     CoffeeMachine m3=CoffeeMachine.getInstance();
	        
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

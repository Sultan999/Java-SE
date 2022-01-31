package staticpractice1;

class HondaCity{
	static long price = 10;
	
	static void onRoad(String City) {
		
		switch(City) {
			case "Riyadh": 
				System.out.println("The price in Riyadh is: " + (price + price * 0.1));
				break;
			case "Jeddah": 
				System.out.println("The price in Jeddah is: " + (price + price * 0.09));
				break;
			default: System.out.println("Wrong input");
				break;
		}
		
	}
}

public class StaticPractice1 {

	public static void main(String[] args) {
		
		HondaCity.onRoad("Jeddah");

	}

}

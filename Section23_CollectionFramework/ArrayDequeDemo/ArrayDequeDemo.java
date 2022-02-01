package arraydequedemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		
		ad.offerLast(60);
		ad.offerLast(70);
		ad.offerLast(80);
		ad.offerLast(90);
		ad.offerLast(100);
		
		ad.offerFirst(50);
		ad.offerFirst(40);
		ad.offerFirst(30);
		ad.offerFirst(20);
		ad.offerFirst(10);
		
		// remove the specific value 
		ad.remove(30);
		
		// remove the first elements from the ArrayDeque
		//ad.pollFirst();
		
		//System.out.println(ad);
		
		ad.forEach(n -> System.out.println(n));

	}

}

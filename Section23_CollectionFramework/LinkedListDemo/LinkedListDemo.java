package linkedlistdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ldl1 = new LinkedList<>();
		LinkedList<Integer> ldl2 = new LinkedList<>(List.of(60,70,80,90));
		LinkedList<Integer> ldl3 = new LinkedList<>(List.copyOf(ldl2));
		
		ldl1.add(10);
		ldl1.add(20);
		ldl1.add(30);
		ldl1.addAll(ldl2);
		ldl3.add(2,100);
		ldl1.addAll(ldl3);
		
		ldl1.addFirst(1);
		ldl1.addLast(200);
		
		
		ldl1.forEach(n -> display(n));
		
		//System.out.println(ldl1);
		// Sorting Integer 
//		ldl3.sort((fromStart, toEnd) -> fromStart.compareTo(toEnd));
//		ldl3.sort((a,b)->b.compareTo(a));
		//ldl3.sort(Integer::compareTo);
		

	}
	
	static void display(int n) {
		System.out.print(n + " ");
	}

}

package linkedhashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		HashSet<Integer> hs = new HashSet<>();
		
		lhs.add(5);
		lhs.add(6);
		lhs.add(2);
		lhs.add(12);
		lhs.add(6);
		
		hs.add(5);
		hs.add(6);
		hs.add(2);
		hs.add(12);
		hs.add(6);
		
		//System.out.println(lhs);
		System.out.println(hs);
		
		Iterator<Integer> it = lhs.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}

	}

}

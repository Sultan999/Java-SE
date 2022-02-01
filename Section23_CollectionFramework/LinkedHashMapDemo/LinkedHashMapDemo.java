package linkedhashmapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>(Map.of(1,"A", 2,"B", 3,"C", 4,"D"));
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(Map.of(5,"E", 6,"F", 7,"G", 8,"H"));
		
		hm.put(0, "Hello");
		hm.put(5, "Bye");
		
		lhm.put(0, "Hello");
		lhm.put(9, "Bye");
		
		String s = lhm.get(5);
		
		
		
		System.out.println(hm);
		
		System.out.println(lhm);
		

	}

}

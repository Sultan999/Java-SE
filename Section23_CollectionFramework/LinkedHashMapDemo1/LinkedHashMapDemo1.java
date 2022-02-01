package linkedhashmapdemo1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		/*
		// the result will be based on access order 
		// Most recent access will be the last element and least recent access will be the first element
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(10,0.75f,true);
		
		lhm.put(1,"A");
		lhm.put(2,"B");
		lhm.put(3,"C");
		lhm.put(4,"D");
		lhm.put(5,"E");
		
		String s = lhm.get(2);
		s = lhm.get(5);
		s = lhm.get(1);
		
		
		System.out.println(lhm);
		*/
		
		
		
		/*
		// the result will be based on access order
		// Most recent access will be the last element and least recent access will be the first element
		@SuppressWarnings("serial")
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5,0.75f,true) {
			
			@SuppressWarnings("rawtypes")
			@Override
			protected boolean removeEldestEntry(Map.Entry e) {
				return size() > 5;
			}
		};
		
		
				
		lhm.put(1,"A");
		lhm.put(2,"B");
		lhm.put(3,"C");
		lhm.put(4,"D");
		lhm.put(5,"E");
				
		String s = lhm.get(2);
		s = lhm.get(5);
		s = lhm.get(1);
		
		System.out.println(lhm);
		
		lhm.put(6, "F");
		
		System.out.println(lhm);
				
				
		//lhm.forEach((k,v) -> System.out.println(k + " " + v));
		 */
		
		
		// The result will be based on insertion order
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5) {
			
			@Override
			protected boolean removeEldestEntry(Map.Entry e) {
				return size() > 5;
			}
		};
		
		
				
		lhm.put(1,"A");
		lhm.put(2,"B");
		lhm.put(3,"C");
		lhm.put(4,"D");
		lhm.put(5,"E");
				
		String s = lhm.get(2);
		s = lhm.get(5);
		s = lhm.get(1);
		
		System.out.println(lhm);
		
		lhm.put(6, "F");
		
		System.out.println(lhm);
				
	
	}

}

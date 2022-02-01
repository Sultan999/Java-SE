package mapdemo;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// This is TreeMap
		/*
		TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A", 1,"B", 2,"C", 3,"D"));
		
		tm.put(4,"E");
		tm.put(6,"G");
		
		Entry<Integer, String> e = tm.firstEntry();
		
		System.out.println(e.getKey() + " " + e.getValue());
		
		
		System.out.println(tm.ceilingEntry(5).getValue());
		
		System.out.println(tm.get(4));
		
		
		System.out.println(tm);
		*/
		
		// This is HashMap
		HashMap<Integer, String> hm = new HashMap<>(Map.of(0,"A", 1,"B", 2,"C", 3,"D"));
		
		hm.put(4,"E");
		hm.put(6,"G");

		hm.forEach((k,v) -> System.out.println("Key: " + k + " value: " + v));
	}

}

package hashsetdemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// It doesn't accept duplicate value because it is a set as well as hash
		
		HashSet<Integer> hs = new HashSet<>(20,0.75f);
		
		hs.add(23);
		hs.add(22);
		hs.add(41);
		hs.add(11);
		hs.add(22);
		
		hs.forEach(x -> System.out.println(x));
		
		

	}

}

package treesetdemo;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// TreeSet is sorted set and it will not duplicate any value
		
		TreeSet<Integer> ts = new TreeSet<>();
		// I can only call "SortedSet" methods  
		SortedSet<Integer> ts1 = new TreeSet<>(List.of(20, 10, 15, 30, 22));
		// I can only call "Collation" features
		Collection<Integer> c = new TreeSet<>();
		
		ts.add(5);
		ts.add(2);
		ts.add(5);
		ts.add(7);
		ts.add(19);
		ts.add(10);
		
		c.add(20);
		c.add(40);
		c.add(35);
		
		c.forEach(x -> System.out.println(x));
		
		ts.addAll(c);
		
		ts.addAll(ts1);
		
		
		System.out.println(ts);
		
		// It will print closest large element than 12 which means that even 10 is close to 11 than 19 but 
		// it will go for the above close value to 11 from the set
		System.out.println(ts.ceiling(11));

	}

}

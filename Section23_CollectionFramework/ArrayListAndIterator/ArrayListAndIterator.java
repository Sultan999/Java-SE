package arraylistanditerator;
import java.util.*;

public class ArrayListAndIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>(List.of(4,8,9));
		ArrayList<Integer> al3 = new ArrayList<>(List.of(12, 23, 434));
		
		al1.add(5);
		al1.add(6);
		al1.add(9);
		
		// To merge all al2 ArrayList to al1 ArrayList 
		al1.addAll(al2);
		// To choose the start index of al1 to merge all al3 to al1 
		al1.addAll(2, al3);
		// What number is in index 3
		System.out.println(al1.get(3));
		// What is the index number of value 23
		// Get the index number that hold number 23
		System.out.println(al1.indexOf(23));
		// to replace the value of index 1 to 12
		al1.set(1, 12);
		System.out.println(al1.contains(12));
		
		al1.forEach(n ->show(n));
		
		/*
		for(Iterator<Integer> it = al1.iterator(); it.hasNext();) {
			int x = it.next();
			// or
			//java.lang.Integer b = it.next();
			//System.out.println(b);
			System.out.println(x);
		}*/
		
//		for(Iterator<Integer> it = al1.listIterator(); it.hasNext();) {
//			System.out.println(it.next());
//		}
		
		/*
		Iterator<Integer> it = al1.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//System.out.println(al1);
		
//		for(int i = 0; i < al1.size(); i++) {
//			System.out.println(al1.get(i));
//		}
		
//		for(Integer x: al1) {
//			System.out.println(x);
//		}
		
//		for(var x: al1) {
//			System.out.println(x);
//		}
		
		// Using Java Lambda Expressions
		//al1.forEach((n) -> {System.out.print(n + ", ");});
		
		
		
		
		

	}
	
	static void show(int n) {
		if(n > 10) {
			System.out.println(n);
		}
	}

}

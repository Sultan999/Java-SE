package priorityqueuedemo;

import java.util.Comparator;
import java.util.PriorityQueue;


// After modify it we will get:
// Small value has low priority 
// Large value has high priority
class MyCom implements Comparator<Integer>{
	
	public int compare(Integer o1, Integer o2) {
		
		if(o1 < o2)
			return 1;
		
		if(o1 > o2)
			return -1;
		
		return 0;
	}
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// Originally:
		// Small value has high priority 
		// Large value has low priority 
		PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());
		
		p.offer(20);
		p.offer(10);
		p.offer(30);
		p.offer(5);
		p.offer(15);
		p.offer(3);
		
		System.out.println(p.peek());
		
		System.out.println(p);
		
		p.poll();
		
		System.out.println("After deleting the head/first element");
		System.out.println(p);
		
		//p.forEach(x -> System.out.println(x));
		
		

	}

}

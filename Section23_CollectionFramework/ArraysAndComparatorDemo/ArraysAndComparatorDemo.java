package arraysandcomparatordemo;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer>{
	
	// Reverse sorting order
	public int compare(Integer i1, Integer i2) {
		
		if(i1 < i2) {
			return 1;
		}
		if(i1 > i2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class ArraysAndComparatorDemo {
	
	

	public static void main(String[] args) {
		
		/*
		int a[] = {3, 4, 5, 6, 7, 8, 8};
		int b[] = {3, 4, 5, 6, 7, 8, 9};
		
		// When the two arrays is equals it will print 0
		// When the first array is greater than second array it will print 1
		// When the second array is greater than first array it will print -1
		System.out.println(Arrays.compare(a, b));
		
		// It will copy from array "a" and it will copy only first 4 elements 
		int c[] = Arrays.copyOf(a, 4);
		// It will copy all the elements in array "b"
		int c1[] = Arrays.copyOf(b, b.length);
		
		
		for(int x: c) {
			System.out.println(x);
		}
		
		for(int x: c1) {
			System.out.println(x);
		}
		
		int d[] = new int[10];
		
		Arrays.fill(d, 2);
		
		for(int x: d) {
			System.out.println(x);
		}
		
		
		int e[] = {5, 3, 7, 6, 2, 8, 9, 1, 4};
		
		Arrays.sort(e);
		
		for(int x: e) {
			System.out.print(x + ", ");
		}
		
		
		System.out.println(" ");
		// If you want to use binarySearch you must sort it first and then go for binarySearch
		System.out.println("The Index of number 7 is " + Arrays.binarySearch(e, 7));
		*/
		
		
		Integer A[] = {5, 3, 7, 6, 2, 8, 9, 1, 4};
		
		Arrays.sort(A, new My());
		
		System.out.print("[");
		for(int x: A) {
			System.out.print(x + " ");
		}
		System.out.print("]");

	}

}

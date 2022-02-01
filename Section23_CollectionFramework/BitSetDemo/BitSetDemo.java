package bitsetdemo;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		
		BitSet bs = new BitSet();
		
		bs.set(0);
		bs.set(2);
		bs.set(4);
		bs.set(6);
		bs.set(8);
		
		/*
		BitSet bs1 = new BitSet();
		
		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(3);
		bs1.set(5);
		bs1.set(6);
		bs1.set(7);
		//bs1.set(8);
		bs1.set(9);
		
		bs.and(bs1);
		*/
		
		BitSet bs2 = new BitSet();
		
		bs2.set(1);
		bs2.set(3);
		bs2.set(5);
		bs2.set(7);
		
		//bs.or(bs2);
		
		bs.flip(0, bs.length());
		
		System.out.println(bs);

	}

}

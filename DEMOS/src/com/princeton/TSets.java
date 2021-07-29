package com.princeton;

import java.util.TreeSet;

public class TSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(1);
		tset.add(2);
		tset.add(3);
		tset.add(4);
		
		//works the same as the other data structures
		System.out.println(tset.pollFirst());
		System.out.println(tset.pollLast());
	}

}

package com.princeton;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashprac {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("John");
		set.add("Mike");
		set.add("Jack");
		set.add("Mac");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		
		set2.add("Stuff");
		
		set2.add(null);
		set2.add(null);
	}
}

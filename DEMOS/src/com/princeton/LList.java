package com.princeton;

import java.util.LinkedList;
import java.util.Iterator;


public class LList {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList();
		
		names.add("John");
		names.add("Mike");
		names.addFirst("First");
		names.addLast("Last");
		
		//names.removeFirst();
		//names.remove(6);
		
		//names.removeFirstOccurrence("Mike");
		//names.removeLastOccurrence("Mike");
		
		
		System.out.println(names);
		
		//for loop works better
		Iterator iter = names.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(names);
		}
	}
}

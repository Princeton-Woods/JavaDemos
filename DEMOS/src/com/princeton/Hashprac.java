package com.princeton;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

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
		
		
		////Assignment
		
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Mark");
        student.put(2, "Paul");
        student.put(3, "John");
        //size
        System.out.println(student.size());
        //copy
        Map<Integer, String> studentCopy = CopyMap(student);
        System.out.println(studentCopy);
	}
	public static <K, V> Map<K, V> CopyMap(Map<K, V> original)
    {
        Map<K, V> second_Map = new HashMap<>();
        for (Map.Entry<K, V> entry : original.entrySet()) {
            second_Map.put(entry.getKey(), entry.getValue());
        }
        return second_Map;
    }
}

package com.princeton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Day4 {
	
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<String>();
		List.add("Mark");
		List.add("Paul");
		List.add("Varun");
		List.add("Aaron");
		List.remove(3);
		System.out.println(List);
		List.add(0, "First element");
		System.out.println(List.get(0));
		
		Iterator iter = List.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//sorting and also calling items in the array using for each
		System.out.println();
		for(String name: List) {
			System.out.println(name);
		}
		//sorts alphabetically 
		System.out.println();
		Collections.sort(List);
		for(String name: List) {
			System.out.println(name);
		}
		//When printing class objects from a list use the function thats built into a class objects 
		//called toString is parses all variables of the class into string method to call at the time of printing
		//List -> List.contains("Paul")
		
		ArrayList<String> List2 = new ArrayList<String>();

		//Copy form one arr list to another hard copy
		for(String name: List) {
			List2.add(name);
		}
		//Dynamic collections copy
		Collections.copy(List2, List);
		
		
		
		List2.clear();
		//reverse Array  11
		for(int i = List2.size()-1; i >=0; i--) {
			List2.add(List.get(i));
		}
		
		
		
	}
	//
	public static void ExtractElements(int indexStart, int indexEnd, ArrayList<String> List) {
		for(int i = indexStart; i < indexEnd; i++) {
			System.out.println(List.get(i));
		}
	}
	public static void SwapElements(int index1, int index2, ArrayList<String> List) {
		String temp = List.get(index1);
		List.set(index1, List.get(index2));
		List.set(index2, temp);
	}
	public static void Shuffle(ArrayList<String> List) {
		Collections.shuffle(List);
	}
}

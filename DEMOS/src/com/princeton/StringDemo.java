package com.princeton;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Mark";
		String s2 = "Mark";
		String s3 = new String("MARK");
		String s4 = "Paul";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		 
		//Concatenation
		
		String str = "Hello " + "World";
		System.out.println(str);
		
		String str2 = 10 + 15 + 30 +"Sum" + 40 + 50;
		System.out.println(str2);
		
		String c1 = "Greetings";
		String c2 = "Mark";
		//String c3 = c3.concat(c2,c1);
		//System.out.println(c3);
		System.out.println(c1.substring(3));
		System.out.println(c1.substring(3, 7));
		
		String message = "A String, is here.";
		String[] result = message.split("\\,");
		System.out.println(Arrays.toString(result));
		
		//String buffer class
		StringBuffer sb = new StringBuffer("Hello ");
		//insert at a position
		sb.insert(0, "World ");
		//add to end
		sb.append("World");
		//replace
		sb.replace(1, 3, "World");
		//delete
		sb.delete(1, 3);
		//reverse
		sb.reverse();
		//capacity    	//default is 16
		sb.ensureCapacity(7);
		String buff = " ";
		String buff1 = " ";
		String buff2 = " ";
		String buff3 = " ";
		
		System.out.println(sb);
		System.out.println();
		System.out.println();
	}

}

package com.princeton;
import java.util.PriorityQueue;
public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PriorityQueue<String> q = new PriorityQueue<>();
			
			q.add("Word1");
			q.add("Word2");
			q.add("Word3");

			q.remove(1);
			q.poll();
			q.element();
			q.peek();
			
			for(String words : q) {
				System.out.println(words); 
			}
	}

}

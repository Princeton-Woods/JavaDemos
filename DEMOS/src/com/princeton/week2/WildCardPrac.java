package com.princeton.week2;



public class WildCardPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee("Mark");
		Employee em1 = new Employee(123);

	}

}
class Employee{
	String name;
	
	public<T> Employee(T name){
		this.name = name.toString();
	}
}

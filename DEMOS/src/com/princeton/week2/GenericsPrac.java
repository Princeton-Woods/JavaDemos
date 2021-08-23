package com.princeton.week2;

public class GenericsPrac {

	public static void main(String[] args) {
//		Calculator cal = new Calculator();
//		boolean res = cal.areEqual(10.5, 10.5);
//		if(res) {
//			System.out.println("Nums are equal");
//		} else {
//			System.out.println("Nums are not equal");
//		}
		
		Calculator<Integer> cal2 = new Calculator<>();
		
		
	}

} //Generic class example
class Calculator<T>{
//	public boolean areEqual(int a , int b) {
//		if(a==b) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
	//take all values
	
	//General function
	public<E> boolean areEqual(T a,T b ) {
		if(a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
//	public boolean areEqual(Object a, Object b) {
//		if(a.equals(b)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}

package com.princeton;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a = 40;
		int b = 0;
		int c = 0;
		
		int[] excp = {0};
		//Arithmetic Exception ********************************
		try{	c = a/b;	}
		catch(ArithmeticException ex){	System.out.println(ex.getMessage());	}
		
		//Stack Overflow Exception practice ******************
		try {	func1();	}
		catch(StackOverflowError ex) {	System.out.println(ex.getMessage());	}
		
		//Out of Bounds Exception ****************************
		try {
			System.out.println(excp[10]);
		} catch (ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());
		}
		
		//IOExcetpion and File not found with example of final/finally
		BufferedReader buffRead = null;
		try {
			buffRead = new BufferedReader(new FileReader("data.text"));
		}
		catch (FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
		finally {
			if(buffRead != null) {
				try {
					buffRead.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//Generalized and multiple catch block with null pointer and NumberFormat Exception
		try {
			c = a/b;
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		catch (NullPointerException | NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
		 catch (Exception ex){
			 //A GENERAL CATCH BLOCK
			 System.out.println(ex.getMessage());
		 }
		
		//Try with resources******************
		try(FileOutputStream fos = new FileOutputStream("data.txt")){
			//custom string input
			String data = "Hello world";
			//Convert string to bytes
			byte[] arr = data.getBytes();
			//text written in file
			fos.write(arr);
		}
		//catch block
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("resources are closed successfully");
		
	}
	//END OF MAIN
	
	//try catch function layout and parameter style
	public void test(int a, int b) throws ArithmeticException, NullPointerException, IOException{
		
	}	
	public static void func1() {
		func2();
	}
	public static void func2() {
		func1();
	}
		//ArrayIndexOutOfBoundException *
		//StackOverFlowException  *
		//ClassCastException
		//IllegalArgumentException()  *
		//NumberFormatException  *
		//IllegalStateException
		//NoClassDefFoundException *
		//AssertException
		//ArithmaticException *
	
	//5 types of formats
	//1	//try catch for specific
	//2	//try catch with general catch
	//3	//try catch with finally
	//4	//try and finally with no catch
		//cant use catch alone

}

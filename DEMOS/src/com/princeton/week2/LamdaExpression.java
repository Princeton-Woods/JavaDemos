package com.princeton.week2;

interface Hello{ public String greeting();}

interface Welcome{ public String greeting(String name);}

interface Calculation{ public int addNumber(int a, int b);}

interface Say{ public void sayHello(String name);}

interface Math{ public void Mathematics(double x, double y, double z);}

public class LamdaExpression {

	public static void main(String[] args) {

        Hello hello = () -> {
            return "Welcome Guest";
        };

        System.out.println(hello.greeting());

        Welcome welcome = (name) -> {
            return "Welcome "+ name;
        };

        System.out.println(welcome.greeting("Paul"));

        Calculation calculation = (a, b) -> {
            return a + b;
        };

        System.out.println(calculation.addNumber(20, 30));

        Say say = (name) -> {
            System.out.println("Hello "+ name);
        };

        say.sayHello("Watson");
        
        Math math = (x,y,z) -> {
        	System.out.println(x+y+z);
        };
        math.Mathematics(3.5,4.8,5.2);
	}

}

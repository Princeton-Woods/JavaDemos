package com.princeton;
import java.util.Scanner;


public class IntrestCalculator {

	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scan = new Scanner(System.in);
		String choice;
		boolean validInput;
		
		//Console Colors Just for effect cause why not 

		
		
		while(menuSelection != 5) {
			//Menu variables resets every loop until Quit
			menuSelection = 0;
			choice = null;
			validInput = false;
			scan = new Scanner(System.in);
			
			System.out.println("Input your first number: ");
			double firstNum = InputCertification(scan);
			System.out.println("Input your second number: ");
			double secondNum = InputCertification(scan);
			
			System.out.println("Please select an option: ");   //Selection Text
			System.out.println("	1. Add");  	   //cups to gallons
			System.out.println("	2. Subtract");  //Miles to Kilos
			System.out.println("	3. Multiply");  //Pounds to kilos
			System.out.println("	4. Divide");	   //cups to liters
			System.out.println("	5. Quit");				   //Quit
			
			System.out.println("What will you choose: ");//Selection Text

			//Input validation loop
			while(validInput != true ) {
				choice = scan.nextLine();
				if(isNumeric(choice)) {
					menuSelection = Integer.parseInt(choice);
				
					if(menuSelection < 1 || menuSelection > 5) {
						System.out.println("Invalid Selection Try again: ");
						menuSelection = 0;
					} else {
						validInput = true;
					}
				} else {
					
					System.out.println("Input is not a number try again. ");
				}
			}
			switch(menuSelection) {
        	case 1:
        		System.out.println("The Addition is equal to: " + Add(firstNum, secondNum));
        		
        		break;
        	case 2:
        		System.out.println("The Subtraction is equal to: " + Sub(firstNum, secondNum));

        		break;
        	case 3:
        		System.out.println("The Multiplication is equal to: " + Mult(firstNum, secondNum));

        		break;
        	case 4: 
        		System.out.println("The Division is equal to: " + Div(firstNum, secondNum));

        		break;
        	case 5:
        		break;
	        }
		}
	}
	
	public static double Mult(double a, double b) {
		return a*b;
	}
	@SuppressWarnings("finally")
	public static double Div(double a, double b) {
		try {
            return (a / b);
        }
        catch (ArithmeticException e) {
        	System.out.println(e.getMessage());
        }
		finally {
            System.out.println("Divided by zero operation isnt possible");
            return -1;

		}
		
		//return a/b;
	}
	public static double Add(double a, double b) {
		return a+b;
	}
	public static double Sub(double a, double b) {
		return a-b;
	}
    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
    public static double InputCertification(Scanner scan) {
    	String amount;
    	double converted;
    	boolean validInput = false;
    	while(validInput != true ) 
    	{	
    		amount = scan.nextLine();
    		if(isNumeric(amount)) {
				converted = Double.parseDouble(amount);
				validInput = true;
				return converted;

			} else {
				System.out.println("\u001B[31m" + "Input is not a number try again. " + "\u001B[0m");
			}
    	}
    	return 0.0;
    }
}

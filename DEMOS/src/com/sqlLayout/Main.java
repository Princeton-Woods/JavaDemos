package com.sqlLayout;
import java.sql.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee employee = new Employee();
		employee.setName("Stacy");
        employee.setEmail("s@gmail.com");

        // Employee Dao1
        EmployeeDAO dao =  EmployeeDAOFactory.getEmployeeDao();
        dao.addEmployee(employee);
		
		//Variables
		int menuSelection = 0;
		Scanner scan = new Scanner(System.in);
		String choice;
		boolean validInput;
		
		//Console Colors Just for effect cause why not 
		final String Text_Reset = "\u001B[0m";
		final String Text_Red = "\u001B[31m";
		final String Text_Green = "\u001B[32m";
		final String Text_Yellow = "\u001B[33m";
		final String Text_Purple = "\u001B[35m";
		final String Text_Cyan = "\u001B[36m";
		
		while(menuSelection != 6) {
			//Menu variables resets every loop until Quit
			menuSelection = 0;
			choice = null;
			validInput = false;
			scan = new Scanner(System.in);
			
			System.out.println(Text_Reset + Text_Yellow + "Please select an option: " + Text_Reset);
			System.out.println(Text_Purple +"	1. Add Employee " + Text_Reset);  	
			System.out.println(Text_Purple +"	2. Edit Employee" + Text_Reset);  
			System.out.println(Text_Purple +"	3. Delete Employee" + Text_Reset); 
			System.out.println(Text_Purple +"	4. Get Employee"+ Text_Reset);	
			System.out.println(Text_Purple +"	5. Get Employee By ID"+ Text_Reset);	
			System.out.println(Text_Red +"	6. Quit" + Text_Reset);				   //Quit
			
			System.out.println(Text_Green + "What will you choose: " + Text_Reset);//Selection Text
			//Menu input validation loop
			while(validInput != true ) {
				choice = scan.nextLine();
				if(isNumeric(choice)) {
					menuSelection = Integer.parseInt(choice);
					if(menuSelection < 1 || menuSelection > 6) {
						System.out.println(Text_Red + "Invalid Selection Try again: " + Text_Reset);
						menuSelection = 0;
					} else {	validInput = true;	}
				} else {	
					System.out.println(Text_Red + "Input is not a number try again. " + Text_Reset);	
				}
			}

			//Switch case based on input
	        switch(menuSelection) {
        	case 1:
        		System.out.println("Add");
        		System.out.println();
        		break;
        	case 2:
        		System.out.println("Update");
        		System.out.println();
        		break;
        	case 3:
        		System.out.println("Delete");
        		System.out.println();
        		break;
        	case 4: 
        		System.out.println("Get");
        		System.out.println();
        		break;
        	case 5: 
        		System.out.println("Get by ID");
        		System.out.println();
        		break;
        	case 6:
        		System.out.println(Text_Cyan + "You have quit. Goodbye!" + Text_Reset);
        		break;
	        }
		}
		//Closes Scanner after leaving Menu while loop
	scan.close();
	}
	public static boolean isNumeric(String str){
	    return str != null && str.matches("[0-9.]+");
	}
	//Verifies input uses While loop and calls isNumeric func.
	public static int inputCertification(Scanner scan) {
		String amount;
		int converted;
		boolean validInput = false;
		while(validInput != true ) 
		{	
			amount = scan.nextLine();
			if(isNumeric(amount)) {
				converted = Integer.parseInt(amount);
				validInput = true;
				return converted;
	
			} else {
				System.out.println("\u001B[31m" + "Input is not a number try again. " + "\u001B[0m");
			}
		}
		return 0;
	}

		
}


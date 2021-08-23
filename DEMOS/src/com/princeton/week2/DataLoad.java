package com.princeton.week2;

import java.sql.*;

public class DataLoad {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/";
		String database = "revature";
		String connectionstr = url + database;
		String username = "root";
		String password = "Zplasm123";
		
		Connection conn = DriverManager.getConnection(connectionstr, username, password);
		//Create table 
		String query = "create table employee (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email Char(20) )";
		Statement state = conn.createStatement();	
		state.executeUpdate(query);
		
		//inset statement ************************************************
//		String q = "insert into employee (name,email) values (?,?)";
//		//Get PrepareStatement object
//		PreparedStatement prepstat = conn.prepareStatement(q);
//		//set the values in query
//		prepstat.setString(2, "Mark Smith");
//		prepstat.setString(3, "m@gmail.com");
//		//to execute and update the query
//		int rowsAffected = prepstat.executeUpdate();
//		System.out.println("Rows affected: " + rowsAffected);
		
		
//		//update table data **********************************************
//		String qu = "update employee set name = ?, email = ?, where id = ?";
//		PreparedStatement prepstat = conn.prepareStatement(qu);
//		prepstat.setString(1, "Paul");
//		prepstat.setString(2, "p@gmail.com");
//		prepstat.setInt(3, 1);
//		int rowsAffected = prepstat.executeUpdate();
//		System.out.println("Rows affected: " + rowsAffected);
		
		
		
//		//Delete from table ***********************************************
//		String qu = "delete from employee where id = ?";
//		PreparedStatement prepstat = conn.prepareStatement(qu);
//		prepstat.setInt(1, 1);
//		int rowsAffected = prepstat.executeUpdate();
//		System.out.println("Rows affected: " + rowsAffected);
		
		//Read Data******************************************************
		String q = "select * from employee";
		ResultSet resset = state.executeQuery(q);
		while(resset.next()) {
			int id = resset.getInt(1);
			String name = resset.getString(2);
			String email = resset.getString(3);
			
			//just use a sout to print the strings
		}
		
		
		
		
		
		
		
		
		conn.close();
		if(conn.isClosed()) {
			System.out.println("Connection Closed");
		}else {
			System.out.println("Connection Opened");
		}
		
		
		
		
		
		
	}
}

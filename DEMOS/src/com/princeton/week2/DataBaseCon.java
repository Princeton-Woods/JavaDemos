package com.princeton.week2;
import java.sql.*;




	//create new directory and put the jar inside 
	//add jar as dependency 
public class DataBaseCon {

	public static void main(String[] args) throws SQLException {
	//Order of Steps
		//Class.forName(null);
		//Class.getConnection(String url, String name, String password);
		//Class.createStatement();
		//Class.executeQuery(String sql);
		//close();
		
		//Class.forName("");
		
																					//INPUT DATABASE NAME
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseName", "root", "root");

		Statement statement = (Statement) conn.createStatement();
		
		ResultSet res = statement.executeQuery("sdnsaiodas"); //.executeQuery("select * from employee"); USED AS A SELECT STATEMENT to get the value
		statement.executeUpdate(null); //use to execute specified query can create drop update insert and delete 
		while (res.next()) {
            System.out.println("Id: " + res.getInt(1) + ", Name: "
                    + res.getString(2) + ", Email: " + res.getString(3));
        }
		//insert into employee values (1,'mark','m@gmail.com')
		//insert into employee values (?,?,?)
		//we can pass values for the ?
		
		
		
		
		conn.close();
		
		
		
		
		

	}

}

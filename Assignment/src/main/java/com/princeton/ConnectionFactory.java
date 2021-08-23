package com.princeton;
import java.sql.*;

public class ConnectionFactory {
	private static Connection connection = null;

    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (connection == null) {

            String url = "jdbc:mysql://localhost:3306/webusers";
            String username = "root";
            String password = "Zplasm123";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}

package com.princeton;
import java.io.PrintWriter;
import java.sql.SQLException;
public interface UserDAO {
    void addUser(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
    void deleteUser(String email) throws SQLException;
	public void getUsers(PrintWriter out)  throws SQLException;
}

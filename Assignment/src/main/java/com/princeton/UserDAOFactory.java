package com.princeton;
import java.sql.*;
public class UserDAOFactory {
	
	private static UserDAO dao;
	
    public static UserDAO getUserDao(){
        if(dao==null)
            dao = new UserImpl();
        return dao;
    }
}

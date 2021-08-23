package com.sqlLayout;

public class EmployeeDAOFactory {
	private static EmployeeDAO dao;

    private EmployeeDAOFactory(){}

    public static EmployeeDAO getEmployeeDao(){
        if(dao==null)
            dao = new EmployeeImpl();
        return dao;
    }
}

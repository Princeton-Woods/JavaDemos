package com.princeton.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac = cfg.buildSessionFactory();
        Session ses = fac.openSession();
        Transaction tran = ses.beginTransaction();
        
        
        Employee emp = new Employee(1,"mark","m@gmail.com");
        //save transaction
        ses.save(emp);
        tran.commit();
        
        //close
        ses.close();
        
//        System.out.println(fac);
//        System.out.println(fac.isClosed());
    }
}

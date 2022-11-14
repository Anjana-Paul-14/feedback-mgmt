/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class dbconnection {
    
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
                        Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","");
                        System.out.println("connected rin");
		}
		catch(Exception e)
		{
			System.out.println("class dbconnection"+e.getMessage());
		}
		return con;
	}

public static void main(String args[])
{
    
    dbconnection d=new dbconnection();
    getconnection();
    
}
}


package com.cg.pluralsight.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionUsingDriver {
	public boolean tryConnection() throws Exception {
		Connection connection  =DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Lavanya@1");
		
		boolean isValid = connection.isValid(2);
		return false;
		
	}

}

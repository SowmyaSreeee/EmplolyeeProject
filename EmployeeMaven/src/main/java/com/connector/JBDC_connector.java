package com.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDC_connector {
	private static final String URL = "jdbc:mysql://localhost:3306/wipro";
	private static final String USER = "root";
	private static final String PASSWORD = "Sree@2002";
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}	

}
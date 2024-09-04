package com.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeJDBC {
	private static final String URL = "jdbc:mysql://localhost:3306/wipro";
	private static final String USER = "root";
	private static final String PASSWORD = "Sree@2002";
	private static Connection connection;
	private static Statement statement;

	public static void main(String[] args) {
		try {
			connect();
			readEmployee();
			createEmployee("Tiyasa","Manager",450000);
			updateEmployee(4, "Ahana","Clerk",25000);
			deleteEmployee(3);
			findEmployeeById(2);
			showMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void connect() throws SQLException {
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
		statement = connection.createStatement();
		System.out.println("Connection establised.");
	}
	public static void createEmployee(String name,String position,double salary) throws SQLException{
		String sql = "Insert into Employee (name,position,salary) values (?,?,?)";
		try(PreparedStatement pstmt = connection.prepareStatement(sql)){
			pstmt.setString(1, name);
			pstmt.setString(2, position);
			pstmt.setDouble(3, salary);
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Created employee, rows affected:  " + rowsAffected);

		}
	}
	private static void readEmployee() {
		String sql = "select * from Employee";
		try {
			ResultSet rs = statement.executeQuery(sql);{
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String position = rs.getString("position");
					double salary = rs.getDouble("salary");
					System.out.println("ID: " + id + " Name: " + name + " Position: " + position + " Salary: " + salary);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void updateEmployee(int id,String name,String position,double salary) throws SQLException{
		String sql = "UPDATE employee Set name = ?, position = ?,salary = ? where id = ?";
		try(PreparedStatement pstmt = connection.prepareStatement(sql)){
		pstmt.setString(1, name);
		pstmt.setString(2, position);
		pstmt.setDouble(3, salary);
		pstmt.setInt(4, id);
		int rowsAffected = pstmt.executeUpdate();
		System.out.println("Updated Employee, rows affected: " + rowsAffected);
		}
	}
	private static void deleteEmployee(int id) throws SQLException{
		String sql = "Delete from Employee where id = ?";
		try(PreparedStatement pstmt = connection.prepareStatement(sql)){
			pstmt.setInt(1, id);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Deleted Employee, rows affected: " + rowsAffected);
			}
	}
	private static void findEmployeeById(int id) throws SQLException{
		Connection connection = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
			String callProcedure ="{CALL GetEmployeeById3(?)}";
			cstmt = connection.prepareCall(callProcedure);
			cstmt.setInt(1, id);
			rs = cstmt.executeQuery();
			if(rs.next()) {
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				String position = rs.getString("position");
				double salary = rs.getDouble("salary");
				System.out.printf("ID: %d,Name: %s,Position: %s,Salary: %2f%n",id,name,position,salary);
			}else {
				System.out.println("No employee found with ID " + id);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!= null) rs.close();
				if(cstmt!= null) cstmt.close();
				if(connection!= null) connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void showMetaData() throws SQLException{
		try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
			DatabaseMetaData metaData = connection.getMetaData();
			
			String tableName = "Employee";
			try(ResultSet columns = metaData.getColumns(null, null, tableName, null)){
				System.out.println("Metadata for table: " + tableName );
				System.out.println("-------------------------------");
				while(columns.next()) {
					String columnName = columns.getString("COLUMN_NAME");
					String columnType = columns.getString("TYPE_NAME");
					int columnSize = columns.getInt("COLUMN_SIZE");
					int nullable = columns.getInt("NULLABLE");
					boolean isNullable = (nullable == DatabaseMetaData.columnNullable);
					String isNullableStr = isNullable? "YES" : "NO";
					System.out.printf("Column Name: %-15s Type: %10s | Size: %-5d | Nullable: %-3s%n" , columnName,columnType,columnSize,isNullableStr);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}



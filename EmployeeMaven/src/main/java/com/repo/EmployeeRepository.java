package com.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connector.JBDC_connector;
import com.exception.EmployeeNotFoundException;
import com.model.Employee;

public class EmployeeRepository {
   
	public void createEmployee(Employee emp) {
	    String sql = "INSERT INTO Employee (name, salary) VALUES (?, ?)";
	    try (Connection connection = JBDC_connector.getConnection();
	         PreparedStatement pstmt = connection.prepareStatement(sql)) {
	        System.out.println("Inserting employee: Name = " + emp.getName() + ", Salary = " + emp.getSalary());
	        pstmt.setString(1, emp.getName());
	        pstmt.setDouble(2, emp.getSalary());  // Ensure this line is correctly setting the second parameter
	        
	        int rowsAffected = pstmt.executeUpdate();
	        
	    } catch (SQLException e) {
	        System.out.println("Error during insert: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


    public List<Employee> findAllEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        String sql = "select * from Employee";
        try(Connection connection = JBDC_connector.getConnection();
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery(sql))
        {
        	while(rs.next()) {
        		//int id = rs.getInt("id");
        		Employee emp = new Employee(rs.getInt("id"), rs.getString("name"),rs.getDouble("salary"));
        		employees.add(emp);
        	}
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return employees;
    }

    public void deleteEmployee(int id) {
        String sql = "delete from employee where id = ?";
        try(Connection connection = JBDC_connector.getConnection();
            	PreparedStatement pstmt = connection.prepareStatement(sql)) {
        	pstmt.setInt(1, id);
        	int rowsAffected = pstmt.executeUpdate();
        	if(rowsAffected == 0) {
        		throw new EmployeeNotFoundException("EmployeeNotFound: Employee with id " + id + " not found");
        	}
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Employee findEmployeeById(int id) {
        String sql = "select * from Employee where id = ?";
        try(Connection connection = JBDC_connector.getConnection();
            	PreparedStatement pstmt = connection.prepareStatement(sql)) {
        	pstmt.setInt(1, id);
        	try(ResultSet rs = pstmt.executeQuery()){
        		if(rs.next())
        			return new Employee(rs.getString("name") , rs.getDouble("salary"));
        		else
        			throw new EmployeeNotFoundException("EmployeeNotFound: Employee with id " + id + " not found");
            
        	}
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

    public Employee updateEmployee(Employee updatedEmployee, int id) {
        String sql = "UPDATE employees SET name = ?, salary = ? WHERE id = ?";
        try (Connection conn = JBDC_connector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
               pstmt.setString(1, updatedEmployee.getName());
               pstmt.setDouble(2, updatedEmployee.getSalary());
               pstmt.setInt(3, id);
               int rowsAffected = pstmt.executeUpdate();
               if (rowsAffected == 0) {
                   throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
               }
               return updatedEmployee;
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return null;
    }
}
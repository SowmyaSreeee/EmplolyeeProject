package com.driver;

import java.util.List;
import java.util.Scanner;

import com.exception.EmployeeNotFoundException;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeDriver {
    private static EmployeeService employeeService = new EmployeeService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Find Employee by ID");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        viewAllEmployees();
                        break;
                    case 3:
                        deleteEmployee();
                        break;
                    case 4:
                        updateEmployee();
                        break;
                    case 5:
                        findEmployeeById();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (EmployeeNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void addEmployee() {
        try {
            
            System.out.print("Enter Employee Name: ");
            String name = scanner.next();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(name, salary);
            employeeService.newEmployee(employee);
            System.out.println("Employee added successfully.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid data.");
            scanner.next(); // clear the invalid input
        }
    }

    private static void viewAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    private static void deleteEmployee() {
        try {
            System.out.print("Enter Employee ID to delete: ");
            int id = scanner.nextInt();
            employeeService.removeEmployee(id);
            System.out.println("Employee deleted successfully.");
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void updateEmployee() {
        try {
            System.out.print("Enter Employee ID to update: ");
            int id = scanner.nextInt();
            System.out.print("Enter new Employee Name: ");
            String name = scanner.next();
            System.out.print("Enter new Employee Salary: ");
            double salary = scanner.nextDouble();

            Employee updatedEmp =new Employee(name, salary);
            Employee result = employeeService.updateEmployee(updatedEmp);
            System.out.println("Employee updated successfully.");
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid data.");
            scanner.next(); // clear the invalid input
        }
    }

    private static void findEmployeeById() {
        try {
            System.out.print("Enter Employee ID to search: ");
            int id = scanner.nextInt();
            Employee emp = employeeService.getEmployeeById(id);
            System.out.println(emp);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
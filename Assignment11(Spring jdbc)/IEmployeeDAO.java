package com.java.prac.Dao;

import java.util.List;

import com.java.prac.model.Employee;

public interface IEmployeeDAO 
{
	Employee getEmployeeById(Integer id);
	List<Employee> getAllEmployee();
	boolean deleteEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean insertEmployee(Employee employee);
	
}

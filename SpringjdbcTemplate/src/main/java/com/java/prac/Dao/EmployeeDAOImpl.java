package com.java.prac.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.java.prac.model.Employee;
import com.java.prac.model.EmployeeMapper;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO
{
	@Autowired
	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_EMPLOYEE="select * from employee where id=?";
	private final String SQL_DELETE_EMPLOYEE="delete from employee where id=?";
	private final String UPDATE_EMPLOYEE="update employee set name=? , contact=? where id=?";
	private final String SQL_SELECT_ALL="select * from employee";
	private final String SQL_INSERT_EMPLOYEE="insert into employee values(?,?,?)";
	
	public Employee getEmployeeById(Integer id) 
	{
		return jdbcTemplate.queryForObject(SQL_FIND_EMPLOYEE, new Object[]{id}, new EmployeeMapper());	
	}

	public List<Employee> getAllEmployee() {
		return jdbcTemplate.query(SQL_SELECT_ALL, new EmployeeMapper());
	}

	public boolean deleteEmployee(Employee employee) {
		return jdbcTemplate.update(SQL_DELETE_EMPLOYEE,employee.getId())>0;
	}

	public boolean updateEmployee(Employee employee) {
		return jdbcTemplate.update(UPDATE_EMPLOYEE,new Object[] {employee.getId(),employee.getName(), employee.getContact()})>0;
	}

	public boolean insertEmployee(Employee employee) {
		return jdbcTemplate.update(SQL_INSERT_EMPLOYEE, new Object[] {employee.getId(),employee.getName(),
				employee.getContact()})>0;
	}

}

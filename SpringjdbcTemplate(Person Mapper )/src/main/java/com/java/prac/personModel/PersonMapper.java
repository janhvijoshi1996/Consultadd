package com.java.prac.personModel;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person>
{

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Person person=new Person();
		person.setName(rs.getString("name"));
		person.setSurname(rs.getString("surname"));
		person.setAge(rs.getInt("age"));
		person.setId(rs.getInt("id"));
		
		return person;
	}

}

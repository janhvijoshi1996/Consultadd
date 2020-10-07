package com.java.prac.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.java.prac.personModel.Person;
import com.java.prac.personModel.PersonMapper;

@Component
public class PersonDAOImpl  implements IPersonDAO
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	private String ALL_DETAILS="select *from person";
	private String INSERT_PERSON="insert into person values(?,?,?,?)";
	private String GET_DETAILS="select *from person where id=?";

	public List<Person> listAllPerson() {
		return jdbcTemplate.query(ALL_DETAILS, new PersonMapper());
	}

	public boolean insertPerson(Person person) {
		return jdbcTemplate.update(INSERT_PERSON, new Object[] {person.getName(),person.getSurame(),person.getAge()
				,person.getId()})>0;
	}

	public Person getPersonById(Integer id) {
		
		return jdbcTemplate.queryForObject(GET_DETAILS, new Object[] {id},new PersonMapper());
	}

}

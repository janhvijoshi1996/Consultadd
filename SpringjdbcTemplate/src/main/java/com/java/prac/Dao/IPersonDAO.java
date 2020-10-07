package com.java.prac.Dao;

import java.util.List;

import com.java.prac.personModel.Person;

public interface IPersonDAO
{
	List<Person> listAllPerson();
	boolean insertPerson(Person person);
	Person getPersonById(Integer id);
}

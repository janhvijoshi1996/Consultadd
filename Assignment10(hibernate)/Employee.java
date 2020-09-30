package com.prac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Employee")
public class Employee
{
	@Id 
	@Column(name="id")
	public int id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="contact")
	public String contact;
	
	public Employee()
	{
		System.out.println("default constructor");
	}
	public Employee(int id,String name,String contact)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return this.contact;
	}
}

package com.java.prac.model;

public class Employee
{
	private int id;
	private String name;
	private String contact;
	
	public Employee(int id, String name, String contact)
	{
		this.id=id;
		this.name=name;
		this.contact= contact;
	}
	public Employee(){}
	
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
	@Override
	public String toString()
	{
		return ("employee-Id-"+this.id+" name-"+this.name+" contact-"+this.contact);
	}
	 
}

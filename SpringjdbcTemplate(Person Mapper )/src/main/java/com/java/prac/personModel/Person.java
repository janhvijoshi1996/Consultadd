package com.java.prac.personModel;

public class Person
{
	private String name;
	private String surname;
	private int age;
	private int id;
	
	public Person() {}
	public Person(String name,String surname,int age,int id)
	{
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSurname(String surname)
	{
		this.surname=surname;
	}
	public String getSurame()
	{
		return this.surname;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	
	@Override
	public String toString()
	{
		return "person_name:"+this.name+"\t surname:"+this.surname+"\t age:"+this.age+"\t id:"+this.id;
	}
}

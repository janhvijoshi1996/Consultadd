package com.prac.manager;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prac.model.Employee;


public class ManagerEmployee
{
	public static SessionFactory factory;
	public static void main(String[] args) 
	{
		factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
   	  	tx=session.beginTransaction();
   	  	String choice="x";
   	  	Scanner sc=new Scanner(System.in);
	  	while(!choice.equals("0"))
		{
		  	System.out.println("select your operation--");
	  	  	System.out.println("-------1. List the data-------");
	  	  	System.out.println("-------2. Add new data--------");
	  	  	System.out.println("-------3. Delete data--------");
	  	  	System.out.println("-------0. Exit---------------");
	  	  	choice=sc.next();
		  		switch (choice) 
	  	  	{
			case "1":listData();
				break;
	
			case "2":
				{
					System.out.println("enter ID----");
					int id=sc.nextInt();
					System.out.println("enter name---");
					String name=sc.next();
					System.out.println("enter contact---");
					String contact=sc.next();
					addData(id,name, contact);
					break;
				}
				
			case "3":
				{
					System.out.println("enter ID to delete the row ");
					Integer empId=sc.nextInt();
					deleteData(empId);
					break;
				}
	  	  	}
	  	}
}

	public static void listData()
	{
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			List<Employee> employees=session.createQuery("from Employee").list();
			System.out.println("ID        Name        Contact");
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) 
			{
				Employee employee = (Employee) iterator.next();
				System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getContact());
			}
			tx.commit();
		}catch(HibernateException e)
		{
			System.out.println("HibernateException");
			if (tx!=null) 
			{
				tx.rollback();
			}
		}
		finally {
			session.close();
		}

	} 
	public static int addData(int id,String name, String contact)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		Integer employeeId=null;
		try
		{
			
			tx=session.beginTransaction();
			Employee employee=new Employee(id,name, contact);
			System.out.println("data is inserting");
			employeeId=(Integer) session.save(employee);
			tx.commit();
		}
		catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("hibernate exception occur");
			if (tx!=null)
			{
				tx.rollback();
			}
		}
		finally
		{
			session.close();
		}
		
		return employeeId;
	}
	
	public static void deleteData(Integer empId)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		try
		{
			tx=session.beginTransaction();
			Employee employee=session.get(Employee.class, empId);
			session.delete(employee);
			tx.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("hibernate exception occur");
			if (tx!=null)
			{
				tx.rollback();
			}
		}
		finally
		{
			session.close();
		}
	}
}

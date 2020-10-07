package com.java.prac.main;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.prac.Dao.IEmployeeDAO;
import com.java.prac.config.AppConfig;
import com.java.prac.model.Employee;

public class Main 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployeeDAO employeedao=context.getBean(IEmployeeDAO.class);
		
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		while(choice!=6)
		{	
			System.out.println("**********Select you Option***************");
			System.out.println("1. List all the employee.");
			System.out.println("2. Insert employee.");
			System.out.println("3. Update employee.");
			System.out.println("4. show data of particular employee");
			System.out.println("5. Delete employee data.");
			System.out.println("6. EXIT");
			choice=sc.nextInt();
			switch (choice)
			{
				case 1:
				{
					System.out.println("List of Employees-----");
					for (Employee emp : employeedao.getAllEmployee())
					{
						System.out.println(emp);
					}
					break;
				}
				case 2:
				{
					System.out.println("insert employee----");
					Employee emp=new Employee(7,"chotu","9876543210");
					employeedao.insertEmployee(emp);
					for (Employee emp1 : employeedao.getAllEmployee())
					{
						System.out.println(emp1);
					}
					break;
				}
				case 3:
				{
					System.out.println("Update employee");
					Employee emp2=employeedao.getEmployeeById(6);
					System.out.println(emp2.getName()+"\t"+emp2.getContact());
					emp2.setName("nikku");
					emp2.setContact("1234567890");
					employeedao.updateEmployee(emp2);
					System.out.println("Updated employee details--");
					System.out.println(emp2.getId()+"\t"+emp2.getName()+"\t"+emp2.getContact());
					break;
				}
				case 4:
				{
					System.out.println("show employee details");
					int x=sc.nextInt();
					Employee emp3=employeedao.getEmployeeById(x);
					System.out.println("empID:"+emp3.getId()+"\t Name:"+emp3.getName()+"\t contact:"+emp3.getContact());
					break;
				}
				case 5:
				{
					Employee emp3=employeedao.getEmployeeById(5);
					employeedao.deleteEmployee(emp3);
					System.out.println("delete successfully");	
					break;
				}
				case 6:
					break;
					
			}
		}
	}
}

package com.prac.core.Assignment;

import java.util.Scanner;

public class DriverAssign 
{
	Assign1_3 as=new Assign1_3();
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1-->");
		int number1=sc.nextInt();
		System.out.println("enter the number2-->");
		int number2=sc.nextInt();
		//Swapping sw=new Swapping(number1, number2);
		//sw.swapping();
		DriverAssign da=new DriverAssign();
		da.check(number1, number2);
	}
	public void check(int number1,int number2)
	{
		if (number1>=1&&number1<=10&&number2>=1&&number2<=10) 
		{
			
			System.out.println("Result is-->"+as.performAdd(number1, number2));
		}
		else
		{
			Scanner s=new Scanner(System.in);
			System.out.println("again enter number1-->");
			number1=s.nextInt();
			System.out.println("again enter number2-->");
			number2=s.nextInt();
			check(number1, number2);
			
		}
	}
}

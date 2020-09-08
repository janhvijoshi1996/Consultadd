package com.prac.core.Assignment;

import java.util.Scanner;

public class Task2 
{
	private static int number;
	
	public static void main(String[] args) 
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(checkNumb(number));
		
	}
	public static String checkNumb(int number)
	{
		if (number%3==0&&number%5==0)
		{
			return "ConsultAdd java training";
		}
		else if(number%3==0)
		{
			return "ConsultAdd";
		}
		else if(number%5==0) 
		{
			return "JAVA training";
		}
		else
			return"sample number";
	}
}

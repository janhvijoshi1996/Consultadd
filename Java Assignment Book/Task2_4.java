package com.prac.core.Assignment;

import java.util.Scanner;


public class Task2_4
{
	private static int number; 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		number=sc.nextInt();
		while(true)
		{
			if(number>=0)
			{
				System.out.println("Good Going");
				number=sc.nextInt();
				continue;
			}
			else
			{
				System.out.println("It's OVER");
				break;
			}
		}
	}
}

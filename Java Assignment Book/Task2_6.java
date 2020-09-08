package com.prac.core.Assignment;

import java.util.Scanner;

public class Task2_6 
{
	public static void main(String[] args)
	{
		Scanner ac=new Scanner(System.in);
		System.out.println("enter number");
		int number=ac.nextInt();
		if((number%2==1)||(number%2==0&&number>=6&&number<=30))
		{
			System.out.println("NEW");
		}
		else if((number%2==0&&((number>=2&&number<=5))||(number>30)))
		{
			System.out.println("OLD");
		}
	}
}

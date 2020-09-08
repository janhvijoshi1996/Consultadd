package com.prac.core.Assignment;

import java.util.Scanner;

public class Task3_4 
{
	public static void main(String[] args)
	{
		System.out.println("enter any natural number-->");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		for (int i = 0; i <=number; i++)
		{
			sum=i+sum;
		}
		System.out.println("the sum of all the natural number till given number is -->"+sum);
	}
}

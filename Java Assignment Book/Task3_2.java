package com.prac.core.Assignment;

import java.util.Scanner;

public class Task3_2
{
	public static void main(String[] args) {
		
		System.out.println("enter 10 numbers-");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 10; i++)
		{
			sum=sc.nextInt()+sum;
		}
		System.out.println("sum of given 10 number is-->"+sum);
		System.out.println("Average of the numbers is-->"+sum/10);
	}
}
